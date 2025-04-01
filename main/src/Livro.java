public class Livro {
    
    private String ISBN;
    private String Titulo;
    private String Autor;
    
    //metodo contrutor vinculando com a arvore
    public Livro(Livro l) {
        this.ISBN = l.GetISBN();
        this.Titulo = l.GetTitulo();
        this.Autor = l.GetAutor();

    }

    //metodo construtor armazena
    public Livro(String ISBN, String Titulo, String Autor){
        this.ISBN = ISBN;
        this.Titulo = Titulo;
        this.Autor = Autor;
    }


    //metodos get e setter
    public String GetISBN(){
        return ISBN;
    }
    public String GetTitulo(){
        return Titulo;
    }
    public String GetAutor(){
        return Autor;
    }
    public void SetISBN(){
        this.ISBN = ISBN;
    }
    public void SetTitulo(){
        this.Titulo = Titulo;
    }
    public void SetAutor(){
        this.Autor = Autor;
    }
}
