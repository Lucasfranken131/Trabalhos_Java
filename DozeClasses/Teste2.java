import java.util.Scanner;

class Teste2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor de A: ");
        int a = sc.nextInt();
        System.out.println("Digite o valor de B: ");
        int b = sc.nextInt();
        System.out.println("Digite o valor de C: ");
        int c = sc.nextInt();
        int guarda;

        if(a < b){
            guarda = a;
            a = b;
            b = guarda;
            System.out.println(" ");
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
        }

        if(b < c){
            guarda = b;
            b = c;
            c = guarda;
            System.out.println(" ");
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);

            if(a < b){
                guarda = a;
                a = b;
                b = guarda;
                System.out.println(" ");
                System.out.println(a);
                System.out.println(b);
                System.out.println(c);
            }
        }
    }
}
/*
a = 3, b = 7, c = 5, executa o primeiro e segundo if.
a = 3, b = 5, c = 7, executa o primeiro, segundo e terceiro if.
a = 5, b = 3, c = 7, executa o primeiro e segundo if.
a = 5, b = 7, c = 3, executa o primeiro if.
*/
