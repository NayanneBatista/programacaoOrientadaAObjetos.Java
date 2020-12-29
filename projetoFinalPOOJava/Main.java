public class Main
{
	public static void main(String[] args) {
		Video v[] = new Video[3];
		v[0] = new Video("Aula 1 de POO");
		v[1] = new Video("Aula 12 de PHP");
		v[2] = new Video("Aula 4 de Java");
		
		//System.out.println(v[0].toString());
		
		Gafanhoto g[] = new Gafanhoto[2];
		g[0] = new Gafanhoto("Nanne", 32, "F", "nanneCoder");
		g[1] = new Gafanhoto("Lyanne", 9, "F", "lilicaGamer");
		
		//System.out.println(g[1].toString());
		
		Visualizacao vis[] = new Visualizacao[5];
		vis[0] = new Visualizacao(g[0], v[0]);
		vis[0].avaliar();
		System.out.println(vis[0].toString());
		
		vis[1] = new Visualizacao(g[0], v[1]);
		vis[1].avaliar(87.0);
		System.out.println(vis[1].toString());
	}
}

