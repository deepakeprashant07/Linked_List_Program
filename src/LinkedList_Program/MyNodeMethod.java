package LinkedList_Program;

import java.util.ArrayList;
import java.util.Scanner;

public class MyNodeMethod {
    Scanner scan = new Scanner(System.in);
    ArrayList<MyNode> buffer = new ArrayList<>();
    public void addList() {
        System.out.println("Enter Node Data");
        int firstKey= scan.nextInt();
        MyNode<Integer> firstValue = new MyNode<>(firstKey);
        System.out.println("Enter Next Node Data");
        int secondKey= scan.nextInt();
        MyNode<Integer> secondValue = new MyNode<>(secondKey);
        System.out.println("Enter Node Data");
        int thirdKey= scan.nextInt();
        MyNode<Integer> thirdValue = new MyNode<>(thirdKey);

        buffer.add(firstValue);
        buffer.add(secondValue);
        buffer.add(thirdValue);
    }
    public void uc1Print(){
        MyNode firstValue =buffer.get(0) ;
        MyNode secondValue = buffer.get(1);
        MyNode thirdValue = buffer.get(2);
        MyNode head = thirdValue;
        head.next = secondValue;
        secondValue.next = firstValue;
        firstValue.next = null;
        while (head!=null){
            System.out.print(head.key+" -> ");
            head = head.next;
        }
        System.out.print("null \n");
    }

}
