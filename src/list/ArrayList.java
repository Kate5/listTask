package list;

/**
 * Created by a1 on 03.08.16.
 */
public class ArrayList implements List {

    private int DEFAULT_SIZE = 10;
    private Object[] anArray;

    public ArrayList() {
        this.anArray = new Object[DEFAULT_SIZE];
        System.out.println( "cons" + anArray.length );

    }

    public ArrayList(int capacity) {
        this.anArray = new Object[capacity];
        System.out.println( "cons" + anArray.length );
    }


    @Override
    public boolean add(Object o) {

       /* Object[] anArray;
        anArray = new Object[10];

                Object[] dest = new Object[20];
        System.arraycopy(anArray, 0, dest, 0, 10);
         */

       int length = this.anArray.length - 1;

      // this.anArray[0]



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

        int i;
        int length = this.anArray.length -1;
        for ( i=0; i<length; i++) {
            if (this.anArray[i] == null) {
                System.out.println( i );
                return i;
            }
        }

        return i;
    }
}
