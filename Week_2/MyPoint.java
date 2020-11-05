package Week_2;

public class MyPoint{
    private int x;
    private int y;
    public MyPoint(){}
    public MyPoint(int x, int y){
        this.x = x;
        this.y = y;
    }
    public void setX(int x){
		this.x = x;
	}

	public void setY(int y){
		this.y = y;
	}

	public int getX(){
		return x;
	}

	public int getY(){
		return y;
    }
    
    public String toString(){
        return "("+x+","+y+")";
    }
    public boolean equals(Object obj){
		boolean ans = false;
		if(obj instanceof MyPoint){
			MyPoint p = (MyPoint)obj;
			if(this.x==p.x && this.y==p.y)
				ans = true;
		}
		return ans;
    }
    
}

