import java.lang.*;

public class Teste
{
	public static void main(String[] args)
	{
		Sistema s = new Sistema();

		s.criarContaXPTOBasic(1);
		s.criarContaXPTOPlus(2);
		s.criarContaXPTOExtreme(3);

		for(int i = 1; i<=3; i++) 
			s.creditar(i,1000);

		for(int i = 1; i<=3; i++) 
			s.debitar(i,10);
		
		//todas as igualdades devem ser verdadeiras
		if(s.consultarSaldo(1) == 990)
			System.out.println("Conta Basic Funcionou");
		if(s.consultarSaldo(2) == 995)
			System.out.println("Conta Plus Funcionou");
		if(s.consultarSaldo(3) == 992.02)
			System.out.println("Conta Extreme Funcionou");
	}
}