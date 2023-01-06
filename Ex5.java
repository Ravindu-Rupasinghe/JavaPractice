//Ex5: Decreasing star pattern with spaces
/*
****
 ***
  **
   *
*/
//Code5:
public class Ex5 {
    public static void main(String args[]) {
        for (int i = 1; i < 5; i++) {
            for (int k = 1; k <= i; k++) {
                System.out.print(" ");
            }
            for (int j = 4; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}