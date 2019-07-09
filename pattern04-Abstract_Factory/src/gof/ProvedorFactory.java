package gof;

public class ProvedorFactory {
	
	public static Factory getFactory(Provedor provedor) {
		if (provedor == Provedor.GMAIL) {
			return new GmailFactory();
		}else if (provedor == Provedor.IG) {
			return new IgFactory();
		}else if (provedor == Provedor.YAHOO) {
			return new YahooFactory();
		}else {
			return null;
		}
	}
	
}
