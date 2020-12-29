public class Funcionario extends Pessoa{
    private String setor;
    private boolean categoria;
    
    public void mudaTrabalho(){
        this.categoria = ! this.categoria;
    }
    
    public String getSetor(){
        return setor;
    }
    
    public void setSetor(String setor){
        this.setor = setor;
    }
    
    public boolean getCategoria(){
        return categoria;
    }
    
    public void setCategoria(boolean categoria){
        this.categoria = categoria;
    }
}