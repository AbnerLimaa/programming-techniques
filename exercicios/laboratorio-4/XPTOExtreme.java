import java.lang.*;

public class XPTOExtreme implements IConta
{
	private int id;
	private double saldo;

	public XPTOExtreme(int id)
	{
		this.id = id;
	}

	//Polimorfismo de inclusão
	public int getID()
	{
		return id;
	}

	//Polimorfismo de inclusão
	public double getSaldo()
	{
		return saldo;
	}

	public String toString()
	{
		return "XPTOExtreme: ID " + id + ", Saldo: " + saldo;
	}

	//Polimorfismo de inclusão
	public void creditar(double valor)
	{
		if(valor > 0)
			saldo = saldo + valor + (valor * 0.002);
	}

	//Polimorfismo de inclusão
	public void debitar(double valor)
	{
		if(valor > 0 && ((valor - saldo) <= (valor * 0.002)))
			saldo = saldo - valor + (valor * 0.002);
	}
}