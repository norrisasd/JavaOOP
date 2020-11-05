package Week_2;

public class Cylinder {
    private Circle circle = new Circle();
    private float height;
    public Cylinder(){}
    public Cylinder(Circle circle, float height){
        this.circle=circle;
        this.height=height;
    }
    public Cylinder(int x,int y, float radius, float height){
        this.circle.setCenter(x, y);
        this.circle.setRadius(radius);
        this.height = height;
    }
    public void setCircle(int x, int y, float radius){
        this.circle.setCenter(x, y);
        this.circle.setRadius(radius);
    }
    public Circle getCircle(){
        return this.circle;
    }
    public void setHeight(float height){
        this.height=height;
    }
    public float getHeight(){
        return this.height;
    }
    public float getArea(){
        float area=2*this.circle.getArea()+2*(float)Math.PI*this.circle.getRadius()*this.height;
        return (float)Math.round(area*100)/100;
    }
    public float getVolume(){
        float volume= this.circle.getArea()*this.height;
        return (float)Math.round(volume*100)/100;
    }

    public String toString(){
        String rad ="Radius: "+String.format("%.2f",this.getCircle().getRadius());
        String point="Point: "+this.getCircle().getCenter();
        String hei="Height: "+String.format("%.2f",height);
        return rad+"\n"+point+"\n"+hei;
    }
    public boolean equals(Object obj){
		boolean ans = false;
		if(obj instanceof Cylinder){
			Cylinder c = (Cylinder)obj;
			if(this.circle.equals(c.circle) &&this.height==c.height)
				ans = true;
		}
		return ans;
    }
}
