import java.util.ArrayList;
import java.util.Scanner;

public class BaseDados {
    private static ArrayList<Usuario> usuarios;

    public static void createUsers(){
        usuarios = new ArrayList<>();

        Funcionario funcionario = new Funcionario("Francisco", "053.126.345-55", "francisconunes@gmail.com", "Motorista");
        Funcionario funcionario1 = new Funcionario("Maria", "043.134.543-77", "mariajose@gmail.com", "Limpeza");
        Funcionario funcionario2 = new Funcionario("Alisson", "231.126.321-88", "alissonrochavidal@gmail.com", "Professor");
        addUser(funcionario);
        addUser(funcionario1);
        addUser(funcionario2);

        Aluno aluno = new Aluno("Barnabé", "846.032.237-37", "barnabe@gmail.com", "DS", "1º ano");
        Aluno aluno2 = new Aluno("Virginia", "567.987.324-44", "virginiawepink@hotmail.com", "maquiagem", "2º ano");
        Aluno aluno3 = new Aluno("Expedito", "884.430.238-22", "expeditojose@outlook.com", "técnico em enfermagem", "3º ano");
        addUser(aluno);
        addUser(aluno2);
        addUser(aluno3);
    }

    public static void addUser(Usuario usuario) {
        usuarios.add(usuario);
    }

    public static void addUser() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Deseja adicionar Funcionário ou Aluno?");
        String opcao = scanner.nextLine();

        System.out.println("Nome: ");
        String nome = scanner.nextLine();

        System.out.println("CPF: ");
        String cpf = scanner.nextLine();

        System.out.println("Email: ");
        String email = scanner.nextLine();

        if(opcao.equalsIgnoreCase("funcionário")){
           System.out.println("Cargo: ");
           String cargo = scanner.nextLine();
           Usuario usuario = new Funcionario(nome, cpf, email, cargo);
           addUser(usuario);
        }

        if(opcao.equalsIgnoreCase("aluno")){
            System.out.println("Curso: ");
            String curso = scanner.nextLine();

            System.out.println("Turma: ");
            String turma = scanner.nextLine();

            Usuario usuario = new Aluno(nome, cpf, email, curso, turma);
            addUser(usuario);
        }
    }









    public static void listarUsuarios(){
        for(Usuario usuario : usuarios){
            if(usuario instanceof Funcionario funcionario){
                System.out.println(funcionario.getNome());
                System.out.println(funcionario.getCpf());
                System.out.println(funcionario.getEmail());
                System.out.println(funcionario.getCargo());
                System.out.println();
            }
            else if(usuario instanceof Aluno aluno){
                System.out.println();
                System.out.println(aluno.getNome());
                System.out.println(aluno.getCpf());
                System.out.println(aluno.getEmail());
                System.out.println(aluno.getCurso());
                System.out.println(aluno.getTurma());
            }
            else{
                System.out.println("Não existe Usuário cadastrado na base!");
            }
        }
   }
}
