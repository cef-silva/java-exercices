package entities;

public class PessoaJuridica extends Contribuintes{

	private Integer numFunc;
	
	public PessoaJuridica() {
	}
	
	public PessoaJuridica(String nome, Double rendaAnual, Integer numFunc) {
		super(nome, rendaAnual);
		this.numFunc = numFunc;
	}

	public Integer getNumFunc() {
		return numFunc;
	}

	public void setNumFunc(Integer numFunc) {
		this.numFunc = numFunc;
	}

	@Override
	public double calcImposto() {
		if(numFunc > 10) {
			return rendaAnual * 0.14;
		}
		else {
			return rendaAnual * 0.16;
		}
		
	}

	
}
