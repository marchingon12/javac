package aufgabe1;

import aufgabe1.model.*;

public class Main {
    public static void main(String[] args) {

        int[] data = {1, 2, 16, 4, 9};

        ListHead head = new ListHead(data);

        System.out.println(head.str());

        head.sort();

        System.out.println(head.str());
    }
}
