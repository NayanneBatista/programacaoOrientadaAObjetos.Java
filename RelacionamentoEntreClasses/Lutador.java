
public class Lutador {
    //Atributos
    private String nome;
    private String nacionalidade;
    private int idade;
    private double altura;
    private double peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;
    
    //Métodos públicos
    public void apresentar() {
        System.out.println("-----------------------------------------");
        System.out.println("Apresentamos o lutador " + this.getNome());
        System.out.println("Diretamente de " + this.getNacionalidade());
        System.out.println("Com " + this.getIdade() + " e " + this.getAltura());
        System.out.println("Pesando " + this.getPeso());
        System.out.println(this.getVitorias() + " vitórias, " + this.getDerrotas() + " derrotas e " + this.getEmpates() + " empates.");
        System.out.println("-----------------------------------------");
    }
    
    public void status() {
        System.out.println(this.getNome() + " é um " + this.getCategoria());
        System.out.println("Ganhou " + this.getVitorias());
        System.out.println("Perdeu " + this.getDerrotas());
        System.out.println("Empatou " + this.getEmpates());
    }
    
    public void ganharLuta() {
        this.setVitorias(this.getVitorias() + 1);
    }
    
    public void perderLuta() {
        this.setDerrotas(this.getDerrotas() + 1);
    }
    
    public void empatarLuta() {
        this.setEmpates(this.getEmpates() + 1);
    }
    
    //Métodos especiais
    public Lutador(String nome, String nacionalidade, int idade, double altura, double peso, int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }
    
public String getNome() {
    return this.nome;
}

public void setNome(String no) {
    this.nome = no;
}
    
public String getNacionalidade() {
    return this.nacionalidade;
}    

public void setNacionalidade(String nacionalidade) {
    this.nacionalidade = nacionalidade;
}   

public int getIdade() {
    return this.idade;
}
    
public void setIdade(int idade) {
    this.idade = idade;
}   

public double getAltura() {
    return this.altura;
}

public void setAltura(double altura) {
    this.altura = altura;
}

public double getPeso() {
    return this.peso;
}

public void setPeso(double peso) {
    this.peso = peso;
    this.setCategoria();
}

public String getCategoria() {
    return this.categoria;
}

private void setCategoria() {
    if(this.peso < 52.2) {
        this.categoria = "inválido";
    } else if (this.peso <= 70.3) {
        this.categoria = "Peso leve";
    } else if (this.peso <= 83.9) {
        this.categoria = "Peso médio";
    } else if (this.peso <= 120.2) {
        this.categoria = "Peso pesado";
    } else {
        this.categoria = "Inválido";
    }
}

public int getVitorias() {
    return this.vitorias;
}
    
public void setVitorias(int vitorias) {
    this.vitorias = vitorias;
}

public int getDerrotas() {
    return this.derrotas;
}    

public void setDerrotas(int derrotas) {
    this.derrotas = derrotas;
}

public int getEmpates() {
    return this.empates;
}
    
public void setEmpates(int empates) {
    this.empates = empates;
}    
    
}