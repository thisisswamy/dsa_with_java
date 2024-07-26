public class LinkedListManipulation {
    public static void main(String[] args) throws Exception {

        LinkedList list = new LinkedList();
        System.out.println("Initial size of list :: "+list.getSize());

//        list.addAtStart(12);
//        list.addAtStart(23);
        list.addElement(10);
        list.addElement(20);
        list.insertAt(0,30);
        list.insertAt(2,40);
        list.insertAt(4,50);
        list.display();
        list.removeAt(2);
        list.display();
        System.out.println("size of list :: "+list.getSize());

        System.out.println("--------------:: My Generic Linked Lists ::--------");

        GenericLinkedList<String> genericLinkedList = new GenericLinkedList<>();
        genericLinkedList.addAtStart("12");
        genericLinkedList.addElement("123");
        genericLinkedList.addElement("1234");
        genericLinkedList.insertAt(0,"1");
        genericLinkedList.removeAt(3);
        System.out.println("Generic list size :: "+genericLinkedList.getSize());
        genericLinkedList.display();

    }
}