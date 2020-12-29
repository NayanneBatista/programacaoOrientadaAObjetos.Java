
public class Main
{
    public static void main (String[] args) {
	    Pessoa[] p = new Pessoa[2];
	    Livro[] l = new Livro[3];
	    
	    p[0] = new Pessoa("Nayanne", 32, 'F');
	    p[1] = new Pessoa("Lyanne", 8, 'F');
	    
	    l[0] = new Livro("POO em Java", "Gustavo Guanabara", 234, p[0]);
	    l[1] = new Livro("Estrutura de Dados com JS", "Loyane Silva", 345, p[0]);
	    l[2] = new Livro("A loucura do Suricato", "Ian WhyBrow", 96, p[1]);
	    
	    l[1].abrir();
	    l[1].folhear(200);
	    l[1].avancarPag();
	    System.out.println(l[1].detalhes());
	    System.out.println(l[2].detalhes());
    }
}