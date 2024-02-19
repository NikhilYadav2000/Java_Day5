// class Employee {
//     private int salary;
//     private String name;

//     public int getSalary() {
//         return salary;
//     }

//     public String getName() {
//         return name;
//     }

//     public void setSalary(int salary) {
//         this.salary = salary;
//     }

//     public void setName(String name) {
//         this.name = name;
//     }

//     public void printDetails() {
//         System.out.println("Nikhil's Salary per month is 2 Lakh Ruppees");
//     }

// }

// public class V16_Practice8 {
//     public static void main(String[] args) {
//         Employee e = new Employee();
//         e.setName("Nikhil");
//         e.setSalary(200000);
//         System.out.println(e.getName());
//         System.out.println(e.getSalary());
//         e.printDetails();
//     }
// }

// class Cellphone {
//     public void ring() {
//         System.out.println("Ringing");
//     }

//     public void vibrate() {
//         System.out.println("Vibrating");
//     }
// }

// public class V16_Practice8 {
//     public static void main(String[] args) {
//         Cellphone e = new Cellphone();
//         e.ring();
//         e.vibrate();
//     }
// }

// class Square {
//     private int side;
//     private int area;
//     private int perimeter;

//     public void setSide(int side) {
//         this.side=side;
//     }

//     public void sqArea() {
//         System.out.println(side*side);
//     }   
//     public void sqPerimeter() {
//         System.out.println(4*side);
//     }
// }

// public class V16_Practice8 {
//     public static void main(String[] args) {
//         Square sq = new Square();
//         sq.setSide(5);
//         sq.sqArea();
//         sq.sqPerimeter();
//     }
// }

// class Rectangle {
//     private int length;
//     private int breadth;
//     private int area;
//     private int perimeter;

//     public void setSide(int length,int breadth) {
//         this.length=length;
//         this.breadth=breadth;
//     }

//     public void rectArea() {
//         System.out.println(length*breadth);
//     }   
//     public void rectPerimeter() {
//         System.out.println(2*(length+breadth));
//     }
// }

// public class V16_Practice8 {
//     public static void main(String[] args) {
//         Rectangle rect = new Rectangle();
//         rect.setSide(5,4);
//         rect.rectArea();
//         rect.rectPerimeter();
//     }
// }

// class Circle {
//     private int radius;
//     private int area;
//     private int perimeter;

//     public void setSide(int radius) {
//         this.radius = radius;
//     }

//     public void circArea() {
//         System.out.println((float)(3.14 * radius * radius));
//     }

//     public void circPerimeter() {
//         System.out.println(2 * 3.14 * radius);
//     }
// }

// public class V16_Practice8 {
//     public static void main(String[] args) {
//         Circle circ = new Circle();
//         circ.setSide(3);
//         circ.circArea();
//         circ.circPerimeter();
//     }
// }

class RommyVecetti {   
    public void running() {
        System.out.println("running");
    }   
    public void hitting() {
        System.out.println("hitting");
    }
    public void firing() {
        System.out.println("firing");
    }
}
public class V16_Practice8 {
    public static void main(String[] args) {
        RommyVecetti rv = new RommyVecetti();
        rv.hitting();
        rv.running();
        rv.firing();
    }
}