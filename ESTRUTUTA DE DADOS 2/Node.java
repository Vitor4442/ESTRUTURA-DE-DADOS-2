public class Node{
	private int x;
	private Node prox;
	
	public Node(int valor){
		x = valor;
		prox = null;
	}
	
	public void add(int valor){
		if(prox != null){
			prox.add(valor);
		}
		else{
			prox = new Node(valor);
		}
	}
	
	public void show(){
		
		if(prox!=null){
			prox.show();
		}
		System.out.print(x + " - ");
	}
	
	public int length(){
		if(prox != null){
			return 1 + prox.length();
		}
		else{
			return 1;
		}
	}
}