import java.util.Scanner;

public class Elevator_form {
    // Atributos do elevador
    private int floorCurrent;
    private int totalFloors;
    private float ability;
    private int peoplePresent;
    private int[] andares;

    // Construtor
    public Elevator_form() {
        this.ability = 1600; // Definindo um valor padrão
        this.totalFloors = 5; // Definindo um valor padrão
        this.floorCurrent = 0;
        this.peoplePresent = 0;
        this.andares = new int[5]; // Iniciando o vetor de andares com 5 posições
    }

    // Getters e Setters
    public int getFloorCurrent() {
        return this.floorCurrent;
    }

    public void setFloorCurrent(int floorCurrent) {
        this.floorCurrent = floorCurrent;
    }

    public int getTotalFloors() {
        return this.totalFloors;
    }

    public void setTotalFloors(int totalFloors) {
        this.totalFloors = totalFloors;
    }

    public float getAbility() {
        return this.ability;
    }

    public void setAbility(float ability) {
        this.ability = ability;
    }

    public int getPeoplePresent() {
        return this.peoplePresent;
    }

    public void setPeoplePresent(int peoplePresent) {
        this.peoplePresent = peoplePresent;
    }


    public void Up(int desiredFloor) {
        if (desiredFloor > this.floorCurrent) {
            System.out.println("Subindo para o andar " + desiredFloor);
            this.floorCurrent = desiredFloor;
        } else {
            System.out.println("Você já está no andar ou em um andar superior.");
        }
    }


    public void Dow(int desiredFloor) {
        if (desiredFloor < this.floorCurrent) {
            System.out.println("Descendo para o andar " + desiredFloor);
            this.floorCurrent = desiredFloor;
        } else {
            System.out.println("Você já está no andar ou em um andar inferior.");
        }
    }


    public void status() {
        System.out.println("Andar atual: " + this.floorCurrent);
        System.out.println("Capacidade do elevador: " + this.ability + "kg");
        System.out.println("Pessoas presentes: " + this.peoplePresent);
    }


    public void Enters(int numPeople) {
        if ( this.peoplePresent <= 5 ) {
                this.peoplePresent = numPeople;
        } else {
            System.out.println("O elevador está cheio. Capacidade máxima de 5 pessoas.");
        }
    }


    public void Leaves(int numPeople) {
        if (this.peoplePresent  >= 0 && this.peoplePresent<=5) {
                this.peoplePresent = numPeople;
        } else {
            System.out.println("Não há tantas pessoas no elevador para sair.");
        }
    }
}


