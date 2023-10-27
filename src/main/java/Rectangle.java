public class Rectangle extends Shape{
    public Rectangle(int length, int width){
        setLength(length);
        setWidth(width);
        }
    public String draw(){
        String shape="";
        int maxX=getLength()-1;
        int maxY=getWidth()-1;
        for(int i=0;i<getWidth();i++){
            for(int j=0;j<getLength();j++){
                if(i==0 || i==maxX || j==0 ||j==maxY){
                   // System.out.print("*");
                    shape+="*";
                }else{
                    //System.out.print(" ");
                    shape+=" ";
        }
        }
            shape+="\n";
        }
            return shape;

        }
}