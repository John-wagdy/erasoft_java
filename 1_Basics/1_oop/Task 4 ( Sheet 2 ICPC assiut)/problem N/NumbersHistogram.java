 public class NumbersHistogram {
    char symbol;
    int number;
    int [] histogram;

    public char getSymbol() {
        return symbol;
    }

    public void setSymbol(char symbol) {
        if(symbol == '+' || symbol == '-' || symbol == '*' || symbol == '/'){
            this.symbol = symbol;
        }
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        if(number >= 1 && number <= 50) {
            this.number = number;
        }
    }

    public int[] getHistogram() {
        return histogram;
    }

    public void setHistogram(int[] histogram) {

        this.histogram = histogram;
    }

    public void symbolHistogram(char symbol, int[] histogram) {
        for (int i = 0; i < histogram.length; i++) {
            for (int j = 0; j < histogram[i]; j++) {
                System.out.print(symbol);
            }
            System.out.println();
        }
    }


}