import java.util.Random;
import java.io.File;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteReadData {
   
   //method to sort the array from least to greatest
   public static void sort(int[] intArray) {
      for (int i = 0; i < intArray.length - 1; i++)
         for (int j = 0; j < intArray.length - i - 1; j++)
            if (intArray[j] > intArray[j+1]) {
               int t = intArray[j];
               intArray[j] = intArray[j+1];
               intArray[j+1] = t;
            }
   }
   
   //method to print out the contents in the array
   public static void print(int[] intArray) {
      for (int i = 0; i < intArray.length; i++) {
         System.out.println(intArray[i]);
      }
   }
   
   public static void main(String[] args) throws IOException {
      
      //creating objects
      Random rand = new Random();
      File file = new File("Exercise12_15.txt");
      PrintWriter output = new PrintWriter(file);
      Scanner input = new Scanner(file);
      
      //int variable and int array
      int randNum;
      int[] intArray = new int[100];
      
      //try catch block for creating the file and catching if an error occurs
      try {
         if (file.createNewFile()) {
            System.out.println("File created: " + file.getName());
         } else {
            System.out.println("File already exists.");
         }
      }
      
      catch (Exception e) {
         System.out.println("An error ocurred.");
      }     
      
      //filling the Exercise12_15.txt file with 100 random numbers, each on their own separate line  
      for (int i = 0; i < 100; i++) {
         randNum = rand.nextInt(1000);
         output.println(randNum);   
      }
      
      //close the file
      output.close(); 
      
      //filling the array with the numbers from the file
      for (int i = 0; i < intArray.length; i++) {
         intArray[i] = input.nextInt();   
      }
      
      //close the file
      input.close();
      
      //calls the method to sort the array
      sort(intArray);
      
      //calls the method to print out the contents of the array
      print(intArray);
         
   }
   
}