package ss9_dsa_list.practice.class_linked_list_simple;

public class TestLinkedList {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        LinkedList linkedList = new LinkedList(5);
        linkedList.addFirst(11);
        linkedList.addFirst(12);
        linkedList.addFirst(13);

        linkedList.add(4,9);
        linkedList.add(4,9);
        linkedList.add(2,6);
        linkedList.printList();
    }
}
