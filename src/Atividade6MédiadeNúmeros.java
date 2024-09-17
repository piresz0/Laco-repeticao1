import java.util.Scanner;
public class Atividade6MédiadeNúmeros {

        public static void main(String[] args) {
            // Cria um objeto Scanner para ler a entrada do usuário
            Scanner scanner = new Scanner(System.in);

            // Solicita ao usuário o número de entradas
            System.out.print("Digite o número de valores que você deseja inserir: ");
            int n = scanner.nextInt();

            // Verifica se o número de entradas é válido
            if (n <= 0) {
                System.out.println("O número de entradas deve ser maior que 0.");
            } else {
                // Inicializa variáveis para calcular a soma dos números
                double soma = 0;

                // Loop para ler 'n' números do usuário
                for (int i = 1; i <= n; i++) {
                    System.out.print("Digite o valor " + i + ": ");
                    double valor = scanner.nextDouble();
                    soma += valor; // Adiciona o valor à soma total
                }

                // Calcula a média
                double media = soma / n;

                // Exibe o resultado
                System.out.println("A média dos " + n + " valores é: " + media);
            }

            // Fecha o scanner
            scanner.close();
        }
    }


