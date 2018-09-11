package hi;

public class hi {
  public static void main(String args[]) {
    System.out.println(factorial(10));
  }

  public static int factorial(int number) {
	// Base scenario
    if (number == 0) {
      // If "factorial(0)" is called, return 0.
      return 1;
    } else {
      // Call itself
      return number * factorial(number - 1);
    }
  }
}
