public class PrimeNumbers {
    private int N;

    public int getN() {
        return N;
    }

    public void setN(int n){
        this.N = n;
    }

    public void primesBetween(int N){
        if (N > 1){
            for (int i = 2; i <= N; i++){
                boolean isPrime = true;
                for(int j = 2; j < i; j++){
                    if (i % j == 0){
                        isPrime = false;
                        break;
                    }
                }
               if (isPrime){
                   System.out.print(i + " ");
               }

            }
        }


    }


}
