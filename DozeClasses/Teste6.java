import java.util.Scanner;
public class Teste6{
    public static void main(String args[]){
        char turno;
        Scanner c = new Scanner(System.in);
        turno = Teclado.leChar("Digite o turno. M - Manhã, T - Tarde e N - Noite. ");
        if(turno == 'M' || turno == 'm'){
            System.out.println("Bom dia.");
        }
        else if(turno == 'T' || turno == 't'){
            System.out.println("Boa tarde.");
        }
        else if(turno == 'N' || turno == 'n'){
            System.out.println("Boa noite.");
        }
        else{
            System.out.println("Turno inválido.");
        }
    }
}
