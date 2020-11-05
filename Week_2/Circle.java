package Week_2;
public class Circle {
    private MyPoint center=new MyPoint();
    private float radius;

    public Circle(){}
    public Circle(MyPoint center, float radius){
        this.center=center;
        this.radius=radius;
    }
    public Circle(int x,int y,float radius){
        this.center.setX(x);
        this.center.setY(y);
        this.radius=radius;
    }
    public MyPoint getCenter(){
        return this.center;
    }
    public void setCenter(int x, int y){
        this.center.setX(x);
        this.center.setY(y);
    }
    public void setRadius(float radius){
        this.radius = radius;
    }
    public float getRadius(){
        return this.radius;
    }
    public float getArea(){
        return (float)Math.PI *radius *radius;
    }
    public float getCircumference(){
        return 2*(float)Math.PI *radius;
    }
    public String toString(){
        String rad = "Radius: "+String.format("%.2f",radius);
        String point="Point: "+center;
        return rad+"\n"+point;
    }
    public boolean equals(Object obj){
		boolean ans = false;
		if(obj instanceof Circle){
			Circle c = (Circle)obj;
			if(this.center.equals(c.center) && this.radius==c.radius)
				ans = true;
		}
		return ans;
    }
    
}
