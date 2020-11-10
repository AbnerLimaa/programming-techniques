import java.lang.*;

public class XPTOBasic implements IConta
{
	private int id;
	private double saldo;

	public XPTOBasic(int id)
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
		return "XPTOBasic: ID " + id + ", Saldo: " + saldo;
	}

	//Polimorfismo de inclusão
	public void creditar(double valor)
	{
		if(valor > 0)
			saldo += valor;
	}

	//Polimorfismo de inclusão
	public void debitar(double valor)
	{
		if(valor > 0 && (saldo - valor) >= 0)
			saldo -= valor;
	}
}