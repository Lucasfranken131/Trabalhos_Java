 

public class main {
	public main(String args[]) {
		
		Porta portaEn = new Porta(3,true);
		Porta portaSa = new Porta(2, false);
				
		Sala Sala1 = new Sala("Geografia",portaEn, portaSa, 30, 5);
	}
}