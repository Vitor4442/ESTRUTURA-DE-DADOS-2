public class Principal{
	public static void main(String args[]){
		Lista l1 = new Lista();
		
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		l1.add(50);
		l1.add(60);
		
		l1.show();
		
		System.out.println(l1.length());
		//System.out.println(l1.soma());
	}
}