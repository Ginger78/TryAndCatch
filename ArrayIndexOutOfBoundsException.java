import java.util.Scanner;
import java.util.Random;

public class ArrayIndexOutOfBoundsException {
   
   //method to fill the array with random numbers
   public static void fillArray(int[] intArray) {
      
      //create instance of Random class
      Random rand = new Random();
      
      //for loop filling the array with random numbers
      for (int i = 0; i < intArray.length; i++) {
         intArray[i] = rand.nextInt(1000);
      }   
   }
   
   //main method
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      
      //create variables
      int index;
      int num;
      
      //create int array of size 100
      int[] intArray = new int[100];
      
      //call the method to fill the array
      fillArray(intArray);
      
      //ask for the user input
      System.out.println("Please enter a number from 0-99: ");
      index = in.nextInt();
      
      //try outputing the number at the given index
      try {
         num = intArray[index];
         System.out.println("The number in the array at index " + index + " is: " + num + ".");
      }
      //print out that the index given is out of bounds
      catch (Exception e) {
         System.out.println("Out of Bounds");
      }
   } 
}