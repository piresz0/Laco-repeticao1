import java.util.Scanner;

public class Atividade4ValidaçãodeEntrada {

    public class IdadeValida {
        public static void main(String[] args) {
            // Cria um objeto Scanner para ler a entrada do usuário
            Scanner scanner = new Scanner(System.in);
            int idade;

            // Solicita a idade do usuário e valida a entrada
            do {
                System.out.print("Digite sua idade (deve ser maior que 0): ");
                idade = scanner.nextInt();

                // Verifica se a idade é válida
                if (idade <= 0) {
                    System.out.println("Idade inválida. Por favor, digite um número maior que 0.");
                }
            } while (idade <= 0);

            // Exibe a idade válida
            System.out.println("Idade válida recebida: " + idade);

            // Fecha o scanner
            scanner.close();
        }
    }

}
