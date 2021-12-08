1. public class TowersofHanoi {

private int numDiscs;

public TowersofHanoi (int x)

       numDiscs = x;

       arrangeDiscs (numDiscs, 1, 2, 3);

}

private void arrangeDiscs(int num, int from, int temp, int to) {

if (num > 0) {

              arrangeDiscs (num - 1, from, temp, to);

               System.out.println("Move disc from peg " + from + " to peg " + to);

              arrangeDiscs (num - 1, temp, to, from);

        }

   }

//main class

public class HanoiProblem {

          static public void main(String[] args) {

Hanoi TowersofHanoi = new Hanoi (3);

     }

}

2. public class PalindromeCheck {

public static boolean maybePalindrome (String x) {

if(s.length() == 0 || s.length == 1)

      return true;

if(s.charAt(0) == s.charAt(s.length()-1))

    return maybePalindrome(s.substring(1, s.length()-1));

    return false;

}

public static void main(STring[] args) {

       Scanner scan = new Scanner(System.in);

      System.out.println("Enter the String so that it can be checked");

          String string = scanner.nextLine();

if(maybePalindrome(string))

    System.out.println("The string is a palindrome");

else

System.out.println("The string is not a palindrome");

    }

}


3. Not sure what the question is asking, solution is on the bottom last line? I can give another example maybe.

n = 5, r = 2

{1, 2, 3, 4, 5} : {1,2}, {1,3}, {1,4}, {1,5} {2,3} {2,4} {2,5} {3,4} {3,5} {4,5}
