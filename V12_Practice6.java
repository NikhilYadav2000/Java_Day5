import java.util.Scanner;
public class V12_Practice6 {
    public static void main(String args[]) {
        // 1.
        // float[] arr = { 10.0f, 2.5f, 3.6f, 13.10f, 14.1f };
        // float sum = 0;
        // for (float a : arr) {
        // sum += a;
        // }
        // System.out.println(sum);

        // 2.
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the Length of the Array");
        // int flag =0;
        // int len = sc.nextInt();
        // int[] arr = new int[len];
        // for (int i = 0; i < arr.length; i++) {
        // System.out.println("Enter the value of the " + (i+1) + "th number");
        // arr[i] = sc.nextInt();
        // }
        // System.out.println("Enter the value of key to find in the array");
        // int key = sc.nextInt();
        // for (int i = 0; i < arr.length; i++) {
        // if (arr[i] == key) {
        // System.out.println("Key found in the array");
        // flag=1;
        // break;
        // }
        // }if(flag==0){
        // System.out.println("Key not found");
        // }

        // 3.
        // float [] arr = {98.00f,95.55f,98.75f,100.00f};
        // float avg=0;
        // for(float a:arr){
        // avg+=a;
        // }
        // avg=avg/arr.length;
        // System.out.println(avg);

        // 4.
        // int [][]arr={{1,2,3},{10,6},{5,4}};
        // int [][]arr1={{3,2,1},{6,10},{4,5}};
        // for(int i =0;i<arr.length;i++){
        //     for(int j=0;j<arr[i].length;j++){
        //         arr[i][j]+=arr1[i][j];
        //     }
        // }
        // for(int[]a:arr){
        //     for(int b:a){
        //         System.out.print(b+" ");
        //     }System.out.println();
        // }


        // 5.
        // int []arr={1,2,3,4,5};
        // for(int i =0;i<arr.length;i++){
        // int temp = arr[i];
        // arr[i]=arr[arr.length-i-1];
        // arr[arr.length-i-1]=temp;
        // }
        // for(int a:arr){
        // System.out.println(a);
        // }

        // 6.
        // int [] arr1= {1,6,500,10,200};
        // int max=-1;
        // for(int i=0;i<arr1.length;i++){
        // if(arr1[i]>max){
        // max=arr1[i];
        // }
        // }
        // System.out.println(max);

        // 7.
        // int [] arr1= {50,6,5,10,200};
        // int min=1000;
        // for(int i=0;i<arr1.length;i++){
        // if(arr1[i]<min){
        // min=arr1[i];
        // }
        // }
        // System.out.println(min);

        // 8.
        // int[] arr = { 1, 2, 3, 4, 5 };
        // int flag = 1;
        // // int []arr={5,2,3,4,1};
        // for (int i = 0; i < arr.length-1; i++) {
        //     if (arr[i] > arr[i + 1]) {
        //         flag = 0;
        //         break;
        //     }
        // }
        // if (flag == 1) {
        //     System.out.println("Sorted");
        // }else{
        //     System.out.println("Not Sorted");
        // }

    }
}
