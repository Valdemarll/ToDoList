package Task3;

public class Rectangle {
    private int length;
    private int width;

    public Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }
    public void setLength(int length){
        this.length = length;
    }

    public int getWidth() {
        return width;
    }
    public void setWidth(int width){
        this.width = width;
    }

    public String toString(){
        return String.format("\nRectangle{length:%s; width:%s}",
                this.length, this.width);
    }

}
