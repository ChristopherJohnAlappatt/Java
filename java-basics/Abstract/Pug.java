package Abstract;

public  class Pug extends Dog {

    @Override
    public void poop() {
        System.out.println("Poop...");

    }
    public static void main(String[] args) {
        
        Dog p = new Pug();
            
        p.poop();
        p.Bark();
    }
    
}
