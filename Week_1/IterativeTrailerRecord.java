package Week_1;
import java.util.*;
public class IterativeTrailerRecord {
    public static void main(String[] args){
        Scanner scan = new Scanner (System.in);
        int team1=0,team2=0;
        int x = 1;//starter
        System.out.println("Input Team Who Scored ([1 or 2] or 0 to terminate): ");
        while(x!=0){
            System.out.print("Team: ");
            x = scan.nextInt();
            if(x>2){
                System.out.println("Invalid Input("+x+"), Try Again!");
                continue;
            }
            if(x == 1){
                team1++;
            }
            if(x == 2){
                team2++;
            }
        }
        scan.close();
        System.out.println("Team1: "+team1);
        System.out.println("Team2: "+team2);
        if(team1>team2){
            System.out.println("Team 1 Won");
        }else if(team2>team1){
            System.out.println("Team 2 Won");
        }else{
            System.out.println("Team Tied");
        }
    }
}
