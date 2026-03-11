public class Char {
    private int Ascii;

    public void setAscii(char c) {
        Ascii = c;
    }

    public void covertTo (){
        char result = ' ';
        if (Ascii >= 65 && Ascii <= 90){
            result =  (char) (Ascii + 32) ;
        }
        else if(Ascii >= 97 && Ascii <= 122){
            result =  (char) (Ascii - 32);
        }
        System.out.println(result);
    }

}
