package LinkedList_Program;

import java.util.Scanner;

public class MyNodeTest {
    public static final int UC2=1;
    public static final int UC3=2;
    public static void main(String args[]) {
        MyNode<Integer> firstValue = new MyNode<>(56);
        MyNode<Integer> secondValue = new MyNode<>(30);
        MyNode<Integer> thirdValue = new MyNode<>(70);
        MyNode head = firstValue;
        head.next = secondValue;
        secondValue.next = thirdValue;
        thirdValue.next = null;
        while (head!=null){
            System.out.print(head.key+" -> ");
            head = head.next;
        }
        System.out.print("null \n");

        MyNodeMethod myNodeObject = new MyNodeMethod();
        Scanner scan = new Scanner(System.in);
        System.out.println("1] Create New Linked List");
        System.out.println("2] Append Linked List");
        int choice= scan.nextInt();
        switch (choice){
            case UC2:
                myNodeObject.addList();
                myNodeObject.uc1Print();
                break;
            case UC3:
                myNodeObject.addList();
                myNodeObject.appendPrint();
                break;
            default:
                System.out.println("Wrong Choice \nThank You...!");

        }
    }
}
