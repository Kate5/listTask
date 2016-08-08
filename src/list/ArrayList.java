package list;

/**
 * Created by a1 on 03.08.16.
 */
public class ArrayList implements List {

    private int DEFAULT_SIZE = 10;
    private Object[] anArray;

    public ArrayList() {
        this.anArray = new Object[DEFAULT_SIZE];
    }

    public ArrayList(int capacity) {
        this.anArray = new Object[capacity];
    }

    @Override
    public boolean add(Object o) {
        if ((this.anArray.length - 1) == this.getSize()) {
            copyAndAdd(o);
        } else {
            addToArray(o);
        }
        return false;
    }

    private void addToArray(Object t) {

//        for (int i = 0 + size; i < this.anArray.length - 1; i++) {
//            this.anArray[i] = t;
//            size++; }

        this.anArray[this.getSize()] = t;
        System.out.println("length: " + anArray.length + " and size: " + this.getSize());

    }

    private void copyAndAdd(Object g) {
        Object[] newArr;
        newArr = new Object[this.anArray.length + DEFAULT_SIZE];
        int i;
        for (i = 0; i < this.getSize(); i++) {
            newArr[i] = this.anArray[i];
        }
        newArr[i + 1] = g;
        this.anArray = newArr;
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

    private int getSize() {
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
