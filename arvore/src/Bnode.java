public class Bnode {
    private int x;
    private Bnode esq, dir;

    public Bnode(int x) {
        this.x = x;
        esq = dir = null;
    }

    
    public void add(int valor) {
        
        if (valor <= x) {

            if (esq != null) {
                esq.add(valor);  
            } else {
                esq = new Bnode(valor);  
            }

        }
    
        else {
            if (dir != null) {
                dir.add(valor);  
            } else {
                dir = new Bnode(valor);  
            }
        }
    }

    
    public void show() {
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
        for(int i = 0; i<3*nivel ; i++){
            System.out.print(" ");
        }
        System.out.println("-" + x);
        if(esq!=null){
            esq.showH(nivel+1);
        }

        }
    }


