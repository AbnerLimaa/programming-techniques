package observer;

public class ObservadorSinal implements IObservo
{
	private IObservado observado;
	private double estado;

	public ObservadorSinal(IObservado observado)
	{
		this.observado = observado;
		observado.inserir(this);
	}

	public void update()
	{
		estado = observado.getestado();
		System.out.printf("%.2f\n", estado);
	}
}