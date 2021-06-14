package br.edu.insper.desagil.alfandega;

public class ItemTarifado extends Item {
	private String nome;
	private double valor;
	private double rate;
	private double tarifa;

	public ItemTarifado(String nome, double valor, double rate, double tarifa) {
		super(nome, valor, rate);
		this.tarifa = tarifa;
	}

	public String getNome() {
		return this.nome;
	}

	public double getValor() {
		return this.valor;
	}

	public double getRate() {
		return this.rate;
	}

	public double getTarifa() {
		return this.tarifa;
	}
	
	@Override
	public double getTotalDec() {
		double totalDec = super.getRate() * super.getValor();
		return totalDec;
	}
	
	@Override
	public double getTotalDev() {
		double totalDev = super.getRate() * super.getValor() * this.tarifa;
		return totalDev;
	}
	
}
