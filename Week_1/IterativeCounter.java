package Week_1;
import java.util.*;
public class IterativeCounter {
    public static void main(String[] args){
        Scanner scan = new Scanner (System.in);
        double grades,average = 0;
        int unit,totalUnit=0;

        for(int i =0;i<7;i++){
            System.out.print("Input Grade: ");
            grades = scan.nextDouble();
            while(grades>5 || grades<0){
                System.out.println("Invalid Input, Try Again!");
                System.out.print("Input Grade: ");
                grades = scan.nextDouble();
            }
            System.out.print("Input unit: ");
            unit = scan.nextInt();
            totalUnit += unit;
            average = average + grades*unit;
        }
        scan.close();
        
        average/=totalUnit;
        System.out.printf("\nAverage: %.2f\n",average);
        if(average >=3){
            System.out.println("Passed");
        }else{
            System.out.println("Failed");
        }
    }
}
