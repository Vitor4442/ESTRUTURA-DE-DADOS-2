public class Btree{
	private Bnode raiz;
    private Livro l;

	public Btree(){
		raiz = null;
	}


    //METODO ADD
    public void add(Livro l){
        if(raiz!=null){
            raiz.addLivro(l);
        }
        else{
            raiz = new Bnode(l);
        }
    }

    //METODO SHOW 
    public void show(){
        if(raiz!=null){
            raiz.show();
        }
    }

    //METODO BUSCAR
    public void buscar(String Isbn_buscar){
        if(raiz!=null){
            raiz.buscar(Isbn_buscar);;
        }
    }
    }


	