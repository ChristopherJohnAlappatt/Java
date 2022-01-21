package Java_Practicals._5B_User_defined_Exception;

public class My_Exception extends Exception {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    String str1;

     My_Exception(String str2) {

str1=str2;

}

public String toString(){

return ("MyException Occurred: "+str1) ;

}

}
