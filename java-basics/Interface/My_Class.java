package Interface;

public class My_Class implements WaterBottleInterface{

    public static void main(String[] args) {
        
        My_Class wb = new My_Class();
        System.out.println(color);
        wb.FillUp();
        wb.PourOut();
    }
    @Override
    public void FillUp() {
            System.out.println("The Bottle is filled ...");
    }

    @Override
    public void PourOut() {
            System.out.println("The Bottle is Poured Out ...");

    }
    
}
