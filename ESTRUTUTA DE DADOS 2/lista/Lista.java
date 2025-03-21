public class Lista{
	private Node inicio;
	
	public Lista(){
		inicio = null;
	}
	
	public void add(int valor){
		if(inicio != null){
			inicio.add(valor);
		}
		else{
			inicio = new Node(valor);
		}
	}
	
	public void show(){
		if(inicio!=null){
			inicio.show();
		}
		System.out.println();
	}
	
	public int length(){
		if(inicio != null){
			return inicio.length();
		}
		else{
			return 0;
		}
	}
}