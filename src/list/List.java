package list;

/**
 * Created by a1 on 03.08.16.
 */
public interface List<E> {

    public boolean add(E e);

    public E get(int index);

    public void remove(int index);

    public int size();
}

