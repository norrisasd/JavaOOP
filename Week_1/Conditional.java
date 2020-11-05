package Week_1;
import java.util.*;
public class Conditional {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double comm=0;
        System.out.print("Input Price: ");
        double price = scan.nextDouble();
        System.out.print("Input Type: ");
        int type = scan.nextInt();
        
        switch(type){
            case 1:
                comm = price*0.07;
                if(comm < 400){
                    comm = 400;
                }
                break;
            case 2:
                comm = price*0.1;
                if(comm>900){
                    comm = 900;
                }
                break;
            case 3:
                comm = price *0.12;
                break;
            case 4:
                comm = 250;
                break;
            default:
                System.out.println("Invalid Type!");
        }
        scan.close();
        System.out.printf("\nCommission: %.2f\n", comm);
    }
}
