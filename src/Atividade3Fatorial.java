import java.util.Scanner;

public class Atividade3Fatorial {


        public static void main(String[] args) {
            // Cria um objeto Scanner para ler a entrada do usuário
            Scanner scanner = new Scanner(System.in);

            // Solicita ao usuário que insira um número
            System.out.print("Digite um número para calcular o fatorial: ");
            int numero = scanner.nextInt();

            // Inicializa a variável que armazenará o resultado do fatorial
            long fatorial = 1;

            // Verifica se o número é negativo
            if (numero < 0) {
                System.out.println("O fatorial não é definido para números negativos.");
            } else {
                // Calcula o fatorial usando um loop do-while
                int i = 1;
                do {
                    fatorial *= i;
                    i++;
                } while (i <= numero);

                // Exibe o resultado
                System.out.println("O fatorial de " + numero + " é " + fatorial);
            }

            // Fecha o scanner
            scanner.close();
        }
    }




