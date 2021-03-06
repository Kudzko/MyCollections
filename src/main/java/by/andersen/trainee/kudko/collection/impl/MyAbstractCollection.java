package by.andersen.trainee.kudko.collection.impl;

import by.andersen.trainee.kudko.collection.collinterface.MyCollection;

import java.util.Iterator;

public abstract class MyAbstractCollection<E> implements MyCollection {

    @Override
    public String toString() {
        Iterator<E> it = iterator();
        if (! it.hasNext())
            return "[]";

        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for (;;) {
            E e = it.next();
            sb.append(e == this ? "(this Collection)" : e);
            if (! it.hasNext())
                return sb.append(']').toString();
            sb.append(',').append(' ');
        }
    }
}
