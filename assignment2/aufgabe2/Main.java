 //August Ho
//Aufgabe 2

import model.*;


public class Main{
  public static void main(String[] args) {
    int[]  dataArr1 = {1, 2, 3};
    ListHead  list1 = new ListHead(dataArr1); // list1 = (1)->(2)->(3)->null
    System.out.println(list1.str());
    ListHead  list2 = new ListHead(
      new  ListNode(4,
        new  ListNode(5,
            null
        )
      )
    ); //  list2 = (4)->(5)->null
    System.out.println(list2.str());

    int[]  dataArr2 = {5, 3, 1, 4, 2};
    ListHead  list = new  ListHead(dataArr2);
    list.sort();  // list3 = (1)->(2)->(3)->(4)->(5)->null
    System.out.println(list.str());
    listHead.insert(1,2); // list4 = (1)->(2)->(2)->(3)->(4)->(5)->null
    System.out.println(list.str());
  }
}
