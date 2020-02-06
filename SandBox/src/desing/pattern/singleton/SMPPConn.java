package desing.pattern.singleton;

public class SMPPConn{
	
	static volatile SMPPConn instance = null;
	private void SMPPConn() {
		
	}
	
	static public SMPPConn getInstance() {
		if(instance==null) {
			synchronized (SMPPConn.class){
				if(instance==null)
					instance = new SMPPConn();
			}
		}
		return instance;
	}
}
