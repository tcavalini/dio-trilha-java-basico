import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
            System.out.println("Por favor, digite o nome do cliente: ");
            String nome = scanner.next();

            System.out.println("Por favor, digite o sobrenome do cliente: ");
            String sobrenome = scanner.next();

            System.out.println("Por favor, digite a agência do cliente: ");
            String agencia = scanner.next();

            System.out.println("Por favor, digite o número da conta do cliente: ");
            int numconta = scanner.nextInt();

            System.out.println("Por favor, digite o saldo do cliente: ");
            double saldo = scanner.nextDouble();
            

            System.out.println("Olá " + nome + " "+ sobrenome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta: "+ numconta + ". Seu saldo atual é de: R$ " + String.format("%.2f", saldo) + " e já está disponível para saque.") ;
        }
        

    }
}
