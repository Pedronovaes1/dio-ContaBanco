import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o Número da conta: ");;
        int numeroConta = scan.nextInt();

        System.out.println("O número da agência: ");
        String agencia  = scan.next();
        
        System.out.println("O seu nome: ");
        String nomeCliente = scan.next();

        System.out.println("Seu saldo bancário: ");
        double saldo = scan.nextDouble();

        

        //Olá [Nome Cliente], obrigado por criar uma conta em nosso banco, sua agência é [Agencia], conta [Numero] e seu saldo [Saldo] já está disponível para saque

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível par saque" );
        
        
    }
}
