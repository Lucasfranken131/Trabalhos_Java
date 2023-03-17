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
}


