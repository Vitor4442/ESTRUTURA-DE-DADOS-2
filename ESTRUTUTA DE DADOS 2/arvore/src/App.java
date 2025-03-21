public class App {
    public static void main(String[] args) throws Exception {
       Btree a = new Btree();
       a.add(50);
       a.add(40);
       a.add(80);
       a.add(45);
       a.add(70);
       a.add(90);
        
        a.showH();

        System.out.println(a.size());
        System.out.println(a.soma());
        System.out.println(a.ContadorNosF());
        System.out.println(a.ContadorNosNF());
        System.out.println(a.somafolhas());
        System.out.println(a.somaNFolhas());
        System.out.println(a.maior());
        System.out.println(a.menor());
        System.out.println(a.arvore());
        System.out.println(a.nivel(3));


        
        

        
    }
}
