public class Main
{
	public static void main(String[] args) {
	    Mamifero m = new Mamifero();
	    Reptil r = new Reptil();
	    Peixe p = new Peixe();
	    Ave a = new Ave();
	    
	    /*m.setPeso(35.3);
	    m.setCorPelo("Marrom");
	    m.alimentar();
	    m.locomover();
	    m.emitirSom();
	    
	    a.locomover();
	    p.locomover();
	    r.locomover();*/
	    
	    Canguru c = new Canguru();
	    Cachorro k = new Cachorro();
	    Cobra j = new Cobra();
	    Tartaruga t = new Tartaruga();
	    Goldfish g =new Goldfish();
	    Arara e = new Arara();
	    
	    c.locomover();
	    c.usarBolsa();
	    k.locomover();
	    k.emitirSom();
	    c.emitirSom();
	}
}	