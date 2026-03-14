public class EvenNumbers {
    private int N;

    public void setN(int N) {
        this.N = N;
    }

    public int getN() {
        return N;
    }

    public void printNumbers(int n){
        if(n == 1){
            System.out.println("-1");
        }
        for(int i = 1; i <= n; i++){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }


    }

}
