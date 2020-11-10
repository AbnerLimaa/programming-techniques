public class Conjunto
{
	private int[] conj;

	public Conjunto() { }

	public Conjunto(int n)
	{
		if (n > 0)
			conj = new int[n];
	}

	public String toString()
	{
		String conjStr = "{";
		if(vazio())
			return "{vazio}";
		for(int i = 0; i < tamanho(); i++)
		{
			conjStr = conjStr + conj[i];
			if(i < tamanho() - 1)
				conjStr = conjStr + ",";
		}
		return conjStr + "}";
	}

	public boolean vazio()
	{
		if(conj != null && tamanho() > 0)
		{
			if(conj[0] != 0)
				return false;
		}
		return true;
	}

	public int tamanho()
	{
		if(conj != null)
			return conj.length;
		return 0;
	}

	public int elemPosicao(int n)
	{
		if(conj != null)
			return conj[n];
		return 0;
	}

	public void inserir(int x)
	{
		if(x != 0)
		{
			int i = 0;
			while(i < tamanho())
			{
				if(conj[i] == 0)
				{
					conj[i] = x;
					i = tamanho();
				}
				else
					i++;
			}
		}
	}

	public boolean pertence(int x)
	{
		int i = 0;
		while (i < tamanho() && conj[i] != x)
			i++;
		if (i < tamanho())
			return true;
		return false;
	}

	public boolean eSubConjunto(Conjunto c)
	{
		if(tamanho() <= c.tamanho())
		{
			int i = 0;
			while(i < tamanho() && c.pertence(conj[i]))
				i++;
			if(i == tamanho())
				return true;
		}
		return false;
	}

	public Conjunto uniao(Conjunto c)
	{
		if(c != null)
		{
			int tamanho = tamanho() + c.tamanho();
			Conjunto uniao = new Conjunto(tamanho);
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

	public Conjunto intersecao(Conjunto c)
	{
		if(!vazio() && c != null && !c.vazio())
		{
			Conjunto intersecao;
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
				intersecao = new Conjunto(n);
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
		return new Conjunto();
	}

	public Conjunto diferenca(Conjunto c)
	{
		if(!vazio() && c != null && !c.vazio())
		{
			Conjunto diferenca;
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
				diferenca = new Conjunto(n);
				i = 0;
				while(i < tamanho())
				{
					if(!c.pertence(conj[i]))
						diferenca.inserir(conj[i]);
					i++;
				}
				return diferenca;
			}
			return new Conjunto();
		}
		if(vazio())
			return c;
		return this;
	}
}