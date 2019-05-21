package gof;

public class Cliente {

	public static void main(String[] args) {
		
		Telefone tel = new Telefone();
		tel.add(new Contato("Primeiro", "111111", Tipo.CLARO));
		tel.add(new Contato("Segundo", "222222", Tipo.OI));
		tel.add(new Contato("Terceiro", "333333", Tipo.TIM));
		tel.add(new Contato("Quarto", "444444", Tipo.VIVO));
		
		for(Contato c: tel.get())
			new OperadoraFactory().criar(c.getOperadora()).ligar();
	}

}
