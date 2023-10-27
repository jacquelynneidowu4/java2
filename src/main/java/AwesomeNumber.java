public class AwesomeNumber {
    private int num;

    public AwesomeNumber(int num){
        this.num=num;
    }
    public int getNum(){
        return num;
    }
    public static int subtract(AwesomeNumber num1, AwesomeNumber num2){
        return num1.getNum()-num2.getNum();

    }
    public static int add(AwesomeNumber num1, AwesomeNumber num2){
        return num1.getNum()+num2.getNum();
    }

}