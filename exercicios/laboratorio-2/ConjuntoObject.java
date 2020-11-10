import java.lang.*;

public class ConjuntoObject
{
	private Object[] conj;

	public ConjuntoObject() { }

	public ConjuntoObject(int n)
	{
		if(n > 0)
			conj = new Object[n];
	}

	public String toString()
	{
		String conjStr = "{";
		if(vazio())
			return "{vazio}";
		for(int i = 0; i < tamanho(); i++)
		{
			conjStr = conjStr + conj[i].toString();
			if(i < tamanho() - 1)
				conjStr = conjStr + ",";
		}
		return conjStr + "}";
	}

	public boolean vazio()
	{
		if(tamanho() == 0)
			return true;
		return false;
	}

	public int tamanho()
	{
		if(conj != null)
			return conj.length;
		return 0;
	}

	public Object elemPosicao(int n)
	{
		if(conj != null)
			return conj[n];
		return null;
	}

	public void inserir(Object obj)
	{
		if(obj != null)
		{
			int i = 0;
			while(i < tamanho())
			{
				if(conj[i] == null)
				{
					conj[i] = obj;
					i = tamanho();
				}
				else
					i++;
			}
		}
	}

	public boolean pertence(Object obj)
	{
		if(obj != null)
		{
			int i = 0;
			while(i < tamanho() && conj[i] != null && !conj[i].equals(obj))
				i++;
			if(i < tamanho())
				return true;
		}
		return false;
	}

	public boolean eSubConjunto(ConjuntoObject c)
	{
		if(c != null && !c.vazio() && tamanho() <= c.tamanho())
		{
			int i = 0;
			while(i < tamanho() && c.pertence(conj[i]))
				i++;
			if(i == tamanho())
				return true;
		}
		return false;
	}

	public ConjuntoObject uniao(ConjuntoObject c)
	{
		if(c != null)
		{
			int tamanho = tamanho() + c.tamanho();
			ConjuntoObject uniao = new ConjuntoObject(tamanho);
			for(int i = 0; i < tamanho; i++)
			{
				if(i < tamanho())
					uniao.inserir(elemPosicao(i));
				else
					uniao.inserir(c.elemPosicao(i - tamanho()));
			}
			return uniao;
		}
		return null;
	}

	public ConjuntoObject intersecao(ConjuntoObject c)
	{
		if(c != null)
		{
			ConjuntoObject intersecao;
			int i = 0;
			int n = 0;
			while(i < tamanho())
			{	
				if(c.pertence(conj[i]))
					n++;
				i++;
			}
			if(n > 0)
			{
				intersecao = new ConjuntoObject(n);
				i = 0;
				while(i < tamanho())
				{
					if(c.pertence(conj[i]))
						intersecao.inserir(conj[i]);
					i++;
				}
				return intersecao;
			}
		}
		return new ConjuntoObject();
	}

	public ConjuntoObject diferenca(ConjuntoObject c)
	{
		if(c != null)
		{
			ConjuntoObject diferenca;
			int i = 0;
			int n = 0;
			while(i < tamanho())
			{
				if(!c.pertence(conj[i]))
					n++;
				i++;
			}
			if(n > 0)
			{
				diferenca = new ConjuntoObject(n);
				i = 0;
				while(i < tamanho())
				{
					if(!c.pertence(conj[i]))
						diferenca.inserir(conj[i]);
					i++;
				}
				return diferenca;
			}
			return new ConjuntoObject();
		}
		return null;
	}

	public ConjuntoObject prodCartesiano(ConjuntoObject c)
	{
		if (c != null && !c.vazio())
		{
			ConjuntoObject prodCartesiano = new ConjuntoObject(tamanho() * c.tamanho());
			for(int i = 0; i < tamanho(); i++)
				for(int j = 0; j < c.tamanho(); j++)
				{
					ConjuntoObject tupla = new ConjuntoObject(2);
					tupla.inserir(conj[i]);
					tupla.inserir(c.elemPosicao(j));
					prodCartesiano.inserir(tupla);
				}
			return prodCartesiano;
		}
		return null;
	}

	public ConjuntoObject potencia()
	{
		if(!vazio())
		{
			ConjuntoObject partes = new ConjuntoObject((int)Math.pow(2, tamanho()));
			partes.inserir(new ConjuntoObject());
			for(int i = 0; i < tamanho(); i++)
			{
				ConjuntoObject obj = new ConjuntoObject(1);
				obj.inserir(conj[i]);
				conjPartes(obj, i, partes);
			}
			return partes;
		}
		return null;
	}

	private void conjPartes(ConjuntoObject obj, int i, ConjuntoObject partes)
	{
		partes.inserir(obj);
		for(int j = i + 1; j < tamanho(); j++)
		{
			ConjuntoObject x = new ConjuntoObject(1);
			x.inserir(conj[j]);
			conjPartes(obj.uniao(x), j, partes);
		}
	}
}