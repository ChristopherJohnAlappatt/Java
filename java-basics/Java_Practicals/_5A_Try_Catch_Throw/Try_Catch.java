package Java_Practicals._5A_Try_Catch_Throw;

public class Try_Catch {
    
    public static void main(String[] args) {
        
        int[] array = {1,2,3};
        try {
            
            System.out.println(array[3]);
        } catch (Exception e) {
            
            System.out.println("Exception Found !!!");
        }
        finally{
            System.out.println("We're in final block now");
        }

    }
}
