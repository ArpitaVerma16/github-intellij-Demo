package twoDimensionalArray;
import java.util.*;

public class arraylisttwoD {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(1); arr.add(2); arr.add(3);
        List<Integer> brr= new ArrayList<>();
        brr.add(4); brr.add(5);
        List<Integer> crr= new ArrayList<>();//1D arraylist
        crr.add(6);crr.add(7);crr.add(8);crr.add(9);
        List<List<Integer>> l = new ArrayList<>();
        l.add(arr);   l.add(brr);      l.add(crr);

        // get an element
        for(int i =0;i<l.size();i++){
            List<Integer> x = l.get(i);
            for (int j = 0; j < x.size(); j++) {
                System.out.print(x.get(j)+" ");
            }
            System.out.println();
        }
        //get specific element
        System.out.println(l.get(1).get(1));
    }
}
