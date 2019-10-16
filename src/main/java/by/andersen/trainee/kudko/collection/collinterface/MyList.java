package by.andersen.trainee.kudko.collection.collinterface;

public interface MyList<E> extends MyCollection<E> {
    boolean add(int index, E e);
    E get(int index);
    E set(int index, E element);
    E remove(int index);
}
