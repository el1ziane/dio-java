import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner (System.in)) {
            int numero;
            String agencia;
            String nome;
            double saldo;
                
            System.out.println("Digite o numero da agencia: ");
            agencia = sc.nextLine();

            System.out.println("Digite seu nome: ");
            nome = sc.nextLine();

            System.out.println("Digite o numero da conta: ");
            numero = sc.nextInt();
                
            System.out.println("Digite seu saldo: ");
            saldo = sc.nextDouble();

                //imprimindo os dados obtidos pelo usuario
            System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
        }
        
    }
}
