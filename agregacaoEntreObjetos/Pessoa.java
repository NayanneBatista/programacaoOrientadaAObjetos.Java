

public class Pessoa {
    
    //Atributos
    
    private String nome;
    private int idade;
    private Character sexo;
    
    //Métodos públicos
    
    public void fazerAniver(){
        this.setIdade(this.getIdade() + 1);
    }
    
    //Métodos especiais
    
    public Pessoa(String nome,int idade,Character sexo){
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public int getIdade() {
        return idade;
    }
    
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public Character getSexo() {
        return sexo;
    }
    
    public void setSexo(Character sexo) {
        this.sexo = sexo;
    }
    
    public String toString(){
        return nome;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
}