package list;

/**
 * Created by a1 on 03.08.16.
 */
public class ArrayList implements List {

    public int DEFAULT_SIZE = 10;

    public ArrayList() {
        Object[] anArray = new Object[DEFAULT_SIZE];
        System.out.println( "cons" + anArray.length );
    }

    public ArrayList(int capacity) {
        Object[] anArray = new Object[capacity];
        System.out.println( "cons" + anArray.length );
    }


    @Override
    public boolean add(Object o) {

       /* Object[] anArray;
        anArray = new Object[10];

                Object[] dest = new Object[20];
        System.arraycopy(anArray, 0, dest, 0, 10);
         */













        return false;

    }

    @Override
    public Object get(int index) {
        return null;
    }

    @Override
    public void remove(int index) {

    }

    @Override
    public int size() {
        return 0;
    }
}
