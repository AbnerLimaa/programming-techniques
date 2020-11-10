package observer;

public interface IObservado
{
	public void inserir(IObservo o);

	public void remover(IObservo o);

	public void notificar();

	public double getestado();
}