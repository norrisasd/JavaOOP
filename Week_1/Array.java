package Week_1;
import java.util.*;
public class Array {
    public static void main(String[] args){
        int size =10;
        int ctr=0;
        double[] arr= new double[size];
        double sale=0;
        Scanner scan = new Scanner(System.in);
        for(int i =0;i<arr.length;i++){
            System.out.print("Person["+(i+1)+"]: ");
            sale = scan.nextFloat();
            arr[i] = sale * 0.09 + 200;
        }
        scan.close();
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=500){
                ctr++;
            }
        }
        System.out.println("Counter: "+ctr);
    }
}
