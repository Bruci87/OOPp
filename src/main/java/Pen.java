public class Pen {
        //create of attributes
        private  String model;
        private String colour;
        private float tip;
        private int load;
        private boolean copped;
        //create of constructor
        public Pen (){
            this.load = 100;
            this.copped = true;
        }
        //create get's i's set's
        private String getModel(){
            return this.model;
        }
        public void setModel(String model){
            this.model=model;
        }
        private String getColour(){
            return this.colour;
        }
        public void setColour(String colour){
            this.colour=colour;
        }
        private float getTip(){
            return this.tip;
        }
        public void setTip(float tip){
            this.tip=tip;
        }
        private int getLoad(){
            return this.load;
        }
        public void setLoad(int load){
            this.load=load;
        }
        private boolean getCopped(){
            return this.copped;
        }
        public void setCopped(boolean copped){
            this.copped=copped;
        }
        //Create methods
        public void status(){
            System.out.println("Model: "+model);
            System.out.println("Colour: "+colour);
            System.out.println("Tip: "+tip);
            System.out.println("Load: "+load);
            System.out.println("Copped: "+copped);
        }
        public void ToWrite (){
            if(this.getCopped() == false && this.getLoad()>0){
                System.out.println("Writing...");
            }else{
                System.out.println("Pen is capped or the pen charge is low on ink or faulty: ");
            }
        }
        public void coverUncap(){
            if(this.getCopped()==true){
                System.out.println("The pen is already capped: ");
            }else{
                System.out.println("Capping pen...");
            }
        }
        public boolean IsItCovered(){
            return this.getCopped();
        }
}
