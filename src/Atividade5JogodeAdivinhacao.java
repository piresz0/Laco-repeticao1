import java.util.Random;
import java.util.Scanner;
public class Atividade5JogodeAdivinhacao {

        public static void main(String[] args) {
            // Cria um objeto Random para gerar números aleatórios
            Random random = new Random();

            // Gera um número aleatório entre 1 e 100
            int numeroSecreto = random.nextInt(100) + 1;

            // Cria um objeto Scanner para ler a entrada do usuário
            Scanner scanner = new Scanner(System.in);

            int palpite = 0;
            boolean acertou = false;

            // Início do jogo
            System.out.println("Bem-vindo ao jogo de adivinhação!");
            System.out.println("O computador escolheu um número entre 1 e 100.");

            // Loop para continuar pedindo palpites até o usuário acertar
            while (!acertou) {
                System.out.print("Digite seu palpite: ");
                palpite = scanner.nextInt();

                // Verifica o palpite do usuário
                if (palpite < numeroSecreto) {
                    System.out.println("O número secreto é maior. Tente novamente.");
                } else if (palpite > numeroSecreto) {
                    System.out.println("O número secreto é menor. Tente novamente.");
                } else {
                    System.out.println("Parabéns! Você acertou o número!");
                    acertou = true;
                }
            }

            // Fecha o scanner
            scanner.close();
        }
    }


