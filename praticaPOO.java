public class Aula05 {
    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(01);
        p1.setDono("Feroz");
        p1.abrirConta("CC");
        
        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(02);
        p2.setDono("Nayanne");
        p2.abrirConta("CP");
        
        p1.depositar(100);
        p2.depositar(500);
        p2.sacar(100);
        p1.sacar(150);
        p1.fecharConta();
        
        p1.estadoAtual();
        p2.estadoAtual();
    }
}

class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;
    
    public void estadoAtual() {
        System.out.println("-----------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }
    
    
    public int getNumConta() {
        return this.numConta;
    }
    
    public void setNumConta(int num) {
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
    
    public ContaBanco() {
        this.setStatus(false);
        this.setSaldo(0);
    }
    
    public void abrirConta(String tipo) {
        this.setStatus(true);
        this.setTipo(tipo);
        if(this.tipo == "CC"){
            this.setSaldo(50);
        }else if(this.tipo == "CP"){
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso!");
    }
    
    public void fecharConta() {
        if(this.getSaldo() < 0){
            System.out.println("Débito existente. Impossível fechar conta.");
        }else if(this.getSaldo() > 0){
            System.out.println("Necessário sacar quantia restante na conta antes do fechamento");
        }else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso");
        }
        
    }
    
    public void depositar(double dep) {
        if(this.getStatus()){
            //this.saldo = this.saldo + dep;(Mesma coisa da linha debaixo, mas a debaixo é melhor)
            this.setSaldo(this.getSaldo() + dep);
            System.out.println("Depósito realizado na conta de " + this.getDono());
        }else {
            System.out.println(("Impossível realizar depósito: a conta está fechada."));
        }
    }
    
    public void sacar(double v) {
        if(this.getStatus()){
            if(this.getSaldo() >= v){
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado na conta de " + this.getDono());
            }else{
                System.out.println("Saldo insuficiente");
            }
        }else {
            System.out.println("Impossível sacar: a conta está fechada.");
        }
    }
    
    public void pagarMensal() {
        int mensal = 0;
        if(this.getTipo() == "CC"){
            mensal = 12;
        }else if(this.getTipo() == "CP"){
            mensal = 20;
        }
        if(this.getStatus()) {
            this.setSaldo(this.getSaldo() - mensal);
            System.out.println("Mensalidade paga com sucesso por "+ this.getDono());
        }else {
            System.out.println("Impossível pagar mensalidade de conta fechada.");
        }
    }
    
}