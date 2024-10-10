import java.util.Scanner;
import java.util.ArrayList;
public class Aluno {
    public static void main(String[] args) {
        ArrayList<AlunoForm> listaaluno = new ArrayList<>();
        AlunoForm a1= new AlunoForm();
        Scanner menu = new Scanner(System.in);
        int recebe;
        do {
            System.out.println("========================================");
            System.out.println("            MENU PRINCIPAL");
            System.out.println("========================================");
            System.out.println("1 - Cadastar aluno");
            System.out.println("2 - cadastrar notas");
            System.out.println("3 - calcular medias");
            System.out.println("4 - Informar situaçoes");
            System.out.println("5 - Informar dados de um aluno");
            System.out.println("6 - Alterar nota");
            System.out.println("7 - Sair");
            System.out.println("=========================================");
            int op = menu.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Informe o nome do aluno(as):");
                    menu.nextLine();
                    String name = menu.nextLine();
                    a1.setName(name);
                    listaaluno.add(a1);
                    System.out.println("Insira a matricula:");
                    int enrollment1 = menu.nextInt();
                    a1.setEnrollment(enrollment1);
                    listaaluno.add(a1);
                    System.out.println("ALunos cadastrado com sucesso!");
                    break;
                case 2:
                    System.out.println("Digite a matricula do aluno(a): ");
                    int enrollment = menu.nextInt();
                    if(enrollment == a1.getEnrollment()) {
                        System.out.println(" Digite as notas do semestre(Use a virgular para separar): ");
                        float grades1 = menu.nextFloat();
                        float grades2 = menu.nextFloat();
                        float grades3 = menu.nextFloat();
                        a1.setGrades(grades1, grades2, grades3);
                        listaaluno.add(a1);
                    }else{
                        System.out.println("Aluno nao encontrado: ");
                        break;
                    }
                    break;
                case 3:
                    System.out.println("Calculando a média do aluno(a) cadastrado...");
                    for (AlunoForm aluno : listaaluno) {
                        aluno.calculateAverage();
                    }
                    System.out.println("Average: "+ a1.getAverage());
                    break;
                case 4:
                    System.out.println("\n Status: "+a1.getStatus());
                    break;
                case 5:
                    System.out.println("Status: "+a1.getStatus());
                    System.out.println("Enrollment: "+a1.getEnrollment());
                    System.out.println("Name: "+a1.getName());
                    System.out.println("Average: "+a1.getAverage());
                    System.out.println("Note 1: "+a1.getGrades1()+"\n Note 2: "+a1.getGrades2()+"\n Note 3: "+a1.getGrades3());
                    break;
                case 6:
                    System.out.println("Digite a matricula do aluno(a): ");
                    int Enrollment = menu.nextInt();
                    if(Enrollment == a1.getEnrollment()) {
                        System.out.println(" Digite as notas do semestre(Use a virgular para separar): ");
                        float grades1 = menu.nextFloat();
                        float grades2 = menu.nextFloat();
                        float grades3 = menu.nextFloat();
                        a1.setGrades(grades1, grades2, grades3);
                        listaaluno.add(a1);
                    }
                    break;
                case 7:
                    System.out.println("Saindo....");
                    break;
                default:
                    System.out.println("Não existe essa opção...");
            }
            System.out.println("Deseja continuar? 1-Sim/2-Nao");
             recebe = menu.nextInt();
        }while (recebe==1);
    }
}
