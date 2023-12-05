package ToDo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static List<Tarefas> toDoList = new ArrayList<>();
    static List<Tarefas> doneList = new ArrayList<>();

    public static Tarefas addTask() {
        Scanner categoriaScan = new Scanner(System.in);
        Scanner nomeScan = new Scanner(System.in);
        Scanner descScan = new Scanner(System.in);

        System.out.println("Digite a categoria da task:");
        String categoria = categoriaScan.nextLine();

        System.out.println("Digite o nome da task:");
        String task = nomeScan.nextLine();

        System.out.println("Digite a descricao da task:");
        String descricao = descScan.nextLine();

        return new Tarefas(task, descricao, categoria);
    }

    public static void marcarFeito(String nomeTarefa) {
        for (Tarefas tarefa : toDoList) {
            if (tarefa.getNome().equals(nomeTarefa)) {
                tarefa.setFeito(true);
                doneList.add(tarefa);
                toDoList.remove(tarefa);
                break;
            }
        }
    }

    public static void listarTasks() {
        System.out.println("\nTarefas em aberto:");
        for (Tarefas tarefa : toDoList) {
            System.out.println("Categoria: " + tarefa.getCategoria() + ", Nome: " + tarefa.getNome() + ", Descrição: "
                    + tarefa.getDescricao());
        }
        System.out.println("\nTarefas concluídas:");
        for (Tarefas tarefa : doneList) {
            System.out.println("Categoria: " + tarefa.getCategoria() + ", Nome: " + tarefa.getNome() + ", Descrição: "
                    + tarefa.getDescricao());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1 - Adicionar tarefa");
            System.out.println("2 - Marcar tarefa como concluída");
            System.out.println("3 - Listar tarefas");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    toDoList.add(addTask());
                    break;
                case 2:
                    System.out.print("Digite a tarefa concluída: ");
                    String task = scanner.nextLine();
                    marcarFeito(task);
                    break;
                case 3:
                    listarTasks();
                    break;
                case 4:
                    System.exit(0);
            }
        }
    }
}
