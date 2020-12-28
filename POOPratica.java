public class Aula05 {
    public static void main(String[] args) {
        ContaBanco conta = new ContaBanco();
        conta.abrirConta("CC");
        System.out.println(conta.getSaldo());
        conta.depositar(1500);
        System.out.println(conta.getSaldo());
        conta.sacar(2000);
        conta.sacar(300);
        System.out.println(conta.getSaldo());
        conta.pagarMensal();
        System.out.println(conta.getSaldo());
        conta.fecharConta();
    }
}

class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;
    
    public ContaBanco() {
        status = false;
        saldo = 0;
    }
    
    public void abrirConta(String tipo) {
        this.status = true;
        this.tipo = tipo;
        if(this.tipo == "CC"){
            this.saldo = 50;
        }else if(this.tipo == "CP"){
            this.saldo = 150;
        }
    }
    
    public void fecharConta() {
        if(status == true){
            if(saldo < 0){
                System.out.println("Débito existente. Impossível fechar conta.");
            }else if(saldo > 0){
                System.out.println("Necessário sacar quantia restante na conta antes do fechamento");
            }else {
                status = false;
            }
        }
    }
    
    public void depositar(double dep) {
        if(status == true){
            saldo = saldo + dep;
        }
    }
    
    public void sacar(double v) {
        if(status == true){
            if(saldo >= v){
                saldo = saldo - v;
            }else{
                System.out.println("Saldo insuficiente");
            }
        }
    }
    
    public void pagarMensal() {
        if(tipo == "CC"){
            saldo = saldo - 12;
        }else if(tipo == "CP"){
            saldo = saldo - 20;
        }
    }
    
    public int getNumConta() {
        return this.numConta;
    }
    
    public void setnumConta(int num) {
        this.numConta = num;
    }
    
    public String getTipo() {
        return this.tipo;
    }
    
    public void setTipo(String t) {
        this.tipo = t;
    }
    
    public String getDono() {
        return this.dono;
    }
    
    public void setDono(String dono) {
        this.dono = dono;
    }
    
    public boolean getStatus() {
        return this.status;
    }
    
    public void setStatus(boolean s) {
        this.status = s;
    }
    
    public double getSaldo() {
        return this.saldo;
    }
    
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    
    
}