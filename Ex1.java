//Ex1: Increasing star pattern using for loop
/*
*
**
***
****
*/
//Code1:
public class Ex1 {
    public static void main(String args[]) {
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}