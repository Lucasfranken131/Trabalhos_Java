package luquitas;

public class Sala {
	private String nome;
	private Porta portaEn;
	private Porta portaSa;
	private int maximo;
	private int quantos;
	
	public Sala(String nome, Porta portaEn, Porta portaSa, int maximo, int quantos) {
		this.nome = nome;
		this.portaEn = portaEn;
		this.portaSa = portaSa;
		this.maximo = maximo;
		this.nome = nome;
	}
	
	public String getSala(String nome){
		return this.nome;
	}
	
	public int getMaximo(int maximo){
		return this.maximo;
	}

	public int getQuantos(int quantos){
		return this.quantos;
	}

	public boolean estaCheia(int maximo, int quantos){
		if(this.quantos > this.maximo || this.quantos == this.maximo){
			return true;
		}
		else{
			return false;
		}
	}

	public boolean entra(Porta portaEn, int maximo, int quantos){
		if(this.quantos < this.maximo && this.portaEn.isAberta(true) == true){
			return true;
		}
		else{
			return false;
		}
	}

	public boolean sai(Porta portaSa, int maximo, int quantos){
		if(this.quantos <= this.maximo && this.portaSa.isAberta(true) == true){
			if(this.quantos == 0){
				return true;
			}
			else{
				this.quantos = this.quantos - 1;
				return true;
			}
		}
		else{
			return false;
		}
	}
}