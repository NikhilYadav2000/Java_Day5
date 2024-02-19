// public class V13_Methods {
//     // if u use static thn the method is part of the class.
//     // static int mul(int a, int b){
//         //     int z = a*b;
//         //     return z;
//     // }


//         // if u dont make it static then u have to make an object and thn call the method
//         int mul(int a, int b){
//             int z =a*b;
//             return z;
//         }

//     public static void main(String args[]){
//         int a=13;
//         int b=10;
//         V13_Methods obj=new V13_Methods();
//         int c = obj.mul(a,b);
//         System.out.println(c);
//     }
// }

// VarArgs
// public class V13_Methods {
//     static int sum(int ...arr){
//     // static int sum(int x,int ...arr){
//         // available as int []arr(This is made automatically);
//         int sum=0;
//         for(int a :arr){
//             sum+=a;
//         }return sum;
//     }
//     public static void main(String args[]){
//         System.out.println(sum()); // 0 // if u use int x in the argument which means there cant be any empty arguments in the method so ui must pass atleast 1 argument.
//         System.out.println(sum(1,2)); // 3
//         System.out.println(sum(1,2,3)); // 6
//         System.out.println(sum(1,2,3,4)); // 10
//     }
// }

public class V13_Methods {
    static int fact(int n){
        if(n==0||n==1){
            return 1;
        }
        else{
            return n*fact(n-1);
        }
    }
    public static void main(String args[]){
        int fct=fact(5);
        System.out.println(fct);
    }
}