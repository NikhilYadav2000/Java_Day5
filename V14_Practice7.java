import java.util.Scanner;

public class V14_Practice7 {

    // 1.
    // static void table(int n){
    // for(int i=1;i<=10;i++){
    // System.out.println(n*i);
    // }
    // }
    // public static void main(String args[]){
    // Scanner sc = new Scanner(System.in);
    // int n = sc.nextInt();
    // table(n);
    // }

    // 2.
    // static void pattern(int n) {
    // for (int i = 0; i <= n; i++) {
    // for (int j = 0; j < i; j++) {
    // System.out.print("*");
    // }
    // System.out.println();
    // }
    // }

    // public static void main(String args[]) {
    // int n = 4;
    // pattern(n);
    // }

    /*
    *
    **
    ***
    ****
     */

    // 8.

    // static void pattern(int n) {
    // if (n == 0)
    // return;
    // pattern(n - 1);
    // for (int i = 0; i < n; i++) {
    // System.out.print("*");
    // }
    // System.out.println();
    // }

    // public static void main(String args[]) {
    // int n = 4;
    // pattern(n);
    // }

    /*
    *
    **
    ***
    ****
     */

    // 3.
    // static int sum(int n){
    // if(n==0) return 0;
    // return n+sum(n-1);
    // }
    // public static void main(String args[]){
    // System.out.println(sum(4));
    // }

    // 10
    // public static void main(String args[]){
    // int sum=0;
    // for(int i =1;i<=4;i++){
    // sum+=i;
    // }System.out.println(sum);
    // }

    // 5.
    // static int fib(int n){
    // if(n==0||n==1) return n;
    // return fib(n-1)+fib(n-2);
    // }
    // public static void main(String args[]){
    // Scanner sc = new Scanner(System.in);
    // int n= sc.nextInt();
    // System.out.println(fib(n));
    // }

    // 6.
    // static int avg(int []arr){
    // int avg=0;
    // for(int i =0;i<arr.length;i++){
    // avg+=arr[i];
    // }
    // return avg/arr.length;
    // }
    // public static void main(String args[]){
    // int [] arr={1,2,3,4,5,6,7};
    // System.out.println(avg(arr));
    // }

    // 4.
    // public static void main(String args[]){
    // for(int i =0;i<4;i++){
    // for(int j=i;j<4;j++){
    // System.out.print("*");
    // }System.out.println();
    // }
    // }

    /*
     ****
     ***
     **
     *
     */

    // 7.
    // static void pattern(int n) {
    //     if (n == 0)
    //         return;
    //     for (int i = 0; i < n; i++) {
    //         System.out.print("*");
    //     }
    //     System.out.println();
    //     pattern(n - 1);
    // }

    // public static void main(String args[]) {
    //     pattern(4);
    // }

    /*
     ****
     ***
     **
     *
     */
}
