import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal{
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da conta.: ");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite o número da Agência.: ");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o nome do Cliente.: ");
        String nomeCliente = scanner.next();

        double saldo = 237.48;

        System.out.println("Olá " + nomeCliente + 
        " obrigado por criar uma conta em nosso banco, sua agência é "
        + agencia + ", conta " 
        + numero + " e seu saldo de R$ " 
        + saldo + " já está disponível para saque");

    }
}