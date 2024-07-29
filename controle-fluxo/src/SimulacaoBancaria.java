import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        boolean continuar = true;

        while (continuar) {

            System.out.println("Selecione uma das seguintes opções: \n1. Depositar \n2.Sacar \n3.Consultar \n4.Saldo Encerrar");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                  int deposito = System.out.println("Digite o valor a ser depositado: " + scanner.nextInt());
                  System.out.println(deposito);
                    // TODO: Ler o valor a ser depositado e atualizar/imprimir o saldo.
                    break;
                case 2:
                    // TODO: Ler o valor a ser sacado e verificar/imprimir se há saldo suficiente.
                    break;
                case 3:
                    // TODO: Exibir o saldo atual da conta.
                    break;
                case 4:
                    System.out.println("Programa encerrado.");
                    continuar = false;  // Atualiza a variável de controle para encerrar o loop
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }
}