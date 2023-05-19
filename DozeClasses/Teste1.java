class Teste1{
    public static void main(String args[]){
        double n = 15;
        if(n > 0){
            double raiz = Math.sqrt(n);
            System.out.println("Valor da raiz de n é: "+raiz);
        }

        System.out.println(" ");

        double media = 10;
        if(media >= 6){
            System.out.println("Aprovado.");
        }
        else{
            System.out.println("Precisa de grau C.");
        }
        
        System.out.println(" ");

        int r = 0;
        int x = 5;
        int y = 3;
        int z = 7;
        
        if(x>y){
            System.out.println("X é maior que Y");
            if(x>z){
                System.out.println("X é maior que Z");
                if(y!=z){
                    r = 1;
                    System.out.println("Valor de R: "+r);
                }
                else{
                    System.out.println("Y é igual a Z");
                }
            }
            else{
                System.out.println("X é menor ou igual a Z");
            }
        }
        else{
            System.out.println("X é menor ou igual a Y");
        }
        
        System.out.println(" ");
        
        if(x>y){
            System.out.println("X é maior que Y");
            if(x>z){
                System.out.println("X é maior que Z");
                if(y!=z){
                    r = 1;
                    System.out.println("Valor de R: "+r);
                }
                else{
                    r = 2;
                    System.out.println("Valor de R "+ r);
                }
            }
            else{
                System.out.println("X é menor ou igual a Z");
            }
        }
        else{
            System.out.println("X é menor ou igual a Y");
        }
        
        System.out.println(" ");
        
        Media aluno1 = new Media(8,10,10);
        System.out.println(aluno1.getMedia());

        System.out.println(" ");

        aluno1.getMediaStatus();
        
        System.out.println(" ");
    }
}