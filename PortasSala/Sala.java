 

public class Sala {
    private String nome;
    private Porta portaEn;
    private Porta portaSa;
    private int maximo;
    private int quantos;
    
    public Sala(String nome, Porta portaEn, Porta portaSa, int maximo, int quantos) {
        this.nome = nome;
        this.portaEn = portaEn;
        this.portaSa = portaSa;
        this.maximo = maximo;
        this.nome = nome;
        this.quantos = quantos;
    }
    
    public String getSala(){
        return this.nome;
    }
    
    public int getMaximo(){
        return this.maximo;
    }

    public int getQuantos(){
        return this.quantos;
    }

    public boolean estaCheia(){
        if(this.quantos > this.maximo || this.quantos == this.maximo){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean entra(){
        if(quantos < maximo && portaEn.isAberta() == true){
            this.quantos = this.quantos + 1;
            return true;
        }
        else{
            return false;
        }
    }

    public boolean sai(){
        if(quantos <= maximo && portaSa.isAberta() == true){
            if(quantos == 0){
                return false;
            }
            else{
                this.quantos = this.quantos - 1;
                return true;
            }
        }
        else{
            return false;
        }
    }
    
    public void exibeSala(){
        System.out.printf("Nome da sala: "+this.nome+"\n"+"Cor da porta de Entrada: "+this.portaEn.getCor()+"\n"+"Está aberta: "+this.portaEn.isAberta());
        System.out.printf("\n"+"Cor da porta de Saída: "+this.portaSa.getCor()+"\n"+"Está aberta: "+this.portaSa.isAberta()+"\n"+"Máximo de pessoas na Sala: "+this.maximo);
        System.out.printf("\n"+"Número de pessoas na Sala: "+this.quantos);
    }
}