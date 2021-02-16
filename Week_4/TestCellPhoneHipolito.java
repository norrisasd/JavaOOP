package Week_4;
import java.io.*;
import java.util.*;
public class TestCellPhoneHipolito {
    public static void main(String args[])throws Exception {
        Scanner sc = new Scanner(System.in);
        String pname,brand;
        float load,talkTime,ratePerMin,ratePerText,duration;
        boolean run = true, check =true;
        int x;
        CellPhone cp = null;
        File cpf= new File("Data.txt");
        while(run){
            if(check){
                check = false;
                System.out.println("Input Information: ");
                System.out.print("Input Phone Name: ");
                pname = sc.next();
                System.out.print("Input Brand: ");
                brand = sc.next();
                System.out.print("Input Load: ");
                load = sc.nextFloat();
                System.out.print("Input Talk Time: ");
                talkTime= sc.nextFloat();
                System.out.print("Input Rate/Minute: ");
                ratePerMin=sc.nextFloat();
                System.out.print("Input Rate/Text: ");
                ratePerText=sc.nextFloat();
                cp = new CellPhone(pname,brand,load,talkTime,ratePerMin,ratePerText);
                continue;
            }
            System.out.println("");
            menu();
            x = sc.nextInt();
            switch(x){
                case 1:
                    System.out.print("Input Phone Name: ");
                    pname = sc.next();
                    System.out.print("Input Brand: ");
                    brand = sc.next();
                    System.out.print("Input Load: ");
                    load = sc.nextFloat();
                    System.out.print("Input Talk Time: ");
                    talkTime= sc.nextFloat();
                    System.out.print("Input Rate/Minute: ");
                    ratePerMin=sc.nextFloat();
                    System.out.print("Input Rate/Text: ");
                    ratePerText=sc.nextFloat();
                    cp = new CellPhone(pname,brand,load,talkTime,ratePerMin,ratePerText);
                    break;

                case 2:
                    System.out.println("");
                    System.out.println(cp);
                    break;

                case 3:
                    System.out.print("Input Duration: ");
                    duration = sc.nextFloat();
                    if(cp.call(duration))
                    System.out.println("Call Success!");
                    else
                    System.out.println("Call Failed");
                    break;

                case 4:
                    if(cp!=null){
                        if(cp.text())
                            System.out.println("Text Sent!");
                        else
                            System.out.println("Text Failed");
                        break;
                    }
                case 5:
                    if(cp!=null){
                        if(cp.isLowBat()){
                            System.out.println("Low Battery!");
                        }else
                            System.out.println("Phone Battery is fine!");
                        break;
                    }
                case 6:
                    FileOutputStream fileOutput = new FileOutputStream(cpf);
                    ObjectOutputStream objectOutput = new ObjectOutputStream(fileOutput);
                    objectOutput.writeObject(cp);
                    objectOutput.close();
                    cp = null;
                    System.out.println("Serialization Success!");
                    break;
                case 7:
                    FileInputStream fileInput = new FileInputStream(cpf);
                    ObjectInputStream objectInput = new ObjectInputStream(fileInput);
                    cp = (CellPhone)objectInput.readObject();
                    System.out.println("Deserialization Success!");
                    System.out.println(cp);
                    break;
                case 8:
                    run = false;
                    System.out.println("Thank You For Using The Program!");
                    break;
                default:
                    System.out.println("Choose Properly!");
            }
        }
        
        sc.close();
    }
    public static void menu(){
        System.out.println("1: New Phone Information");
        System.out.println("2: Display Information");
        System.out.println("3: Call");
        System.out.println("4: Text");
        System.out.println("5: Battery Check");
        System.out.println("6: Serialize Information");
        System.out.println("7: Deserialize Information");
        System.out.println("8: Terminate Program");
        System.out.print("Choose: ");
    }
}
