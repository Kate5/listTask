package list;

/**
 * Created by a1 on 03.08.16.
 */
public class ArrayList implements List {

    private int DEFAULT_SIZE = 10;
    private Object[] anArray;
    private int size = 0;
    private int a = 0;

    public ArrayList() {
        this.anArray = new Object[DEFAULT_SIZE];
    }

    public ArrayList(int capacity) {
        this.anArray = new Object[capacity];
    }


    @Override
    public boolean add(Object o) {
        if (this.anArray.length - 1 == this.getSize()) {
            System.out.println("ERROR!" + a++);
        } else {
            check(o);
        }
        return false;
    }

    public int check(Object t) {
        if (this.anArray[0] == null) {
            System.out.println("from 0 point: " + "len " + anArray.length + " size: " + this.getSize());
            this.anArray[0] = t;
            System.out.println("from 0 point: " + "len " + anArray.length + " size: " + this.getSize());
        } else {
            for (int i = 0 + size; i < this.anArray.length - 1; i++) {
                this.anArray[i] = t;
                size++;
                System.out.println("len " + anArray.length + " size: " + this.getSize());
            }
        }
        return 0;
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

//        if (this.anArray == null || this.anArray[0] == null) {
//            return 0;
//        }
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
