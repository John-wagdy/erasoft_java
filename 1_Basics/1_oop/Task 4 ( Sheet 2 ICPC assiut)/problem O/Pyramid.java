public class Pyramid {
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
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
