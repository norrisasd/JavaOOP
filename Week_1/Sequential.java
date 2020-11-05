package Week_1;
import java.util.*;
public class Sequential {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int unit=0;
        double fee ;
        System.out.print("Input Unit: ");
        unit = scan.nextInt();
        scan.close();
        unit *=45;
        fee = unit + (unit *0.15)+200;
        System.out.printf("Tution Fee: %.2f\n",fee);
    }
}
