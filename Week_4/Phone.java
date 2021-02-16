package Week_4;

import java.io.Serializable;

abstract class Phone implements Serializable {
    transient protected String name;
    protected String brand;  
    
    public Phone(){

    }
    public Phone(String name, String brand){
        this.name = name;
        this.brand = brand;
    }
    
    abstract boolean call(float duration);
    public String toString(){
        return "Name: "+ name
              +"\nBrand: "+brand;
    }
}
