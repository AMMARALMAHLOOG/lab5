/**
 * Created by hp on 16-Feb-22.
 */

public class SinglyLinkedList<E> {
    private Node<E>head= null;
    private Node<E>tail= null;
    private int size;
    public int size(){return size;}
    public boolean isEmpty(){return size==0;}
    public E first(){
           if (isEmpty())return null;
           else return head.getData();
    }
    public E last(){
        if (isEmpty())return null;
        else return tail.getData();
    }
    public void addFirst(E e)
    {
       head = new Node<E>(e,head);
           if (size==0)
               tail=head;
        size++;
    }
public void addLast(E e){
      Node<E> newst = new Node<E>(e,null);
    if (isEmpty())
        head = tail;
       else
           tail.Next=newst;
           tail=newst;
    size++;
}

public E removeFirst(){
        if (isEmpty())return null;
            E remove=head.getData();
            head=head.getNext();
          if (size==0)
              tail=null;
          size--;
         return remove;
    }

    private static class Node<E>{
            E data;
            Node<E> Next;

        public E getData() {
            return data;
        }

        public void setData(E data) {
            this.data = data;
        }

        public Node<E> getNext() {
            return Next;
        }

        public void setNext(Node<E> next) {
            Next = next;
        }

        public Node(E data, Node<E> next) {
            this.data = data;
            Next = next;
        }
    }
}
