// class Employee{
//     int id;
//     String name;
//     public void printDetails(){
//         System.out.println("ID = " + id);
//         System.out.println("NAME = " + name);
//     }
// }
// public class V15_Oops {
//     public static void main(String[] args) {
//         Employee e = new Employee();
//         e.id=20;
//         e.name="Nikhil";
//         // System.out.println(e.name);
//         e.printDetails();
//     }
// }

// Access Modifier
class Employee {
    private int id;
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void setID(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getID() {
        return id;
    }
}

public class V15_Oops {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.setID(20);
        e.setName("Nikhil");
        System.out.println(e.getID());
        System.out.println(e.getName());
    }
}
