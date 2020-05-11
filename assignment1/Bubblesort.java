//August Ho
//Aufgabe 1

import java.util.Arrays;
import java.util.Random;

class Bubblesort {

  static String arrayToString(int[] arr){
    return Arrays.toString(arr); //
  }

  static int[] randomArray(int n){
    Random rand = new Random(); // creating Random object
    int[] arr = new int[n];
    for (int i = 0; i < arr.length; ++i) {
      arr[i] = rand.nextInt(100);
    }
    return arr;
  }

  static void bubbleSort(int[] arr){
    //Arrays.sort(arr); //make new bubbleSort function for next assignment
    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        int temp = 0;
        if (arr[i] > arr[j]) {
          temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
        }
      }
    }
  }


  public static void main(String[] args){

    System.out.println("//Aufgabe a)");
    int[] bsp = {1, 2, 3, 4, 5};  // initialize int array
    System.out.println(arrayToString(bsp));
    System.out.println(" ");

    System.out.println("//Aufgabe b)");
    int[] randArr = randomArray(10);  // initialize int array
    System.out.println(arrayToString(randArr));
    randArr = randomArray(20);  // initialize new int array
    System.out.println(arrayToString(randArr));
    randArr = randomArray(30);  // initialize new int array
    System.out.println(arrayToString(randArr));
    System.out.println(" ");

    System.out.println("//Aufgabe c)");
    randArr = randomArray(10);
    bubbleSort(randArr);  // sort last int array in ascending order
    System.out.println(arrayToString(randArr));
    System.out.println(" ");

  }
}
