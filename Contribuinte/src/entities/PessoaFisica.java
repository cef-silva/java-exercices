package entities;

public class PessoaFisica extends Contribuintes{

	private Double gastoSaude;
	
	public PessoaFisica() {
	}
	
	public PessoaFisica(String nome, Double rendaAnual, Double gastoSaude) {
		super(nome, rendaAnual);
		this.gastoSaude = gastoSaude;
	}

	public Double getGastoSaude() {
		return gastoSaude;
	}

	public void setGastoSaude(Double gastoSaude) {
		this.gastoSaude = gastoSaude;
	}

	@Override
	public double calcImposto() {
		if(rendaAnual < 20000.0) {
			if(gastoSaude > 0.0) {
				return (0.15 * rendaAnual) - (0.5 * gastoSaude);
			}
			return 0.15 * rendaAnual;
		}
		else {
			if(gastoSaude > 0.0) {
				return (0.25 * rendaAnual) - (0.5 * gastoSaude);
			}
			return 0.25 * rendaAnual;
		}
	}

		
}
