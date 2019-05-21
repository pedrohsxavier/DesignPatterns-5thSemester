package gof;

public abstract class EmailDecorator implements Email{
	
	private Email email;
	
	public EmailDecorator(Email email) {
		this.email = email;
	}
	
	public Email getEmail() {
		return this.email;
	}
}
