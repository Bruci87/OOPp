public class Car_Form {
    //Create of methods
    private String color;
    String model;
    private Peeplo_Form peeplo;

    public Car_Form(String color, String model, Peeplo_Form peplo){
        this.color = color;
        this.model = model;
        this.peeplo = peplo;
    }
    public String getCor(){
        return  this.color;
    }
    public void setCor(String cor){
        this.color=cor;
    }
    public String getModelo(){
        return  this.model;
    }
    public void setModelo(String modelo){
        this.model = modelo;
    }
    public Peeplo_Form getPeeplo(){
        return this.peeplo;
    }
    public void setPeeplo(Peeplo_Form peeplo){
        this.peeplo = peeplo;
    }
}
