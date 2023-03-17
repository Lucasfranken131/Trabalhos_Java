package luquitas;

public class Porta {
	private int cor;
	private boolean aberta;
	
	
	public Porta(int cor, boolean aberta) {
		this.cor = cor;
		this.aberta = aberta;	
	}
	
	public int setCor(int cor) {

		return this.cor;
	}
	
	public boolean isAberta(boolean aberta) {
		if(this.aberta == true) {
			return true;
		}
		else {
			return false;
		}
	}

	public int getCor(int cor) {
		return this.cor;
	}

	public String getDescricaoCor(int cor){
		if(this.cor == 1){
			return "verde";
		}
		else if(this.cor == 2){
			return "azul";
		}
		else if(this.cor == 3){
			return "amarelo";
		}
		else if(this.cor == 4){
			return "vermelho";
		}
		else{
			return "branco";
		}
	}

	public Boolean abre(boolean aberta){
		if(this.aberta == false){
			return true;
		}
		else{
			return true;
		}
	}

	public Boolean fecha(boolean aberta){
		if(this.aberta == true){
			return false;
		}
		else{
			return false;
		}
	}
}