package Java_Practicals;



public  class _1C_Methods_Employee {
    int Id;
    String Name;
    int Salary;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }

    public  void Display() {
        System.out.println("The Employee Name is : "+ getName());
        System.out.println("The Employee Id is : "+ getId());
        System.out.println("The Employee Salary is : "+ getSalary());
    }
    public static void main(String[] args) {
       _1C_Methods_Employee Emp1=new _1C_Methods_Employee();
       Emp1.setName("Christopher John");
       Emp1.setId(1019103);
       Emp1.setSalary(15000);

       Emp1.Display();
    }
}
