package Java_Practicals._5B_User_defined_Exception;

public class User_Defined_Exception {
    
    public static void main(String args[]){

        try{
        
        System.out.println("Starting of try block"); 
        throw new My_Exception("ERROR MESSAGE");
        
        }
        
        catch(My_Exception exp){
        
        System.out.println("Catch Block") ;
        
        System.out.println(exp) ;
        
        }
        
        }
        
}
