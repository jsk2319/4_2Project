/**
 *@author jsk2319@email.vccs.edu
 * Author: Jude Kallista-Fitzpatrick
 * Purpose: To display all even and odd numbers from 1 to 100. It should also display a diamond shape made up of *
 */
public class OddsEvens {
    public static void main(String[] args) {
        int a; //for odd numbers
        int b; //for even numbers
        int c = 1; //for diamond
        for (a = 1; a <= 100; a++) {
            if (a % 2 != 0) { //selects odd numbers
                System.out.println(a);
            }
        }
        for (b = 1; b <= 100; b++) {
            if (b % 2 == 0) { //selects even numbers if b is divisible by 2
                System.out.println(b);
            }

            while (c < 26) {
                switch (c) {
                    case 3:
                    case 7:
                    case 8:
                    case 9:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 17:
                    case 18:
                    case 19:
                    case 23:
                        System.out.print("*");
                        break;
                    default:
                        System.out.print(" ");
                }
                if (c % 5 == 0) { //if c is divisible by 5
                    System.out.println();
                }
                c++;
            }

        }
    }
}
