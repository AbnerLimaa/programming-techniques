import java.lang.*;

public class XPTOPlus implements IConta
{
	private int id;
	private double saldo;

	public XPTOPlus(int id)
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
		return "XPTOPlus: ID " + id + ", Saldo: " + saldo;
	}

	//Polimorfismo de inclusão
	public void creditar(double valor)
	{
		if(valor > 0)
			saldo = saldo + valor + (valor * 0.005);
	}

	//Polimorfismo de inclusão
	public void debitar(double valor)
	{
		if(valor > 0 && (saldo - valor) >= 0)
			saldo -= valor;
	}
}