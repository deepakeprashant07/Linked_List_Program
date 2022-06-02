package LinkedList_Program;

import java.util.Scanner;

public class MyNodeTest {
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
        int choice= scan.nextInt();
        switch (choice){
            case 1:
                myNodeObject.addList();
                myNodeObject.uc1Print();
                break;
            default:
                System.out.println("Wrong Choice \nThank You...!");

        }
    }
}
