public class LinkedList {

    private int size;
    private Node head;
    private Node tail;

    LinkedList(){
       this.size=0;
       head = tail = null;
    }


    //Add Elements At First Index
    public void addAtStart(int data){
        Node node = new Node(data);
        node.next=head;
        head = node;
        if(size==0){
            tail = head;
        }
        size++;
    }

    //Add Last/Add Elements
    public void addElement(int data){
        Node node = new Node(data);

        //To check if linked list is empty
        if(size==0){
            head = tail = node;
        }
        tail.next = node;
        tail = node;
        size++;
    }

    //Insert At specific index of linked list
    public void insertAt(int index, int data) throws Exception{
        Node node = new Node(data);
        if(index ==0){
            addAtStart(data);
        }
        else if(index <0 || index>size){
            throw new IndexOutOfBoundsException("Given Index is out of bound");
        }
        else if(index==size){
            addElement(data);
        }
        else{
            Node temp= head;
            for(int nthIndex =0; nthIndex<index-1; nthIndex++){
                temp = temp.next;
            }
            Node fwdNode = temp.next;
            temp.next = node;
            node.next=fwdNode;
            size++;
        }
    }
    //Insert At specific index of linked list
    public void removeAt(int index) throws Exception{
        //Check is start Index
        if(index ==0){
            head = head.next;
            size--;
        }

        //If its above the size
        else if(index <0 || index>size){
            throw new IndexOutOfBoundsException("Given Index is out of bound");
        }

        //At Any index
        else{
            Node temp= head;
            for(int nthIndex =0; nthIndex<index-1; nthIndex++){
                temp = temp.next;
            }
            if(index==size){
               tail = temp;
            }else{
                temp.next = temp.next.next;
            }


            size--;

        }
    }




    public void display() {
        Node temp = head;
        while(temp !=null){
            System.out.print( temp.data +" -> ");
            temp = temp.next;
        }
        System.out.println();
    }
    //Return length/size of LinkedList
    public int getSize(){
        return this.size;
    }
}
