public class Peeplo_Form {
    private String name;
    private String phone;
    private String address;
    private String itr; // cpf
    private Car_Form  car;

    public Peeplo_Form(String name, String phone, String address, String itr){
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.itr = itr;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getPhone(){
        return this.phone;
    }
    public void setPhone(String phone){
        this.phone = phone;
    }
    public String getAdress(){
        return this.address;
    }
    public void setAdress(String address){
        this.address = address;
    }
    public String getItr(){
        return this.itr;
    }
    public void  setItr(String itr){
        this.itr = itr;
    }
    public Car_Form getCar(){
        return this.car;
    }
    public void setCar(Car_Form car){
        this.car = car;
    }
}
