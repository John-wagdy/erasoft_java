public class Round extends BaseEntity{
     public Round(int number, int divider){
         int check1 = number/divider;
         float check2 = (float) number / divider;
         float check3 = check2 - check1;
         if(check3 == 0.0 || (check3 > 0.0 && check3 < 0.5)){
             setResult(check1);
         }else if (check3 >= 0.5) {
             setResult(check1+1);
         }
         System.out.println("round "+ number + " / " + divider + " = " + getResult());

     }
}
