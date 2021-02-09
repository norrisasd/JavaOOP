package Week_3;

import java.io.*;


public class MyFileHipolitoF1 {

    public MyFileHipolitoF1(){

    }
    public boolean createFile(String filename) throws IOException {
        File myFile = new File(filename);
        return myFile.createNewFile();
    }

    public boolean isFile(File file) {
        return file.isFile();

    } // returns true if file is a file

    public boolean delete(File file) {
        // deletes the file
        return file.delete();
    }

    public boolean isDirectory(File file) {
        return file.isDirectory();

    } // returns true if file is a directory

    public boolean writeToFile(String filename, String output) {
        try{
            FileWriter fw= new FileWriter(filename);
            fw.write(output);
            fw.close();
            return true;
        }catch(Exception e){
            return false;
        }
    }
    public boolean readFromFile(String filename){
        try{
            BufferedReader br = new BufferedReader(new FileReader(filename));
            String str = br.readLine();
            System.out.println(str);
            br.close();
            return true;
        }catch(Exception e){
            return false;
        }
    }
    
    
}
