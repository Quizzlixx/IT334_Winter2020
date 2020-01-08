package queues;

public interface IPriorityQueue<T extends Comparable<T>>
{
    //three ADT methods
    void insert(T element);
    T deleteMin();
    T peek();
    int size();
    boolean isEmpty();
}
