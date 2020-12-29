
public class Livro implements Publicacao{
    //Atributos
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;
    
    //Métodos públicos
    public String detalhes(){
        //return String.format("Livro: %s,  ")
        return "Livro: " + titulo + ", autor: " + autor + ". " + totPaginas + 
        " páginas. Página atual: " + pagAtual + ". Está aberto: " + aberto + 
        ". Leitor: " + leitor + ", de " + leitor.getIdade() + " anos.";
    }
    
    //Métodos especiais
    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor){
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.aberto = false;
        this.pagAtual = 0;
        this.leitor = leitor;
    }
    
    public String getTitulo(){
        return titulo;
    }
    
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    
    public String getAutor(){
        return autor;
    }
    
    public void setAutor(String autor){
        this.autor = autor;
    }
    
    public int getTotPaginas(){
        return totPaginas;
    }
    
    public void setTotPaginas(int totPaginas){
        this.totPaginas = totPaginas;
    }
    
    public int getPagAtual(){
        return pagAtual;
    }
    
    public void setPagAtual(int pagAtual){
        this.pagAtual = pagAtual;
    }
    
    public boolean getAberto(){
        return aberto;
    }
    
    public void setAberto(boolean aberto){
        this.aberto = aberto;
    }
    
    public Pessoa getLeitor(){
        return leitor;
    }
    
    public void setLeitor(Pessoa leitor){
        this.leitor = leitor;
    }
    
    public void abrir(){
        this.aberto = true;
    }
    
    public void fechar(){
        this.aberto = false;
    }
    
    public void folhear(int p){
        if(p > this.totPaginas) {
            this.pagAtual = 0;
        }else{
            this.pagAtual = p;
        }
        
    }
    
    public void avancarPag(){
        this.pagAtual++;
    }
    
    public void voltarPag(){
        this.setPagAtual(this.getPagAtual() - 1);
    }
    
}