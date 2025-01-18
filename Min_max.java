/*WAP to find the product of max an min of an array is multiple of each other*/

import java.util.Arrays;

public class Min_max {
public static void main(String[] args) {
int[] num = {5, 2, 8, 3, 1, 4};
Arrays.sort(num);
System.out.println("Sorted array: " + Arrays.toString(num));
int n = num.length-1;
int Mul = num[0]*num[n];
System.out.println("Product is: "+Mul);
int Q = num[0];
int W = num[n];
if(Mul%Q==0 && Mul%W==0){
System.out.println("True");
}/*else{
System.out.println("False");
}*/
}
}
