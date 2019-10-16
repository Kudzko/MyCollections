package by.andersen.trainee.kudko.collection.collinterface;

public interface MyCollection<E> extends Iterable {
    boolean add (E e);
    boolean remove (E e);
    boolean isEmpty ();
    int size();
}