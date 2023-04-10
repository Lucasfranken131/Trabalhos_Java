public class cofre {
    private Cliente dono;
    private int quantidade50;
    private int quantidade25;
    private int quantidade10;

    public cofre(Cliente dono, int quantidade50, int quantidade25, int quantidade10){
        this.dono = dono;
        this.quantidade50 = 0;
        this.quantidade25 = 0;
        this.quantidade10 = 0;
    }

    public void setDono(Cliente dono){
        this.dono = dono;
    }

    public String getDono(){
        return this.dono;
    }

    public int deposita10(){
        return this.quantidade10 = this.quantidade10 + 10;
    }

    public int deposita25(){
        return this.quantidade25 = this.quantidade25 + 25;
    }

    public int deposita50(){
        return this.deposita50 = this.deposita50 + 50;
    }

    public int calculaTotal(){
        int total = this.deposita10 + this.deposita25 + this.deposita50;
        return total;
    }
}
