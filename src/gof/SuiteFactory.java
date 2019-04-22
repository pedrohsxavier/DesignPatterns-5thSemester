package gof;

public class SuiteFactory  {
	
	private static SuiteFactory instancia = null;
	
	private SuiteFactory() {};
	
	public synchronized static SuiteFactory getInstance() {
		if (SuiteFactory.instancia == null) {
			SuiteFactory.instancia = new SuiteFactory();
		}
		return SuiteFactory.instancia;
	}
	
	public ISuite getFactory(Suite suite) {
		if(suite == Suite.LIBREOFFICE)
			return new LibreOfficeFactory();
		else if (suite == Suite.MICROSOFT)
			return new MicrosoftFactory();
		else {
			return null;
		}
		
	}

}