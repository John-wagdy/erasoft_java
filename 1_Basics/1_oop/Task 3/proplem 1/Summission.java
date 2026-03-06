
public class Summission {
    private  String num1;
    private  String num2;

    public String getNum1() {
        return num1;
    }

    public void setNum1(String num1) {
        this.num1 = num1;
    }

    public String getNum2() {
        return num2;
    }

    public void setNum2(String num2) {
        this.num2 = num2;
    }

    public int sum (String num1,String num2){
        int num1Digit = num1.length()-1;
        int num2Digit = num2.length()-1;
        int sum = (num1.charAt(num1Digit) - '0') + (num2.charAt(num2Digit) - '0');
        return sum;
    }


}
