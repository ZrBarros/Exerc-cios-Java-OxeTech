import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private List<String> toDoList = new ArrayList<>();

    public void addTask(String task) {
        toDoList.add(task);
    }

    public void markTaskAsDone(String task) {
        toDoList.remove(task);
    }

    public void listTasks() {
        for (String task : toDoList) {
            System.out.println(task);
        }
    }

    public static void main(String[] args) {
        Main toDoList = new Main();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Adicionar tarefa");
            System.out.println("2. Marcar tarefa como concluída");
            System.out.println("3. Listar tarefas");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.print("Digite a tarefa: ");
                    String task = scanner.nextLine();
                    toDoList.addTask(task);
                    break;
                case 2:
                    System.out.print("Digite a tarefa concluída: ");
                    task = scanner.nextLine();
                    toDoList.markTaskAsDone(task);
                    break;
                case 3:
                    toDoList.listTasks();
                    break;
                case 4:
                    System.exit(0);
            }
        }
    }
}
