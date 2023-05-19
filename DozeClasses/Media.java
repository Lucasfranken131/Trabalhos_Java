public class Media {

    double nota1;
    double nota2;
    double nota3;
    double media;

    public Media(double nota1,double nota2,double nota3){
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    double getMedia(){
        this.media = (this.nota1 + this.nota2 + this.nota3) / 3;
        return this.media;
    }

    void getMediaStatus(){
        if(this.media >= 9.3){
            System.out.println("Ótimo");
        }
        else if(this.media >= 8.5){
            System.out.println("Bom");
        }
        else if(this.media >= 6.0){
            System.out.println("Aprovado");
        }
        else{
            System.out.println("Em recuperação");
        }
    }
}
