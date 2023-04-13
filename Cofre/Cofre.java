public class Cofre {
    public Cliente cliente;
    private int quantidade50;
    private int quantidade25;
    private int quantidade10;

    public Cofre(Cliente cliente, int quantidade50, int quantidade25, int quantidade10){
        this.cliente = cliente;
        this.quantidade50 = quantidade50;
        this.quantidade25 = quantidade25;
        this.quantidade10 = quantidade10;
    }

    public void setCliente(Cliente cliente){
        this.cliente = cliente;
    }

    public String getCliente(){
        return this.cliente.nome;
    }

    public int deposita10(){
        return this.quantidade10 = this.quantidade10 + 10;
    }
    
    public int quantos10(){
        return this.quantidade10;
    }

    public int deposita25(){
        return this.quantidade25 = this.quantidade25 + 25;
    }
    
    public int quantos25(){
        return this.quantidade25;
    }

    public int deposita50(){
        return this.quantidade50 = this.quantidade50 + 50;
    }
    
    public int quantos50(){
        return this.quantidade50;
    }
    
    public int calculaTotal(){
        int total = this.quantidade10 + this.quantidade25 + this.quantidade25;
        return total;
    }
}
