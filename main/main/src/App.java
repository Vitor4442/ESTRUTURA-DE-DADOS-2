import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {

        //declaração de variaveis
        Scanner sc = new Scanner (System.in);
        Btree p = new Btree();
        String livro, autor, Isbn;
        int escolha = 0;
     
    //execução do programa principal
    int n = Integer.parseInt(sc.nextLine());
    
    for(int i = 0; i < n; i++){
        String linha = sc.nextLine();
        String[] partes = linha.split(" ", 3); 

        String operacao = partes[0];

        switch(operacao) {
            
            case "INSERIR" :
                Isbn = partes[1];
                String [] autor_livro = partes[2].split("\" \"");
                livro = autor_livro[0].substring(1); 
                autor = autor_livro[1].substring(0, autor_livro[1].length() - 1); 
                
                Livro l = new Livro(Isbn, livro, autor);
                System.out.println("Livro com ISBN " + Isbn + " inserido com sucesso.");
                p.add(l);
            break;

            case "BUSCAR" :
                Isbn = partes[1];
                p.buscar(Isbn);
            break;

            case "LISTAR_POR_ISBN" :
                p.show();
            break;

            default:
            System.out.println("Operação inválida.");
        }
    }
    sc.close();
}

}