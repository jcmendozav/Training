package desing.pattern.singleton;

public class Test {
	

	
	public static void main(String[] args) {
		SMPPConn c1=SMPPConn.getInstance();
		SMPPConn c2=SMPPConn.getInstance();
		System.out.println(c1==c2);
		
	}

}
