public class point {
    private float x;
    private float y;
    public point (float x, float y) {
        this.x = x;
        this.y = y;
    }
    public point() {
        x = 0.0f;
        y = 0.0f;
    }
    public float getX() {
        return x;
    }
    public float getY() {
        return y;
    }
    public float [] getXY() {
        float [] t = new float[2];
        t[0] = x;
        t[1] = y;
        return t;
    }
    public void setX(float x) {
        this.x = x;
    }
    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x, float y) {
        this.x=x;
        this.y=y;
    }


}
