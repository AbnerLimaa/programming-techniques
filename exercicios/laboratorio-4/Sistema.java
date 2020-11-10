import java.lang.*;

public class Sistema
{
	private IConta[] contas = new IConta[3];

	public void criarContaXPTOBasic(int id)
	{
		XPTOBasic contaBasic = new XPTOBasic(id);
		for(int i = 0; i < contas.length; i++)
			if(contas[i] == null)
			{
				contas[i] = contaBasic;
				break;
			}
	}

	public void criarContaXPTOPlus(int id)
	{
		XPTOPlus contaPlus = new XPTOPlus(id);
		for(int i = 0; i < contas.length; i++)
			if(contas[i] == null)
			{
				contas[i] = contaPlus;
				break;
			}
	}

	public void criarContaXPTOExtreme(int id)
	{
		XPTOExtreme contaExtreme = new XPTOExtreme(id);
		for(int i = 0; i < contas.length; i++)
			if(contas[i] == null)
			{
				contas[i] = contaExtreme;
				break;
			}
	}

	public void creditar(int id, int valor)
	{
		for(int i = 0; i < contas.length; i++)
			if(contas[i].getID() == id)
			{
				contas[i].creditar(valor);
				break;
			}
	}

	public void debitar(int id, int valor)
	{
		for(int i = 0; i < contas.length; i++)
			if(contas[i].getID() == id)
			{
				contas[i].debitar(valor);
				break;
			}
	}

	public double consultarSaldo(int id)
	{
		for(int i = 0; i < contas.length; i++)
			if(contas[i].getID() == id)
				return contas[i].getSaldo();
		return 0;
	}
}