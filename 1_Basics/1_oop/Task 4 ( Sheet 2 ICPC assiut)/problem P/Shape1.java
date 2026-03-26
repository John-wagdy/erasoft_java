public class Shape1 {
    private int height;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        if (height >= 1 && height < 100) {
        this.height = height;
        }
    }
    public void pyramid(int height){
        for (int i = height; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
