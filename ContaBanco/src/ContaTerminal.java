import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        try{
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, digite o número da conta:");
        int numeroConta = Integer.parseInt(sc.nextLine());
        System.out.println("Agora, o número da agência: ");
        String numeroAgencia = sc.nextLine();
        System.out.println("Digite o seu nome completo: ");
        String nomeCliente = sc.nextLine();
        System.out.println("Agora digite o saldo da conta: ");
        double saldoConta = Double.parseDouble(sc.nextLine());
        sc.close();
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco.\n", nomeCliente);
        System.out.printf("Sua conta de número %d na agência %s foi criada com sucesso e seu saldo de R$ %.2f já está disponível para saque.\n",
                numeroConta, numeroAgencia, saldoConta);
        }
        catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
