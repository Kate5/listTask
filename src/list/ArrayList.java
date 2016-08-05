package list;

/**
 * Created by a1 on 03.08.16.
 */
public class ArrayList implements List {

    private int DEFAULT_SIZE = 10;
    private Object[] anArray;

    public ArrayList() {
        this.anArray = new Object[DEFAULT_SIZE];
        System.out.println("cons" + anArray.length);

    }

    public ArrayList(int capacity) {
        this.anArray = new Object[capacity];
        System.out.println("cons" + anArray.length);
    }


    @Override
    public boolean add(Object o) {

        boolean result = false;
        if (this.anArray[0] == null) {
            this.anArray[0] = o;
            result = true;
            System.out.println( "first if" );
        }

        if ( this.getSize() == this.anArray.length ) {
            Object[] destination = new Object[this.anArray.length*2];
            System.arraycopy( this.anArray, 0, destination, 0, 10);
            result = true;
            this.anArray = destination;
            System.out.println( "second if" );
        }

        else {
            System.out.println( "hm" );
        }

        return result;

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

        return getSize();
    }

    public int getSize() {

        if (this.anArray == null || this.anArray[0] == null) {
            return 0;
        }
        int size = 0;
        for (int i = 0; i < this.anArray.length - 1; i++) {
            if (this.anArray[i] == null) {
                break;
            } else {
                size++;
            }
        }
        return size;
    }

}
