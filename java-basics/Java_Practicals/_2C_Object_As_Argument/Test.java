package Java_Practicals._2C_Object_As_Argument;

public class Test {
    
    public int a,b;
    Test(int i, int j){

         a = i;
         b = j;

    }

    void Swap(Test o){
        int temp;
        temp =o.b;
        o.b=o.a;
        o.a= temp;

    }

}
