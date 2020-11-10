package expressoes;

public class Variavel extends Expressao
{
	private double valor;

	public Variavel(double valor)
	{
		this.valor = valor;
	}

	public String toString()
	{
		return String.format("%.2f", valor);
	}

	public double calcular()
	{
		super.setresultado(valor);
		return super.getresultado();
	}
}