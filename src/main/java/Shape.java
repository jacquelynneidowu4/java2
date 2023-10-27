public abstract class Shape{
    private int length;
    private int width;
    public abstract String draw();
    public int getLength(){
        return length;
    }
    public int getWidth(){
        return width;
    }
    public void setWidth(int width){
        this.width=width;
    }
    public void setLength(int length){
        this.length=length;
    }

}