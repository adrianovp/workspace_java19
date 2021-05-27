
public class Loja {
	public static void main(String[] args) {
		/*
		 *   Carro => tipo de dado (Classe)
		 *   c     => vari�vel deste tipo (c armazena marca, modelo, ano, km, cor, combustivel, preco)
		 */
		Carro c;
		c = new Carro();   // n�o basta declarar, preciso pedir ao Java para reservar a mem�ria
		
		// Carro c = new Carro();
		c.marca = "P�rxi";
		c.modelo = "Kayene";
		c.ano    = 2018;
		c.cor    = "Preto";
		c.km     = 15000;
		c.combustivel = "Gasolina/Eletrico";
		c.preco       = 800000.00;
		
		Carro c2 = new Carro();
		c2.marca = "Xevrol�";
		c2.modelo = "Kor�a";
		c2.ano    = 1996;
		c2.cor    = "Branco com detalhes preto pq o carro � guerreiro";
		c2.km     = 350000;
		c2.combustivel = "Gasolina, mas se tiver caro, funciona com alcool tb";
		c2.preco       = 7500.00;
		
		// exibindo o anuncio
		System.out.println("==== U�biMotors --- sua loja de carros na NET! ===");
		c.mostrarAnuncio();
		double v = c.calcularIPVA();
		System.out.println("O valor do IPVA desta m�quina � "+v);
		
		
		System.out.println(" -------------------------- ");
		c2.mostrarAnuncio();
		double v2 = c2.calcularIPVA();
		System.out.println("IPVA do carro que � fil�! "+v2);
		
		
		c2.mudarPreco(0);  // internamente na fun��o mudarPreco o par�metro
								 // novoPreco = 5999.99
		
		
		System.out.println("O patrao ficou doido... o carro agora custa R$ "+c2.preco);
		
	
		
	}
}
