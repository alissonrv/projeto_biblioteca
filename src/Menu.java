import java.util.Scanner;

public class Menu {
    public static void exibir(){
        int opcao;
        do {
            System.out.println("===== SISTEMA DA BIBLIOTECA =====");
            System.out.println("1 - Cadastrar Livro");
            System.out.println("2 - Listar Livros");
            System.out.println("3 - Cadastrar Usuário");
            System.out.println("4 - Listar Usuários");
            System.out.println("5 - Realizar Empréstimo");
            System.out.println("6 - Devolver Livro");
            System.out.println("7 - Sair");

            System.out.println("Digite uma opção: ");
            Scanner scanner = new Scanner(System.in);
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("opcao 1");
                    continue;
                case 2:
                    System.out.println("opcao 2");
                    continue;
                case 3:
                    System.out.println("opcao 3");
                    continue;
                case 4:
                    System.out.println("opcao 4");
                    continue;
                case 5:
                    System.out.println("opcao 5");
                    continue;
            }

            scanner.close();
        } while (opcao != 7);
    }
}
