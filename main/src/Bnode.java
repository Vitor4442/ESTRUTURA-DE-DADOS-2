public class Bnode {
    private Livro p;
    private Bnode esq, dir;

    public Bnode(Livro l){
        this.p = new Livro(l);
        this.esq = this.dir = null ;
    }

    //metodo para adicionar livro
    public void addLivro(Livro l){
        if (l.GetISBN().compareTo(p.GetISBN())<=0){
            if(esq!=null){
                esq.addLivro(l);
            }
            else{
                esq = new Bnode(l);
            }
        }
        else{
            if(dir!=null){
                dir.addLivro(l);
            }
            else{
                dir = new Bnode(l);
            }
        }
    }

    //metodo para ver o livro
    public void show() {
        if (esq != null) {
            esq.show();
        }
        System.out.println(p.GetISBN() + " Livro: " + p.GetTitulo() + " Autor: " + p.GetAutor());
        if (dir != null) {
            dir.show();
        }
    }

    //metodo para buscar o livro
    public void buscar(String Isbn_buscar) {
        
        if (p.GetISBN().equals(Isbn_buscar)) {
            System.out.println("ID: " + p.GetISBN() + " Livro: " + p.GetTitulo() + " Autor: " + p.GetAutor());
            System.out.println();
            return;
        }
       
        if (esq != null) {
            esq.buscar(Isbn_buscar);
        } else if (dir != null) {
            dir.buscar(Isbn_buscar);
        } else {
            System.out.println("ISBN com esse livro: " + Isbn_buscar + " não encontrado.");
        }
    }
    

}