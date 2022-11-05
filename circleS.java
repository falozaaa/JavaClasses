public class circleS extends  shape{
    private double radius;
    public circleS() {
        radius = 1;
    }
    public circleS(double radius) {
        this.radius=radius;
    }
    public circleS(double radius, String color,boolean filled){
        super(color,filled);
        this.radius=radius;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius){
        this.radius=radius;
    }
    public double getArea() {
        return Math.PI*Math.pow(radius,2);
    }
    public double getPerimeter() {
        return 2*radius*Math.PI;
    }



}
