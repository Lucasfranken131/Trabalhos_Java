public class Main {
    public static void main(String args[]){
        Cliente cliente1 = new Cliente("Lucas Franco",19);
        Cliente cliente2 = new Cliente("Takamasa Nomuro", 49);
        Cofre cofre1 = new Cofre(cliente1,10,10,10);
        cofre1.getCliente();
        System.out.println(cofre1.getCliente());
        System.out.println(cofre1.quantos10());
        cofre1.setCliente(cliente2);
        System.out.println(cofre1.getCliente()) ;
    }
}
