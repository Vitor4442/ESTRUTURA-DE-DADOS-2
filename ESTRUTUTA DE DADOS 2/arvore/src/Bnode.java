public class Bnode{
	private int x;
	private Bnode esq, dir;
	
	public Bnode(int x){
		this.x = x;
		esq = dir = null;
	}
	
	public void add(int valor){
		if(valor <= x){
			if(esq!=null){
				esq.add(valor);
			}
			else{
				esq = new Bnode(valor);
			}
		}
		else{
			if(dir!=null){
				dir.add(valor);
			}
			else{
				dir = new Bnode(valor);
			}
		}
	}
	
	public void show(){
		System.out.println(x);
		if(esq!=null){
			esq.show();
		}
		if(dir!=null){
			dir.show();
		}
	}
	
	public void showH(int nivel){
		if(dir!=null){
			dir.showH(nivel+1);
		}
		for(int i = 0; i<3*nivel; i++){
			System.out.print(" ");
		}
		System.out.println(" - " + x);
		if(esq!=null){
			esq.showH(nivel+1);
		}
	}
	
	public int size(){
		int se=0, sd=0;
		if(esq!=null){
			se = esq.size();
		}
		
		if(dir!=null){
			sd = dir.size();
		}
		
		return 1+se+sd;
	}
	
	public int soma(){
		int se=0, sd=0;
		if(esq!=null){
			se = esq.soma();
		}
		
		if(dir!=null){
			sd = dir.soma();
		}
		
		return x+se+sd;
	}

    public int ContadorNosF(){
        if(esq == null && dir == null){
            return 1;
        }

        int count = 0;

        if(esq != null){
            count += esq.ContadorNosF();
        }
        if(dir != null){
            count += dir.ContadorNosF();
        }

        return count;
    }

    public int ContadorNosNF(){

        int count = 1;
        
        if(esq == null && dir == null){
            return 0;
        }

        if(esq != null){
            count += esq.ContadorNosNF();
        }
        if(dir != null){
            count += dir.ContadorNosNF();
        }

        return count;
    }

    public int somafolhas(){
        if(esq == null && dir == null){
            return x;
        }

        int count = 0;

        if(esq != null) {
            count += esq.somafolhas();
        }
        if(dir != null) {
            count += dir.somafolhas();
        }

        return count;
    }

    public int somaNFolhas(){
        if(esq == null && dir ==null){
            return 0;
        }

        int count = x;

        if(esq != null){
            count += esq.somaNFolhas();
        }
        
        if(dir != null){
            count += dir.somaNFolhas();
        }

        return count;

    }

    public int maior(){

        if(dir != null){
            return dir.maior();
        }
        else{
            return x;
        }

    }

    public int menor(){

        if(esq != null){
            return esq.menor();
        }
        else{
            return x;
        }

    }


	public int arvore(){
		int se=0, sd=0;
		if(esq!=null){
			se = esq.arvore();
		}
		
		if(dir!=null){
			sd = dir.arvore();
		}
		
        if(se < sd){
            return 1+ sd;
        }

        else{
            return 1 + se;
        }

	}

    public int nivel(int nivel, int nivelatual){
        int se = 0, sd=0;

        if(nivel == nivelatual){
            return 1;
        }

        if(esq != null){
            se = esq.nivel(nivel, nivelatual+1);
        }

        if(dir != null){
            sd = dir.nivel(nivel, nivelatual+1);

        }
        
        return sd + se;
    }
}