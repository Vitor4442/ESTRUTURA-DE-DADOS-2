import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // Declaração de variáveis
        Scanner sc = new Scanner(System.in);
        Btree p = new Btree();
        int ID;
        String NOME;
     
        // Execução do programa principal
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            String linha = sc.nextLine();
            String[] partes = linha.split(" "); 

            String operacao = partes[0];

            switch (operacao) {

                case "INSERIR":
                    ID = Integer.parseInt(partes[1]);
                    NOME = partes[2];
                
                    Double[] notas = new Double[4];
                    int contadorNotas = 0;
                    int lidas = partes.length-1;

                    if(lidas > 6){
                        lidas = 6;
                    }
                    
                    for (int j = 3; j <= lidas; j++) {
                        try {
                            Double nota = Double.parseDouble(partes[j]);
                            if (contadorNotas < 4) {
                                notas[contadorNotas] = nota;
                                contadorNotas++;
                            }
                        } catch (NumberFormatException e) {
                            break; 
                        }
                    }

                    
                    Aluno a = new Aluno(ID, NOME, notas);
                    System.out.println("Aluno com o ID " + ID + " inserido com sucesso.");
                    p.add(a);
                    break;

                case "BUSCAR":
                    ID = Integer.parseInt(partes[1]);
                    p.buscar(ID);
                    break;

                case "LISTAR_POR_ID":
                    p.show();
                    break;

                case "ATUALIZAR_NOTAS":
                    int Id_busca = Integer.parseInt(partes[1]);
                    Double[] NOTA = new Double[4]; 
                    int ContadorNotas = 0;

                    
                    for (int j = 2; j < partes.length; j++) {
                        try {
                            Double nota = Double.parseDouble(partes[j]);
                            if (ContadorNotas < 4) {
                                NOTA[ContadorNotas] = nota;
                                ContadorNotas++;
                            }
                        } catch (NumberFormatException e) {
                            break; 
                        }
                    }

                    
                    p.atualizar_nota(Id_busca, NOTA);
                    break;

                default:
                    System.out.println("Operação inválida.");
            }
        }
        sc.close();
    }
}
