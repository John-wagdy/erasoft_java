public class WelcomeWithConditions {
    private float num1;
    private float num2;

    public float getNum2() {
        return num2;
    }

    public void setNum2(float num2) {
        if (num2 >= 0 && num2 <= 100) {
        this.num2 = num2;
        }
        else {
            System.out.println("Invalid number!");
        }
    }

    public float getNum1() {
        return num1;
    }

    public void setNum1(float num1) {
        if (num1 >= 0 && num1 <= 100) {
            this.num1 = num1;
        }
        else {
            System.out.println("Invalid number!");
        }
    }


    public boolean check(float num1, float num2){
        return num1 >= num2;
    }

}