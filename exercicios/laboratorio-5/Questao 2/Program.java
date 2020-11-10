public class Program
{
	public static void main(String[] args)
	{
		IExpressao a = new Variavel(18);
		IExpressao b = new Variavel(10);
		IExpressao c = new Variavel(2);
		IExpressao mult = new Multiplicacao(a, b);
		IExpressao div = new Divisao(mult, c);
		Operacao seno = new Seno(div);
		Operacao cosseno = new Cosseno(div);
		System.out.printf(seno.toString() + " = %.2f\n", seno.calcular());
		System.out.printf(cosseno.toString() + " = %.2f\n", cosseno.calcular());
	}
}