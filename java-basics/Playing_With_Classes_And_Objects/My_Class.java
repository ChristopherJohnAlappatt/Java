package Playing_With_Classes_And_Objects;

public class My_Class {
    
    public static void main(String[] args) {
        Student tom = new Student();
        tom.setName("Tom");
        tom.setAge(12);
        tom.setId(1019104);
        System.out.println(tom.getName()+" is "+tom.getAge()+" years old.");
        System.out.println("His ID is "+ tom.getId());
    }
}
