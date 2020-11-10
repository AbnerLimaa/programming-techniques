package expressoes;
import observer.*;

public abstract class Expressao implements IObservado
{
    protected IObservo[] observadores = new IObservo[5];
    private double resultado;

	protected double getresultado()
	{
		return resultado;
	}

	protected void setresultado(double valor)
	{
		resultado = valor;
		notificar();
	}

	public abstract double calcular();

    public void inserir(IObservo o)
	{
		int i = 0;
		while(i < 5)
		{
			if(observadores[i] == null)
			{
				observadores[i] = o;
				i = 5;
			}
			else
				i++;
		}
	}

	public void remover(IObservo o)
	{
		int i = 0;
		while(i < 5)
		{
			if(o == observadores[i])
			{
				observadores[i] = null;
				i = 5;
			}
			else
				i++;
		}
	}

	public void notificar()
	{
		for(int i = 0; i < 5; i++)
			if(observadores[i] != null)
				observadores[i].update();
	}

	public double getestado()
	{
		return resultado;
	}
}