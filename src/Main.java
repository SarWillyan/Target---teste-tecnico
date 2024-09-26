import QUEST_1.SomaValue;
import QUEST_2.FibonacciValidation;
import QUEST_3.FaturamentoDistribuidora;
import QUEST_4.FaturamentoDistribuidoraEstados;
import QUEST_5.ReverseString;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Questão 1:");
        System.out.println(SomaValue.soma());
        System.out.println("----------------------------");

        System.out.println("Questão 2:");
        System.out.println("Insira o número que deseja verifcar se pertence a sequencia de fibonacci: ");
        System.out.print("num: ");
        int n = sc.nextInt();
        if (FibonacciValidation.isFibonacciValid(n))
            System.out.println("O valor " + n + " existe na sequencia de fibonacci");
        else
            System.out.println("O valor " + n + " não existe na sequencia de fibonacci");
        System.out.println("----------------------------");

        System.out.println("Questão 3:");
        String jsonPath = "src/QUEST_3/data/dados.json";
        FaturamentoDistribuidora fd =  new FaturamentoDistribuidora(jsonPath);
        System.out.println("Faturamento da distribuidora");
        System.out.println("Menor faturamento do mês da distribuido: " + fd.getMenorFaturamento());
        System.out.println("Maior faturamento do mês da distribuido: " + fd.getMaoirFaturamento());
        System.out.println(fd.diasValorMaiorQueMedia());
        System.out.println("----------------------------");

        System.out.println("Questão 4:");
        FaturamentoDistribuidoraEstados fde;
        fde = new FaturamentoDistribuidoraEstados(67836.43, 36678.66,
                                                  29229.88, 27165.48,
                                                19846.53 );
        System.out.println("O percentual de representação que cada estado teve dentro do valor total mensal da distribuidora:");
        System.out.println("Valor Total: R$ " +  fde.getTotal());
        System.out.println(fde.percentualGeral());
        System.out.println("----------------------------");

        System.out.println("Questão 5:");
        sc.nextLine();//limpar buffer
        System.out.println("Insira uma frase e obtenha ela invertida:");
        System.out.print("frase: ");
        String frase = sc.nextLine();
        System.out.println(ReverseString.reverse(frase));
    }
}
