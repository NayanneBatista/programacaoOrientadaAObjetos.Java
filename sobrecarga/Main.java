
public class Main
{
	public static void main(String[] args) {
		Cachorro x = new Cachorro();
		
		x.emitirSom();
		
		x.reagir("Olá");
		x.reagir("Vai apanhar");
		x.reagir(11,45);
		x.reagir(21,00);
		x.reagir(true);
		x.reagir(false);
		x.reagir(2,12.5);
		x.reagir(17, 4.5);
	}
}
