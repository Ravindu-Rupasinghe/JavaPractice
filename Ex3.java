//Ex3: Increasing and decreasing start pattern using for loop
/*
*
**
***
****
***
**
*
*/
//Code3:
public class Ex3 {
    public static void main(String args[]) {
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i < 4; i++) {
            for (int j = 3; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}