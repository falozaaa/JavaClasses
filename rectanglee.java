public class rectanglee extends shape{
    private double width;
    private double length;
    public rectanglee() {
        width = 1;
        length = 1;
    }
    public rectanglee(double width,double length) {
        this.length=length;
        this.width=width;
    }
    public  rectanglee(double width,double length, String color,boolean filled){
        super(color,filled);
        this.length=length;
        this.width=width;

    }
    public double getWidth(){
        return width;
    }
    public double getLength() {
        return length;
    }
    public void setWidth(double width) {
        this.width=width;
    }
    public void setLength(double length) {
        this.length=length;
    }
    public double getArea(){
        return width*length;
    }
    public double getPerimeter(){
        return (length+width)*2;
    }


}
