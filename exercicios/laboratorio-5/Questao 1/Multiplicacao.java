public class Multiplicacao implements IExpressao
{
	private IExpressao esquerda, direita;

	public Multiplicacao(IExpressao esquerda, IExpressao direita)
	{
		this.esquerda = esquerda;
		this.direita = direita;
	}

	public String toString()
	{
		return "(" + esquerda.toString() + " * " + direita.toString() + ")";
	}

	public double calcular()
	{
		return esquerda.calcular() * direita.calcular();
	}
}