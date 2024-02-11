import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {
      // Conhecer e importar a classe Scanner 
      Scanner scanner = new Scanner(System.in);
  
      // Exibir as mensagens para o usuário.
      System.out.println("Por favor, digite o número da Agência:");
      String agencia = scanner.nextLine();
  
      System.out.println("Por favor, digite o número da Conta:");
      int numero = scanner.nextInt();
      scanner.nextLine(); // Consumindo a quebra de linha pendente
  
      System.out.println("Por favor, digite o Nome do Cliente:");
      String nomeCliente = scanner.nextLine();
  
      System.out.println("Por favor, digite o saldo da conta:");
      double saldo = scanner.nextDouble();
  
      // Exibir a mensagem da conta criada
      System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " +
              agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
      
      scanner.close(); // Fecha o scanner
    }
  }