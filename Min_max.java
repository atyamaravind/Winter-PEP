/*WAP to find the product of max an min of an array is multiple of each other*/

import java.util.Arrays;

public class Min_max {
public static void main(String[] args) {
int[] num = {25,65,89,47,9};
Arrays.sort(num);
System.out.println("Sorted array: " + Arrays.toString(num));
int n = num.length-1;
int Mul = num[0]*num[n];
System.out.println("Product is: "+Mul);
int Q = num[0];
int W = num[n];
if(W%Q==0){
System.out.println("True");
}else{
System.out.println("False");
}
}
}
