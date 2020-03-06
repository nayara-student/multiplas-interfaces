package multiplasInterfaces;

public class Cliente implements Parcela, Seguro {
	private String primeiroNome;
	private String ultimoNome;
	
	public Cliente(String primeiroNome, String ultimoNome) {
		super();
		this.primeiroNome = primeiroNome;
		this.ultimoNome = ultimoNome;
	}

	public String getPrimeiroNome() {
		return primeiroNome;
	}

	public void setPrimeiroNome(String primeiroNome) {
		this.primeiroNome = primeiroNome;
	}

	public String getUltimoNome() {
		return ultimoNome;
	}

	public void setUltimoNome(String ultimoNome) {
		this.ultimoNome = ultimoNome;
	}
	
	@Override
	public void solicitarSeguro(String nome) {
		System.out.println("\n===Desfrute das acomodidades do Seguro Mão na Roda===");
		System.out.printf("%s é o titular do novo seguro.\n", nome);
	}

	@Override
	public void calcularParcela(double taxa, double lanceLivre) {
		System.out.println("\n===Cálculo das parcelas===");
		System.out.printf("Valor das parcelas: %.2f\n",(taxa*lanceLivre));
	}
}
