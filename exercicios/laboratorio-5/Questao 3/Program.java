import expressoes.Expressao;
import expressoes.Variavel;
import expressoes.Soma;
import expressoes.Multiplicacao;
import expressoes.Divisao;
import observer.IObservo;
import observer.IObservado;
import observer.ObservadorSinal;

public class Program
{
	public static void main(String[] args)
	{
		Expressao a = new Variavel(4);
		Expressao b = new Variavel(-3);
		Expressao c = new Variavel(2);
		Expressao x =  new Multiplicacao(a, b);
		Expressao y = new Soma(x, c);
		IObservo o = new ObservadorSinal(a);
		IObservo p = new ObservadorSinal(b);
		IObservo q = new ObservadorSinal(c);
		IObservo r = new ObservadorSinal(x);
		IObservo s = new ObservadorSinal(y);
		System.out.printf(y.toString() + " = %.2f\n", y.calcular());
	}
}