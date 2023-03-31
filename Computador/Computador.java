public class Computador
{
    private String modeloProcessador;
    private double capacidadeProcessador;
    private int quantidadeMemoriaRAM;
    private int tamanhoHD;
    
    public Computador(String modeloProcessador, double capacidadeProcessador, int quantidadeMemoriaRAM, int tamanhoHD){
        this.modeloProcessador = modeloProcessador;
        this.capacidadeProcessador = capacidadeProcessador;
        this.quantidadeMemoriaRAM = quantidadeMemoriaRAM;
        this.tamanhoHD = tamanhoHD;
    }
    
    public void setModeloProcessador(String modeloProcessador){
        this.modeloProcessador = modeloProcessador;
    }
    
    public String getModeloProcessador(){
        return this.modeloProcessador;
    }
    
    public void setCapacidadeProcessador(double capacidadeProcessador){
        this.capacidadeProcessador = capacidadeProcessador;
    }
    
    public double getCapacidadeProcessador(){
        return this.capacidadeProcessador;
    }
    
    public void setQuantidadeMemoriaRAM(int quantidadeMemoriaRAM){
        this.quantidadeMemoriaRAM = quantidadeMemoriaRAM;
    }
    
    public int getQuantidadeMemoriaRAM(){
        return this.quantidadeMemoriaRAM;
    }
    
    public void setTamanhoHD(int tamanhoHD){
        this.tamanhoHD = tamanhoHD;
    }
    
    public int getTamanhoHD(){
        return this.tamanhoHD;
    }
}