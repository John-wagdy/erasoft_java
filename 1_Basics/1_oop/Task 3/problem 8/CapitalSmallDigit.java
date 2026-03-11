public class CapitalSmallDigit {
    private int chAscii;

    public void setCh(String ch) {
        if (ch.length() == 1){
            this.chAscii = ch.charAt(0);
        }

    }



    public void methCapitalSmallDigit() {
        if (chAscii >= 65 && chAscii <= 90 ) {
            System.out.println("ALPHA");
            System.out.println("IS CAPITAL");
        }
        else if (chAscii >= 97 && chAscii <= 122) {
            System.out.println("ALPHA");
            System.out.println("IS SMALL");
        }
        else if(chAscii >= 48 && chAscii <= 57)
            System.out.println("IS DIGIT");
    }
}
