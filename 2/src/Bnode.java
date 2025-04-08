public class Bnode {
    private Aluno x;
    private Bnode esq, dir;

    public Bnode(Aluno a){
        this.x = new Aluno(a);
        this.esq = this.dir = null ;
    }

    //metodo para adicionar os alunos em ordem crescente 
    public void addAluno(Aluno a){
        if (a.getID() < x.getID()){
            if(esq!=null){
                esq.addAluno(a);
            }
            else{
                esq = new Bnode(a);
            }
        }
        else{
            if(dir!=null){
                dir.addAluno(a);
            }
            else{
                dir = new Bnode(a);
            }
        }
    }

    //metodo para ver o Aluno;
    public void show() {
        if (esq != null) {
            esq.show();
        }
        
    
        System.out.print("ID do aluno: " + x.getID() + ", Nome do aluno: " + x.getNome() + ", Notas: ");
        
        Double[] notas = x.getNotas(); 
        for (Double nota : notas) {
            if (nota != null) {
                System.out.print(nota + " ");  
            }
        }
    
        System.out.println();  
    
        if (dir != null) {
            dir.show();
        }
    }

    //metodo para buscar o livro
    public void buscar(int iD_buscar) {
        if (iD_buscar > x.getID()) {
            if (dir != null) {
                dir.buscar(iD_buscar);
            } else {
                System.out.println("Aluno com o ID " + iD_buscar + " não encontrado.");
            }
        } else if (iD_buscar < x.getID()) {
            if (esq != null) {
                esq.buscar(iD_buscar);
            } else {
                System.out.println("Aluno com o ID " + iD_buscar + " não encontrado.");
            }
        } else {
          
            
            System.out.print("ID do aluno: " + x.getID() + ", Nome do aluno: " + x.getNome() + ", Notas: ");
            Double[] notas = x.getNotas();
            for (Double nota : notas) {
                if (nota != null) {
                    System.out.print(nota + ", ");
                }
            }
    
            System.out.println();  
        }
    }
    

      public void atualizar_nota(int Id_busca, Double[] novasNotas) {
        if (Id_busca < x.getID()) {
            if (esq != null) {
                esq.atualizar_nota(Id_busca, novasNotas);
            }
        } else if (Id_busca > x.getID()) {
            if (dir != null) {
                dir.atualizar_nota(Id_busca, novasNotas);
            }
        } else {
            x = new Aluno(x.getID(), x.getNome(), novasNotas);
            System.out.println("Notas do aluno com ID " + x.getID()+" atualizadas com sucesso.");
        }
    }
    
    

}