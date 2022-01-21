package Java_Practicals._4C_Multiple_Inheritance_Using_Interfaces;


public class Result extends Test implements Sports{

    @Override
    public void Play() {
        System.out.println("Playing ...");

    }
     public  void display(){
         System.out.println("Name of the Student : "+ getName());
         System.out.println("Roll No of the Student : "+ getRoll_No());
         System.out.println("Marks in Sub1 and Sub2 : " +getMark_in_Sub_1()+" "+getMark_in_Sub_2());
     }
    
     public static void main(String[] args) {
         
        Result st = new Result();
        st.setName("Christopher John");
        st.setRoll_No(1019103);
        st.setMark_in_Sub_1(100);
        st.setMark_in_Sub_2(99);
        st.display();
        st.Play();
     }
}
