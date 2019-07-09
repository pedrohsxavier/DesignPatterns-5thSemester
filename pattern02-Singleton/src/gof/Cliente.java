package gof;

public class Cliente {
	
	public static void main(String[] args) {
		Log l1 = Log.getInstance();
		Log l2 = Log.getInstance();
	
		System.out.println(l1);
		System.out.println(l2);
	}
}
