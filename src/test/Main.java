package test;


import list.ArrayList;
import list.List;

//import java.util.ArrayList;
//import java.util.List;

/**
 * Created by a1 on 04.08.16.
 */
public class Main {
    public static void main(String[] args) {

       // List<String> test = new ArrayList<>();
        List<String> test = new ArrayList();
        test.size();

        for (int i=0; i<20; i++) {
            test.add("test" + i);
        }



        System.out.println( test  + "size: " + test.size() );


    }
}
