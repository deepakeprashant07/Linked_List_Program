package LinkedList_Program;

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
        System.out.print("null");
    }
}
