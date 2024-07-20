import java.util.Locale;
import java.util.Scanner;


public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o número da Agencia: ");
        String agencia = scanner.next();
        System.out.println("Agencia: " + agencia);

        
        
        System.out.println("Digite o número do Usuário: ");
        int NumeroUsuario = scanner.nextInt();
        System.out.println("Agencia: " + agencia +" Usuário: " + NumeroUsuario);


        System.out.println("Digite seu nome: ");
        String NomeCliente = scanner.next();
        System.out.println("Agencia: " + agencia +" Usuário: " + NumeroUsuario+ " Nome do cliente: " + NomeCliente);

        

        System.out.println("Digite o saldo disponivel: ");
        double saldo = scanner.nextDouble();
        System.out.println("Agencia: " + agencia +" Usuário: " + NumeroUsuario+ " Nome do cliente: " + NomeCliente + " Saldo: " + saldo);



        System.out.println("Ola, " + NomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é " + 
        agencia + " conta " + NumeroUsuario + " e seu saldo " + saldo +" já está disponível para saque");
        
    }
}
