public class squaree extends rectanglee{
        public squaree() {

        }
        public squaree(double side) {
            super(side,side);
        }
        public squaree(double side,String color,boolean filled) {
            super(side,side);
            this.setFilled(filled);
            this.setColor(color);
        }
        public double getSide() {
            return getLength();
        }
        public void setSide(double side) {
            this.setLength(side);
        }
        public void setWidthh(double width) {
            this.setWidth(width);
            this.setLength(width);
        }

        public void setLengthh(double length){
            this.setLength(length);
            this.setWidth(length);
        }





}
