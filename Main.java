import java.util.Scanner;
/**
 *
 * @author celer7841
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a Scanner for user input
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter in 10 integers to put into the array");

    final int NUMBERINT = 10;
    int[] integers = new int[NUMBERINT];
    
  // make a for loop statement for array to go throught the loop
for( int i =0; i < NUMBERINT; i ++){
    // make the user to enter next numbers
    integers[i] = input.nextInt();

  }
  // declare a variable to store largest
  int largest = integers[0];
  // make a for loop to find the largest integer
for(int i =0; i < NUMBERINT; i ++){
  // make an if statement to find which one is larger
  if (largest < integers[i]){
    // swap the largest 0 to next integer 
    largest = integers[i];

  } 
  }
  // Tell the user which one is the largest one
  System.out.println("The largest number is " + largest);
  }
}
