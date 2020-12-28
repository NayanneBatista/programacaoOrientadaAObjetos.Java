public class Aula04 {
    public static void main(String[] args){
        Caneta c1 = new Caneta();
        c1.setModelo("BIC");
        //c1.modelo = "BIC"(se o atributo for privado, dessa forma não tem como acessar!10-12-2020 Te amo bebezinha!)
        c1.setPonta(0.5f);
        
        System.out.println("Tenho uma caneta " + c1.getModelo() + " de ponta " + c1.getPonta());
    }
}





class Caneta {
    public String modelo;
    private float ponta;
    private boolean tampada;
    private String cor;
    
    public void Caneta() {//Este é o método construtor (é o metodo que tem o mesmo nome da classe)
        this.tampar();
        this.cor = "Azul";
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
    
    publiv void tampar() {
        this.tampada = true;
    }
    
    public vid destampar() {
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




