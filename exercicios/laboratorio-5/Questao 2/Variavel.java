public class Variavel implements IExpressao
{
	private double valor;

	public Variavel(double valor)
	{
		this.valor = valor;
	}

	public double getValor()
	{
		return valor;
	}

	public void setValor(double valor)
	{
		this.valor = valor;
	}

	public String toString()
	{
		return String.format("%.2f", valor);
	}

	public double calcular()
	{
		return valor;
	}
}