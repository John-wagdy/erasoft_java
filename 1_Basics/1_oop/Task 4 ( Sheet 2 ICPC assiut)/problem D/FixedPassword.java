import java.util.ArrayList;

public class FixedPassword {


    public void printPassword(ArrayList<Integer> numbers) {
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) == 1999) {
                System.out.println("Correct");
                break;
            }
            else{
                System.out.println("Wrong");
            }

        }
    }

}
