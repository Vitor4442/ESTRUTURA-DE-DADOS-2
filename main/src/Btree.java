public class Btree{
	private Bnode raiz;
    private Livro l;

	public Btree(){
		raiz = null;
	}



    public void add(Livro l){
        if(raiz!=null){
            raiz.addLivro(l);
        }
        else{
            raiz = new Bnode(l);
        }
    }

    public void show(){
        if(raiz!=null){
            raiz.show();
        }
        else{
            System.out.println("Não há dados");
        }

    }

    public void buscar(String Isbn_buscar){
        if(raiz!=null){
            raiz.buscar(Isbn_buscar);;
        }
        else{
            System.out.println("Não há dados");
        }
    }
    }


	