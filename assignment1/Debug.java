//August Ho
//Aufgabe 3

public class Debug {  // K: class falschgeschrieben (ckass).
	//Searching for i in array. Returning true if i is in array, false if it isn't.
	static boolean arraySearch(int[] array, int i) {  //K: 1arraySearch statt arraySearch.
		for (int j = 0; j < array.length; ++j) {  // K: statt '<=' sollte '<' geschreiben werden.
			if (array[j] == i) {
				return true;	//K: true und false wechseln. Zuerst true dann false
			}
		}
		return false;
	}


	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
	  System.out.println("//Erwartete Ausgabe: true");
		System.out.println(arraySearch(arr, 3)); //K: 1arraySearch statt arraySearch und 3 mit arr tauschen
	  System.out.println("//Erwartete Ausgabe: false");
		System.out.println(arraySearch(arr, 6)); //K: 1arraySearch statt arraySearch und 6 mit arr tauschen
	}
}




//Fehlern
/*
##Zeile 4: class Keyword falschgeschrieben (ckass):
Fehlermeldung:
Debug.java:1:error: class, interface, or  enum expected
public ckass Debug {
Der Compiler erwartet eines der drei oben angegebenen Keywords, hat aber nur das falsch
geschriebene ckass bekommen.


##Zeile 6, 19, 21: Variablen Koflikt mit Kompiler(1arraySearch):
Fehlermeldung:
Debug.java:6: error: <identifier> expected
        static boolean 1arraySearch(int[] array, int i) {  //K: 1arraySearch statt arraySearch
                      ^
Debug.java:6: error: invalid method declaration; return type required
        static boolean 1arraySearch(int[] array, int i) {  //K: 1arraySearch statt arraySearch
                        ^
Debug.java:19: error: ')' expected
                System.out.println(1arraySearch(arr, 3)); //K: 1arraySearch statt arraySearch und 3 mit arr tauschen
                                    ^
Debug.java:19: error: ')' expected
                System.out.println(1arraySearch(arr, 3)); //K: 1arraySearch statt arraySearch und 3 mit arr tauschen
                                                   ^
Debug.java:19: error: not a statement
                System.out.println(1arraySearch(arr, 3)); //K: 1arraySearch statt arraySearch und 3 mit arr tauschen
                                               ^
Debug.java:19: error: not a statement
                System.out.println(1arraySearch(arr, 3)); //K: 1arraySearch statt arraySearch und 3 mit arr tauschen
                                                     ^
Debug.java:19: error: ';' expected
                System.out.println(1arraySearch(arr, 3)); //K: 1arraySearch statt arraySearch und 3 mit arr tauschen
                                                      ^
Debug.java:21: error: ')' expected
                System.out.println(1arraySearch(arr, 6)); //K: 1arraySearch statt arraySearch und 6 mit arr tauschen
                                    ^
Debug.java:21: error: ')' expected
                System.out.println(1arraySearch(arr, 6)); //K: 1arraySearch statt arraySearch und 6 mit arr tauschen
                                                   ^
Debug.java:21: error: not a statement
                System.out.println(1arraySearch(arr, 6)); //K: 1arraySearch statt arraySearch und 6 mit arr tauschen
                                               ^
Debug.java:21: error: not a statement
                System.out.println(1arraySearch(arr, 6)); //K: 1arraySearch statt arraySearch und 6 mit arr tauschen
                                                     ^
Debug.java:21: error: ';' expected
                System.out.println(1arraySearch(arr, 6)); //K: 1arraySearch statt arraySearch und 6 mit arr tauschen

Debug.java:15: error: incompatible types: int cannot be converted to int[]
                System.out.println(arraySearch(3, arr));
                                               ^
Debug.java:17: error: incompatible types: int cannot be converted to int[]
                System.out.println(arraySearch(6, arr));
                                               ^
Note: Some messages have been simplified; recompile with -Xdiags:verbose to get full output
2 errors
Der Kompiler versteht nicht was mit der "1" in 1arraySearch zu tun soll, da es einen Interger gibt und danach einen Funktion.
Außerdem sind die Indexen und Array name verwechselt, da es nicht die Bedingungen in Zeile 6 passt. Man könnte alternativ int[] array und int i
in Zeile 6 tauschen.


##Zeile 9 & 12: true und false sind verwechselt.
Fehlermeldung:
//Erwartete Ausgabe: true
false
//Erwartete Ausgabe: false
true
Wäre es so geblieben, so würde das Ergebnis scheinen:
alle Elementen in dem Array geben false und sonst true, was falsch ist.


##Zeile 7: <=
//Erwartete Ausgabe: true
true
//Erwartete Ausgabe: false
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 5
        at Debug.arraySearch(Debug.java:8)
        at Debug.main(Debug.java:21)




*/
