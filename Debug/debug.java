public class debug{
    
    public static void main(String args []){
        long num;
        long acumulador, contador;
        num = 5;      
        acumulador = 1;
        contador = 1;
        
        do{
            acumulador = acumulador * contador;
            contador++;
        }while(contador <= num);
        System.out.println("O fatorial de "+num+" é: "+acumulador);
    }
}