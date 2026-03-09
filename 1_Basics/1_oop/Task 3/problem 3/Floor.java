public class Floor extends BaseEntity {
    public Floor(int number, int divider) {
        int check1 = number / divider;
        float check2 = (float) number / divider;
        float check3 = check2 - check1;
        if (check3 >= 0) {
            setResult(check1);
        }
        System.out.println("floor " + number + " / " + divider + " = " + getResult());

    }
}