 

public class Porta {
    private int cor;
    private boolean aberta;
    
    
    public Porta(int cor, boolean aberta) {
        this.cor = cor;
        this.aberta = aberta;    
    }
    
    public int setCor(int cor) {
        if(cor == 1){
            return this.cor = 1;
        }
        else if(cor == 2){
            return this.cor = 2;
        }
        else if(cor == 3){
            return this.cor = 3;
        }
        else if(cor == 4){
            return this.cor = 4;
        }
        else{
            return this.cor = 5;
        }
    }
    
    public boolean isAberta() {
        if(this.aberta == true) {
            return true;
        }
        else {
            return false;
        }
    }

    public void getCor() {
        System.out.println(this.cor);
    }

    public String getDescricaoCor(){
        if(cor == 1){
            return "verde";
        }
        else if(cor == 2){
            return "azul";
        }
        else if(cor == 3){
            return "amarelo";
        }
        else if(cor == 4){
            return "vermelho";
        }
        else{
            return "branco";
        }
    }

    public Boolean abre(){
        if(aberta == false){
            return this.aberta = true;
        }
        else{
            return this.aberta = true;
        }
    }

    public Boolean fecha(){
        if(aberta == true){
            return this.aberta = false;
        }
        else{
            return this.aberta = false;
        }
    }
}