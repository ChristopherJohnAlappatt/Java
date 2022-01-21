package Java_Practicals._3D_StringBuffer;

public class My_Demo {
    
    public static void main(String[] args) {
        
        StringBuffer sb = new StringBuffer("Hello ");
        System.out.println("Sb before appending "+ sb);
        sb.append("Christopher John ");
        System.out.println("Sb after appending "+ sb);
        StringBuffer sb1 = new StringBuffer("GG Bois");
        sb1.insert(7," & Girls");
        System.out.println(sb1);
        StringBuffer sb2 = new StringBuffer("Welcome to my Youtube Channel !!!");
        sb2.reverse();
        System.out.println(sb2);
    }
}
