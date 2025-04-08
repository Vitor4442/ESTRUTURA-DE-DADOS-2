public class Aluno {
    
    private int ID;
    private String nome;
    private Double[] notas = new Double [4];
    
    public Aluno(Aluno a) {
        this.ID = a.getID();
        this.nome = a.getNome();
        this.notas = a.getNotas();
    }

    
    public Aluno(int ID, String nome, Double[] notas2) {
        this.ID = ID;
        this.nome = nome;
        this.notas = notas2;
       
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double[] getNotas() {
        return notas;
    }

    

}

