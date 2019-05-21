package gof;

public class Log {
	
	private static Log instancia = null;
	
	private Log() {};
	
	public synchronized static Log getInstance() {
		if (Log.instancia == null) {
			Log.instancia = new Log();
		}
		
		return Log.instancia;
	}
	
	public void escrever() {};
	
	public void ler() {};
}
