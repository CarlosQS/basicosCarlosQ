package basicosCarlosQ;

public class Logicos {

	public static boolean logicos() {
		int x=1;
		int y=2;
		if(x==y) {
			return true;
		}else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		System.out.print("Las variables x/y son iguales? -> " + logicos());
	}
	
}
