public class Btree {
    private Bnode raiz;

    public Btree(){
        raiz = null;
    }

    public void add(int valor){
        if (raiz!=null){
            raiz.add(valor);
        }
        else{
            raiz = new Bnode(valor);
        }
    }

    public void show(){
        if (raiz!=null){
            raiz.show();
        }
    }

     public void showH(){
     if (raiz!=null){
        raiz.showH(1);
            }
         }

    public int size(){
        if(raiz!=null){
            raiz.size();
        }
        else{
            return 0;
        }
    }
}
