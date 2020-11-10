import java.util.*;

class Teste_Hash2 
{
    public static void main(String args[])
    {
        Set<String> mesesHash1 = new TreeSet<>();
        Set<String> mesesHash2 = new LinkedHashSet<>();
        mesesHash1.add("Janeiro");
        mesesHash1.add("Fevereiro");
        mesesHash1.add("Março");
        mesesHash1.add("Abril");
        mesesHash1.add("Maio");
        mesesHash1.add("Fevereiro");
        System.out.println("TreeSet:");
        Teste_Hash2.listar(mesesHash1);
        Teste_Hash2.listar2(mesesHash1);
        mesesHash2.add("Janeiro");
        mesesHash2.add("Fevereiro");
        mesesHash2.add("Março");
        mesesHash2.add("Abril");
        mesesHash2.add("Maio");
        mesesHash2.add("Fevereiro");
        System.out.println("LinkedHashSet:");
        Teste_Hash2.listar(mesesHash2);
        Teste_Hash2.listar2(mesesHash2);
    }

    private static void listar(Collection c)
    {
        System.out.println(c);
    }

    private static void listar2(Collection c)
    {
        System.out.println("*** Listar 2 ****");
        for(Object o : c)
            System.out.println(o);
    }
}