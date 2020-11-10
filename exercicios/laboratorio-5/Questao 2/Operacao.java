public abstract class Operacao implements IExpressao
{
	protected IExpressao expressao;
	protected IExpressao esquerda, direita;

	public double calcular()
	{
		return expressao.calcular();
	}
}