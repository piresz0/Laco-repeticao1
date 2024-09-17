import java.util.Scanner;

public class Atividade2ContagemRegressiva {

    public static void main(String[] args) {
            // Cria um objeto Scanner para ler a entrada do usuário
            Scanner scanner = new Scanner(System.in);

            // Solicita ao usuário que insira um número inicial
            System.out.print("Digite um número inicial para a contagem regressiva: ");
            int numero = scanner.nextInt();

            // Verifica se o número é não-negativo
            if (numero < 0) {
                System.out.println("Por favor, digite um número não-negativo.");
            } else {
                // Realiza a contagem regressiva usando um loop while
                System.out.println("Contagem regressiva:");
                while (numero >= 0) {
                    System.out.println(numero);
                    numero--; // Decrementa o número
                }
            }

            // Fecha o scanner
            scanner.close();
        }
    }


