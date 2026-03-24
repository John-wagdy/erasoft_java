public class Palindrome {
    private String N;

    public String getN() {
        return N;
    }

    public void setN(String n) {
        N = n;
    }

    public void ispalindrome(String N) {

        String reversed = "";
        boolean started = false;


        for (int i = N.length() - 1; i >= 0; i--) {
            char c = N.charAt(i);

            if (c != '0') {
                started = true;
            }

            if (started) {
                reversed += c;
            }
        }


        System.out.println(reversed);


        if (N.equals(reversed)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }


    }

}