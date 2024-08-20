import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
               //TODO: Conhecer e importar a classe Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        //Exibir as mensagens para o nosso usuário
        //Obter pela scanner os valores digitados no terminal
        System.out.println("Informe qual será o número da conta: ");
            int numero = scanner.nextInt();

        System.out.println("Informe qual agência pertencerá a conta: ");
            String agencia = scanner.next();

        System.out.println("Digite o seu nome: ");
            String nomeCliente = scanner.next();

        System.out.println("Qual será o valor do saldo: ");
            double saldo = scanner.nextDouble();        
        
            //Exibir a mensagem conta criada
        System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo "+saldo+" já está disponível para saque."); 
    }
}
