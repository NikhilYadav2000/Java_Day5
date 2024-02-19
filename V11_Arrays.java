// import java.util.Scanner;
// public class V11_Arrays {
//     public static void main(String args[]) {
//         int[] arr = new int[5];
//         // int [] arr = {10,20,30,40,50};
//         // String [] names ={"Nikki","Sona","Mona"}
//         // int []arr;
//         // arr = new int[5];
//         Scanner sc = new Scanner(System.in);
//         for (int i = 1; i < 5; i++) {
//             System.out.println("Enter the "+ i+"th value");
//             arr[i] = sc.nextInt();
//         }
//         for(int val:arr){
//             System.out.println(val);
//         }
//         System.out.println(arr.length);
//     }
// }

import java.util.Scanner;

public class V11_Arrays {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("The " + "[" + i + "]"+ "[" + j + "]" + "element is");
                arr[i][j] = sc.nextInt();
            } System.out.println();
        }
        // for(int i =0;i<3;i++){
        //     for(int j =0;j<3;j++){
        //         System.out.println(arr[i][j]);
        //     }
        // }

        for(int []a:arr){
            for(int b:a){
                System.out.println(b);
            }
        }
    }
}
