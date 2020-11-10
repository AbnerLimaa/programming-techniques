public class Multiplicacao extends Operacao
{
	public Multiplicacao(IExpressao esquerda, IExpressao direita)
	{
		super.esquerda = esquerda;
		super.direita = direita;
	}

	public String toString()
	{
		return "(" + super.esquerda.toString() + " * " + super.direita.toString() + ")";
	}

	@Override
	public double calcular()
	{
		return multiplicar(super.esquerda.calcular(), super.direita.calcular());
	}

	private double multiplicar(double a, double b)
	{
		return a * b;
	}
}