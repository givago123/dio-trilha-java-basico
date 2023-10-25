import java.util.Scanner;

public class ContaTerminal{
    /**
     * @param args
     */
    public static void main(String[] args){
        int numero;
        String nome, agencia;
        Float saldo;
        try (Scanner teclado = new Scanner(System.in)) {
            System.out.println("Por favor, digite o numero da sua conta!");
            numero = teclado.nextInt();

            System.out.println("Por favor, digite o numero da sua Agência!");
            agencia = teclado.next();

            System.out.println("Por favor, digite o nome do cliente!");
            nome = teclado.next();

            System.out.println("Digite o saldo em sua conta!");
            saldo = teclado.nextFloat();

            System.out.printf("Olá " + nome);
            System.out.printf(", obrigado por criar uma conta em nosso banco, sua agência é " + agencia );
            System.out.printf(", conta " + numero);
            System.out.printf(" e seu saldo " + saldo );
            System.out.printf(" já está disponível para saque.");

            teclado.close();
            
        }
     }

}
