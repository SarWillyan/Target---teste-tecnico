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
