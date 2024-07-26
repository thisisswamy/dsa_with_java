public class GenericLinkedList<T> {
    private int size;
    private GenericNode<T> head;
    private GenericNode<T> tail;

    GenericLinkedList(){
        this.size=0;
        head = tail = null;
    }


    //Add Elements At First Index
    public void addAtStart(T data){
        GenericNode<T> node = new GenericNode<T>(data);
        node.next=head;
        head = node;
        if(size==0){
            tail = head;
        }
        size++;
    }

    //Add Last/Add Elements
    public void addElement(T data){
        GenericNode<T> node = new GenericNode<T>(data);

        //To check if linked list is empty
        if(size==0){
            head = tail = node;
            size++;
        }else{
            tail.next = node;
            tail = node;
            size++;
        }

    }

    //Insert At specific index of linked list
    public void insertAt(int index, T data) throws Exception{
        GenericNode<T> node = new GenericNode<T>(data);
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
            GenericNode<T> temp= head;
            for(int nthIndex =0; nthIndex<index-1; nthIndex++){
                temp = temp.next;
            }
            GenericNode<T> fwdNode = temp.next;
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
            GenericNode<T> temp= head;
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
        GenericNode<T> temp = head;
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
