package Week_3;

import java.io.*;
import java.util.*;
public class AirlineFileHipolito {
    private int capacity = 10;
    public int[] array = new int[capacity];

    public AirlineFileHipolito(){

    }
    public int getCapacity(){
        return capacity;
    }
    public void displayNextFlight(){
        System.out.println("Next Flight Leaves in 3 Hours...");
    }
    public void display(){
        System.out.print("First Class: ");
        for(int i =0;i<capacity/2;i++){
            System.out.printf("%d ",array[i]);
        }
        System.out.print("\nEconomy: ");
        for(int i =capacity/2;i<capacity;i++){
            System.out.printf("%d ",array[i]);
        }
        System.out.println("\n");
    }
    public boolean isFull(){
        for(int i =0;i<capacity;i++){
            if(array[i] == 0)
                return false;
        }
        return true;
    }
    public int firstClass(){
        for(int i =0;i<capacity/2;i++){
            if(array[i] == 0){
                array[i] = 1;
                return i;
            }
        }
        return -1;
    }
    
    public int economy(){
        for(int i=capacity/2;i<capacity;i++){
            if(array[i]==0){
                array[i] = 1;
                return i;
            }
        }
        return -1;
    }
    public boolean assignSeat(int section){
        int choice;
        int bp;
        Scanner sc = new Scanner(System.in);
        if(section == 1 ){
            bp=firstClass();
            if(bp!= -1){
                displayBoardingPass(bp);
                return true;
            }else{
                System.out.print("First Class is Full, would you like to be transfered? (1)Yes/(2)No: ");
                choice = sc.nextInt();
                if(choice == 1){
                    displayBoardingPass(economy());
                    return true;
                }else{
                    displayNextFlight();
                    return false;
                }
            }
        }else{
            bp=economy();
            if(bp != -1){
                displayBoardingPass(bp);
                return true;
            }else{
                System.out.print("Economy is Full, would you like to be transfered? (1)Yes/(2)No: ");
                choice = sc.nextInt();
                if(choice == 1){
                    displayBoardingPass(firstClass());
                    return true;
                }else{
                    displayNextFlight();
                    return false;
                }
            }
        }
    }
    public String displayBoardingPass(int pos){
        String str = "";
        pos = pos+1;
        if(pos>capacity/2){
            str="Section: Economy\n"+"Seat #"+pos;
        }else{
            str="Section: First Class\n"+"Seat #"+pos;
        }
        return str;
    }

}
