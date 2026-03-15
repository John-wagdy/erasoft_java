public class Max {
    private int size;
    private int [] array;

    public int getsize() {
        return size;
    }

    public void setsize(int size) {
        this.size = size;
    }

    public void setArray(int[] array) {
        this.array = array;
    }


    public void output(){
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println(max);
    }
}
