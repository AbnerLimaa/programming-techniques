interface IConta 
{
	public int getID();

	public double getSaldo();

	public void creditar(double valor);

	public void debitar(double valor);
}