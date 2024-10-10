import java.util.Scanner;
public class Elevator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Elevator_form elevator = new Elevator_form();
        System.out.println("Quantas pessoas vão entrar no elevador?");
        int numPeople = input.nextInt();
        while(numPeople <= -1 && numPeople >= 6){
            System.out.println("Esta contidade de: "+numPeople + " não é compativel. Selecione a quantidade de pessoas de novo: ");
            numPeople = input.nextInt();
        }
        int escolha;
        do {
            System.out.println("|==========================|\n" +
                    "|    SELECIONE O ANDAR:    |\n" +
                    "|==========================|\n" +
                    "| 0° Térreo                |\n" +
                    "| 1° Andar                 |\n" +
                    "| 2° Andar                 |\n" +
                    "| 3° Andar                 |\n" +
                    "| 4° Andar                 |\n" +
                    "| 5° Andar                 |\n" +
                    "| 6° Parada de emergência  |\n" +
                    "|==========================|\n");
            int desiredFloor = input.nextInt();
            while(desiredFloor < 0){
                System.out.println("Não existe andar negativo. Selecione o andar de novo: ");
                desiredFloor = input.nextInt();
            }
            if (desiredFloor >= 0 && desiredFloor <= 5) {
                if (desiredFloor > elevator.getFloorCurrent()) {
                    elevator.Up(desiredFloor);
                    elevator.Leaves(numPeople);
                    if(numPeople <0){
                        System.out.println(" pessoas presente: "+0+" serviço indisponível...");
                        break;
                    }else{
                        numPeople = numPeople-1;
                        System.out.println("Pessoas presentes no elevador: "+numPeople);
                    }
                } else if (desiredFloor < elevator.getFloorCurrent()) {
                    elevator.Dow(desiredFloor);
                    elevator.Leaves(numPeople);
                    if(numPeople <0){
                        System.out.println(" pessoas presente: "+0+" serviço indisponível...");
                        break;
                    }else{
                        numPeople = numPeople-1;
                        System.out.println("Pessoas presentes no elevador: "+numPeople);
                    }
                } else {
                    System.out.println("Você já está no andar " + desiredFloor);
                }
            } else if (desiredFloor == 6) {
                System.out.println("Parada de emergência ativada!");
                numPeople = 0;
            } else {
                System.out.println("Andar inválido!");
            }
            if(numPeople<0){
                System.out.println("Serviço indisponivel....");
                break;
            }
            System.out.println("Chegamos ao andar desejado. Quer selecionar outro andar? (1-Sim / 0-Não)");
            escolha = input.nextInt();
        } while (escolha == 1);
        elevator.status();
    }
}