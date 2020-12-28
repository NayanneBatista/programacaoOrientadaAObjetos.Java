public class Aula04 {
    public static void main(String[] args){
        Caneta c1 = new Caneta("Stabilo", "Laranja", 0.5f);
        c1.status();
        
        Caneta c2 = new Caneta("Compactor", "Azul", 1.0f);
        c2.status();
    }
}





class Caneta {
    public String modelo;
    private float ponta;
    private boolean tampada;
    private String cor;
    
    public Caneta(String m, String c, float p) {//Este é o método construtor (é o metodo que tem o mesmo nome da classe)
        this.setModelo(m);
        this.setCor(c);
        this.setPonta(p);
        this.tampar();
    }
    
    public String getModelo() {
        return this.modelo;
    }
    public void setModelo(String m) {
        this.modelo = m;
    }
    
    public float getPonta() {
        return this.ponta;
    }
    
    public void setPonta(float p) {
        this.ponta = p;
    }
    
    public String getCor() {
        return this.cor;
    }
    
    public void setCor(String c) {
        this.cor = c;
    }
    
    public boolean getTampada() {
        return this.tampada;
    }
    
    public void setTampada(boolean t) {
        this.tampada = t;
    }
    
    public void tampar() {
        this.tampada = true;
    }
    
    public void destampar() {
        this.tampada = false;
    }
    
    public void status() {
        System.out.println("Sobre a caneta: ");
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("Cor: " + this.getCor());
        System.out.println("Tampada: " + this.getTampada());
    }
    
    
    
}




