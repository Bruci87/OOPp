import org.w3c.dom.ls.LSOutput;

public class MainCarPeeplo {
    public static void main(String[] args) {
        //Builder's Invocation
        Peeplo_Form peplo  = new Peeplo_Form("Jane", "+55 (84) 9 9124-4213", "Street ABC", "800.472.157-03");
        Car_Form car = new Car_Form("White", "Porsche", peplo);
        peplo.getAdress();
        peplo.setCar(car);
        System.out.println("Car: "+ peplo.getCar().model);
        System.out.println("Colour: "+ peplo.getCar().getCor());
        System.out.println("Model: "+ peplo.getCar().getPeeplo());
    }
}
