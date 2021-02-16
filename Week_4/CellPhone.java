package Week_4;


public class CellPhone extends Phone {
    transient private float load;
    private float talkTime;
    private float ratePerMinute;
    private float ratePerText;
    
    public CellPhone(){

    }
    public CellPhone(String name, String brand,float load,float talkTime,float ratePerMinute,float ratePerText) {
        super(name, brand);
        this.load = load;
        this.talkTime=talkTime;
        this.ratePerMinute=ratePerMinute;
        this.ratePerText=ratePerText;
    }
    public CellPhone(String name, String brand,float talkTime,float ratePerMinute,float ratePerText) {
        super(name, brand);
        this.load = 300;
        this.talkTime=talkTime;
        this.ratePerMinute=ratePerMinute;
        this.ratePerText=ratePerText;
    }
    public void setLoad(float load){
        this.load = load;
    }
    public void setTalkTime(float talkTime){
        this.talkTime = talkTime;
    }
    public void setRatePerMinute(float ratePerMinute){
        this.ratePerMinute = ratePerMinute;
    }
    public void setRatePerText(float ratePerText){
        this.ratePerText = ratePerText;
    }
    public float getLoad(){
        return load;
    }
    public float getTalkTime(){
        return talkTime;
    }
    public float getRatePerMinute() {
        return ratePerMinute;   
    }
    public float getRatePerText() {
        return ratePerText;
    }
    public float callCost(float duration){
        return ratePerMinute*duration;
    }

    @Override
    boolean call(float duration) {
        float cost=callCost(duration);
        if(duration<=talkTime && load>=cost){
            talkTime-=duration;
            load-=cost;
            return true;
        }
        return false;
    }
    public boolean isLowBat(){
        return talkTime == 0;
    }
    public boolean text(){
        if(load>= ratePerText){
            load-=ratePerText;
            talkTime-=0.5;
            return true;
        }
        return false;
    }
    public String toString(){
        return super.toString()+"\nLoad: "+load+
                                "\nTalk Time: "+talkTime+
                                "\nRate/Minute: "+ratePerMinute+
                                "\nRate/Text: "+ratePerText;
    }

    
}
