import java.util.Scanner;

public class Atividade1Tabuada {

        public static void main(String[] args) {
            // Cria um objeto Scanner para ler a entrada do usuário
            Scanner scanner = new Scanner(System.in);

            // Solicita ao usuário que insira um número
            System.out.print("Digite um número para exibir a tabuada: ");
            int numero = scanner.nextInt();

            // Exibe a tabuada do número fornecido
            System.out.println("\nTabuada de " + numero + ":");

            // Loop para calcular e exibir a tabuada de 1 a 10
            for (int i = 1; i <= 10; i++) {
                int resultado = numero * i;
                System.out.println(numero + " x " + i + " = " + resultado);
            }

            // Fecha o scanner
            scanner.close();
        }
    }


