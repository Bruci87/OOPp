public class Pen {

    public static void main(String[] args) throws Exception{
        Pen_Form p1 = new Pen_Form();
        p1.setLoad(75);
        p1.setColour("vermelha");
        p1.setModel("compact");
        p1.setTip(7);

        p1.ToWrite();
        p1.status();
        p1.coverUncap();
    }
}
