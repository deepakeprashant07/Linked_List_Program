package LinkedList_Program;

import java.util.LinkedList;
import java.util.Scanner;

public class MyNodeMethod {
    Scanner scan = new Scanner(System.in);
    LinkedList<MyNode> buffer = new LinkedList<>();

    public void addList() {
        System.out.println("Enter Node Data");
        int firstKey = scan.nextInt();
        MyNode<Integer> firstValue = new MyNode<>(firstKey);
        System.out.println("Enter Next Node Data");
        int secondKey = scan.nextInt();
        MyNode<Integer> secondValue = new MyNode<>(secondKey);
        System.out.println("Enter Node Data");
        int thirdKey = scan.nextInt();
        MyNode<Integer> thirdValue = new MyNode<>(thirdKey);

        buffer.add(firstValue);
        buffer.add(secondValue);
        buffer.add(thirdValue);
    }

    public void uc1Print() {
        MyNode firstValue = buffer.get(0);
        MyNode secondValue = buffer.get(1);
        MyNode thirdValue = buffer.get(2);
        MyNode head = thirdValue;
        head.next = secondValue;
        secondValue.next = firstValue;
        firstValue.next = null;
        while (head != null) {
            System.out.print(head.key + " -> ");
            head = head.next;
        }
        System.out.print("null \n");
    }


    public void appendPrint() {
        MyNode firstValue = buffer.get(0);
        MyNode secondValue = buffer.get(1);
        MyNode thirdValue = buffer.get(2);
        MyNode head = firstValue;
        head.next = secondValue;
        secondValue.next = thirdValue;
        thirdValue.next = null;
        while (head != null) {
            System.out.print(head.key + " -> ");
            head = head.next;
        }
        System.out.print("null \n");
    }

    public void inserList(MyNode head, MyNode secondValue, MyNode thirdValue) {
        head.next = secondValue;
        secondValue.next = thirdValue;
        thirdValue.next = null;
        System.out.println("Enter Data To Insert");
        int toAdd = scan.nextInt();
        MyNode<Integer> insertData = new MyNode<>(toAdd);
        System.out.println("Which Position Add");
        int position = scan.nextInt();
        if (position == 0) {
            insertData.next = head;
            head=insertData;
            return;
        }
        MyNode previousData = head;
        for (int i = 0; i < position - 1; i++) {
            previousData = previousData.next;
        }
        insertData.next = previousData.next;
        previousData.next = insertData;
        while (head != null) {
            System.out.print(head.key + " -> ");
            head = head.next;
        }
        System.out.print("null \n");
    }

    public void popList(MyNode head, MyNode secondValue, MyNode thirdValue) {
        head.next = secondValue;
        secondValue.next = thirdValue;
        thirdValue.next = null;
        buffer.push(head);
        buffer.push(secondValue);
        buffer.push(thirdValue);
        buffer.pop();
        for (int i = 0; i < buffer.size(); i++) {
            System.out.print(buffer.get(i).key+" ->");
        }
        System.out.println("null\n");
    }
}
