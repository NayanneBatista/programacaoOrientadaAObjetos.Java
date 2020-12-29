
public class Main
{
	public static void main(String[] args) {
		Visitante v1 = new Visitante();
		v1.setNome("Juvenal");
		v1.setSexo("M");
		v1.setIdade(33);
		System.out.println(v1.toString());
		
		Aluno a1 = new Aluno();
		a1.setNome("Claudia");
		a1.setMatricula(123);
		a1.setCurso("Informática");
		a1.setIdade(34);
		a1.setSexo("F");
		a1.pagarMensalidade();
		
		Bolsista b1 = new Bolsista();
		b1.setNome("Ana");
		b1.setMatricula(556);
		b1.setBolsa(12.5);
		b1.setSexo("F");
		b1.pagarMensalidade();
		
		Professor p1 = new Professor();
		p1.setNome("Guanabara");
		p1.setEspecialidade("Programação");
		p1.setSalario(30000);
		p1.receberAumento(3000);
		System.out.println(p1.getSalario());
		System.out.println(p1.toString());
		
		Tecnico t1 = new Tecnico();
		t1.setNome("Feroz");
		t1.setIdade(10);
		t1.setRegistroProfissional(142020);
		t1.setSexo("M");
		t1.praticar();
		System.out.println(t1.toString());
	}
}
