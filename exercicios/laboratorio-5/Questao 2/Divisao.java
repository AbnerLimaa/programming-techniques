public class Divisao extends Operacao
{
	public Divisao(IExpressao esquerda, IExpressao direita)
	{
		super.esquerda = esquerda;
		super.direita = direita; 
	}

	public String toString()
	{
		return "(" + super.esquerda.toString() + " / " + super.direita.toString() + ")";
	}

	@Override
	public double calcular()
	{
		return dividir(super.esquerda.calcular(), super.direita.calcular());
	}

	private double dividir(double a, double b)
	{
		if(b == 0)
			throw new IllegalArgumentException("Divisao por 0");
		return a / b;
	}
}