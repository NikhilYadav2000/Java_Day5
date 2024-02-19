class Employee{
    int id;
    String name;  

    public Employee(){
        id=12;
        name="Sona";
    }
    public Employee(int id,String name){
        this.id=id;
        this.name=name;
    }
    public Employee(String name){
        id=8;
        this.name=name;
    }
  
    public void printDetails(){
        System.out.println("id = "+ id +","+ " name = " + name);
    }
}
class V17_Constructor{
    public static void main(String[] args) {
        Employee e = new Employee(20, "Nikki");
        Employee e1 = new Employee();
        Employee e2 = new Employee( "Mona");
        e.printDetails();
        e1.printDetails();
        e2.printDetails();
    }
}