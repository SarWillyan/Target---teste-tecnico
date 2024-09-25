/**2) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo
 *valor sempre será a soma dos 2 valores anteriores
 *(exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...),
 *escreva um programa na linguagem que desejar onde, informado um número,
 *ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se
 *o número informado pertence ou não a sequência.
 */

import java.util.Scanner;

public class FibonacciValidation {
    public static Boolean isFibonacciValid(int n) {
        if (n < 0) // não existe
            return false;

        int next , a=0, b=1; // variáveis para encontrar o fibonacci

        while ( a <= n) {
            if (a == n)  // valor encontrado
                return true;
            next = a + b;
            a = b;
            b = next;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o número que deseja verifcar se pertence a sequencia de fibonacci: ");
        System.out.print("num: ");
        int n = sc.nextInt();

        System.out.println(isFibonacciValid(n));

        sc.close();
    }
}
