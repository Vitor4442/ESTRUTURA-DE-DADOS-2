public class Btree{
	private Bnode raiz;
	
	public Btree(){
		raiz = null;
	}
	
	public void add(int valor){
		if(raiz!=null){
			raiz.add(valor);
		}
		else{
			raiz = new Bnode(valor);
		}
	}
	
	public void show(){
		if(raiz!=null){
			raiz.show();
		}
	}
	
	public void showH(){
		if(raiz!=null){
			raiz.showH(1);
		}
	}
	
	public int size(){
		if(raiz!=null){
			return raiz.size();
		}
		else{
			return 0;
		}
	}
	
	public int soma(){
		if(raiz!=null){
			return raiz.soma();
		}
		else{
			return 0;
		}
	}

    public int ContadorNosF(){
        if(raiz!=null){
            return raiz.ContadorNosF();
        }
        else{
            return 0;
        }
    }

    public int ContadorNosNF(){
        if(raiz!=null){
            return raiz.ContadorNosNF();
        }
        else{
            return 0;
        }
    }

    public int somafolhas(){
        if(raiz!=null){
            return raiz.somafolhas();
        }
        else{
            return 0;
        }
    }

    public int somaNFolhas(){
        if(raiz!=null){
            return raiz.somaNFolhas();
        }
        else{
            return 0;
        }
    }

    public int maior (){
        if(raiz!=null){
            return raiz.maior();
        }
        else{
            return (-99999);
        }
    }

    public int menor (){
        if(raiz!=null){
            return raiz.menor();
        }
        else{
            return (-99999);
        }
    }

    public int arvore (){
        if(raiz!=null){
            return raiz.arvore();
        }
        else{
            return 0;
        }
    }

    public int nivel (int nivel){
        if(raiz!=null){
            return raiz.nivel(nivel, 1);
        }
        else{
            return 0;
        }
    }}



    
    // }
