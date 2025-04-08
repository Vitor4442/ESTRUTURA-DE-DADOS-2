public class Btree{
	private Bnode raiz;
    private Aluno a;

	public Btree(){
		raiz = null;
	}


    //METODO ADD
    public void add(Aluno a){
        if(raiz!=null){
            raiz.addAluno(a);;
        }
        else{
            raiz = new Bnode(a);
        }
    }

    //METODO SHOW 
    public void show(){
        if(raiz!=null){
            raiz.show();
        }
    }

    //METODO BUSCAR
    public void buscar(int ID_buscar){
        if(raiz!=null){
            raiz.buscar(ID_buscar);;
        }
    }

    public void atualizar_nota(int Id_busca, Double[] novasNotas) {
        if (raiz != null) {
            raiz.atualizar_nota(Id_busca, novasNotas);
        }
    }

    }


	