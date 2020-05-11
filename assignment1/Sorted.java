//August Ho
//Aufgabe 2

import java.util.Arrays;

class Sorted{

  static String arrayToString(int[] arr){
    return Arrays.toString(arr);
  }


  static int[] fillArray(int n){
    int[] arr = new int[n-1];
    for (int i = 0; i < arr.length; ++i) {
      arr[i] = i+2; //starts at index 0 = arr[0] and ist set to 0 + 2
    }
    return arr;
  }


  static void filterArray(int[] arr,int index){
    int count = arr[index];
    for (int i = 0; i < arr.length; ++i) { //ob der rest = 0 ist
      if (arr[i] % count == 0 && arr[i] > count) {  //check if arr[i] is divisible by arr[index] und array geht von 2 bis unendlich positive
        arr[i] = -1;
      }
    }
  }

  /*
  Helper function for function primes(),
  receives sorted array consisting of -1 and prime numbers,
  removes all -1 elements and prints the remaining numbers
  */
  static void delete(int[] oldArray){
    // find first element that is not -1
    int index = 0;
    for(int i = 0; i < oldArray.length; ++i) {
      if(oldArray[i] != -1){
        index = i;
        break;
      }
    }
    // make new array with only elements that are not -1
    int arraySize = oldArray.length - index;
    int[] newArray = new int[arraySize];

    // copy elements in new array
    for(int i = 0; i < newArray.length; ++i){
      newArray[i] = oldArray[index];
      index++;
    }
    // print array
    System.out.println(arrayToString(newArray));
  }


  static void primes(int n){
    int arr[] = fillArray(n);  // make a new array using fillArray()
    int i = 0;  // initiate index
    for (int j = 0; j < arr.length; ++j) {  // from 2 to 3 to 5
      filterArray(arr, i);  // use filterArray to turn all non-prime numbers -1, using sieve of era
      for (int k = 0; k < arr.length; ++k) {
        if (arr[k] != -1 && i<k) {
          i = k;
          break;
        }
      }
    }
    Arrays.sort(arr);  // sort Array for delete()
    delete(arr);
  }


  public static void main(String[] args){
    System.out.println("//Aufgabe a)");
    int[] bsp = {1,2,3,4,5};
    System.out.println(arrayToString(bsp));
    System.out.println(" ");

    System.out.println("//Aufgabe b)");
    int[] array = fillArray(15);
    System.out.println(arrayToString(array));
    System.out.println(" ");

    System.out.println("//Aufgabe c)");
    array = fillArray(20);
    filterArray(array, 0);/*  array[0] == 2 */
    System.out.println(arrayToString(array));

    filterArray(array, 1);/*  array[1] == 3 */
    System.out.println(arrayToString(array));
    System.out.println(" ");

    System.out.println("//Aufgabe d)");
    primes(15);
    primes(50);
  }
}
