public class GenericNode<T> {

    T data;
    GenericNode<T> next;

    GenericNode(T data){
        this.data = data;
        this.next = null;
    }
}
