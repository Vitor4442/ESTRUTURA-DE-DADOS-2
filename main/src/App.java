import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {

        //declaração de variaveis
        Scanner sc = new Scanner (System.in);
        Btree p = new Btree();
        String livro, autor, Isbn;
        int escolha = 0;
     
    //execução do programa principal
    while (escolha != 4) {
        
        System.out.println("O que voce deseja fazer ?");
        System.out.println("1. INSERIR <ISBN> \"<TÍTULO>\" \"<AUTOR>\"");
        System.out.println("2. BUSCAR <ISBN>");
        System.out.println("3. LISTAR_POR_ISBN");
        System.out.println("4. Sair");

        escolha = sc.nextInt();
        sc.nextLine();

        switch (escolha) {
            case 1:
                System.out.println("Insira os dados do novo livro:");

                Isbn = sc.nextLine();

                livro = sc.nextLine();
            
                autor = sc.nextLine();
           

                Livro novoLivro = new Livro(Isbn, livro, autor);

                p.add(novoLivro);

                System.out.println("Livro inserido com sucesso!");

                break;

            case 2:

                System.out.println("insira o ISBN que deseja procurar: ");  
                Isbn = sc.nextLine(); 
                p.buscar(Isbn);
                
                break;

            case 3:
                p.show();

                break;
            
            case 4:
                System.out.println("Saindo do programa...");
                break;
            default:
        }

    }
    sc.close();
}

}
