import java.util.Scanner;

public class contaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO: Conhecer e importa as Class Scaner

        //Exibir as msg para o nosso usuario

        //Obter pela class Scaner os valores digitadados no terminal

        //Exibir a msg conta criada

        Scanner scanner = new Scanner(System.in);

        System.out.println("Seja bem vindo, a seguir preencha as informa para abertura de sua conta!!!!");

        System.out.println("Por favor, digite o número da Agência (exemplo: XXX-0):");
        String agencia = scanner.nextLine();
        
        System.out.println("Por favor, digite o número da Conta:");
        int numero = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Por favor, digite o nome do Cliente:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor digite o saldo:");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + 
        " conta " + numero + " e seu saldo " + saldo + " já está disponivel para saque.");

    }
}
