public class Nsummission {
    private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int sum (int number){
        int result = 0;
        for(int i = number; i > 0; i--){
            result = result + i;
        }
        return result;

    }

}
