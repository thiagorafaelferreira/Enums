package enums;

public enum Logica {
	TRUE(1), FALSE(0);
	
	private final Integer valor;
	
	Logica(Integer valor) {
		this.valor = valor;
	}
	
	public Integer getValor() {
		return this.valor;
	}
	
	
}
