package cofre;
public class Cofre {
    private Cliente dono;
    private int quantidade50;
    private int quantidade25;
    private int quantidade10;

    public Cofre(Cliente dono, int quantidade50, int quantidade25, int quantidade10){
        this.dono = dono;
        this.quantidade50 = 0;
        this.quantidade25 = 0;
        this.quantidade10 = 0;
    }

    public void setDono(Cliente dono){
        this.dono = dono;
    }

    public Cliente getDono(){
        return this.dono;
    }

    public int deposita10(){
        return this.quantidade10 = this.quantidade10 + 10;
    }

    public int deposita25(){
        return this.quantidade25 = this.quantidade25 + 25;
    }

    public int deposita50(){
        return this.quantidade50 = this.quantidade50 + 50;
    }

    public int calculaTotal(){
        int total = this.quantidade10 + this.quantidade25 + this.quantidade25;
        return total;
    }
}
