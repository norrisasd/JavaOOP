package Week_3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class TestMyFileHipolitoF1 {
    public static void main(String args[]) throws IOException {
        boolean run = true;
        MyFileHipolitoF1 myFile = new MyFileHipolitoF1();
        AirlineFileHipolito air = new AirlineFileHipolito();
        String input = "input.txt";
        int choice;
        boolean check;
        Scanner sc = new Scanner(System.in);
        myFile.createFile(input);
        String output="output.txt";
        String str = "";
        BufferedReader br = new BufferedReader(new FileReader(input));
        str = br.readLine();
        br.close();
        String[] spl= str.split(" ");
        for(int i =0;i<air.getCapacity();i++){
           air.array[i]=Integer.parseInt(spl[i]);
        }
        myFile.createFile(output);
        
        while(run){
            menu();
            choice= sc.nextInt();
            switch(choice){
                case 1:
                    str ="";
                    for(int i =0;i<10;i++)
                        str+=sc.nextInt()+" ";
                    check = myFile.writeToFile(input,str);
                    if(check){
                        System.out.println("Input Success!");
                    }else{
                        System.out.println("Input Failed!");
                    }
                    break;
                case 2:
                    if(myFile.readFromFile(input)){
                        System.out.println("Read Success!");
                    }else{
                        System.out.println("Read Failed!");
                    }
                    break;
                case 3:
                    str="";
                    for(int i=0;i<air.getCapacity();i++){
                        if(air.array[i] > 0){
                            str+=air.displayBoardingPass(i)+"\n";
                        }
                    }
                    myFile.writeToFile(output,str);
                    break;
                case 4:
                    run = false;
                    break;
                default:
                    System.out.println("Choose Wisely");

            }
        }
    sc.close();
    }
    public static void menu(){
        System.out.println("1: Input text  (input.txt)");
        System.out.println("2: Read text  (input.txt)");
        System.out.println("3: Generate Output (output.txt)");
        System.out.print("Choose: ");
    }
    
}
