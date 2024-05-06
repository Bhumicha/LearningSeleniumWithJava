package Arrays;
import java.util.ArrayList;
import java.util.List;


public class ConvertingArrayToList {
    public static void main (String[] args)
    {
        //converting array  to list
//        Integer[] a = new Integer{1,4,5,2,6,7,8,3};
//        List<Integer> list = Arrays.asList(a);
//        Collection.sort

        //using Arraylist
        List<String> list = new ArrayList<>();
        list.add("Ram");
        list.add("sita");
        list.add("Gita");
        list.add("Smita");

        System.out.println(list);
        list.add(1,"Hari");
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
        System.out.println(list.size());

        for(String b:list){
            System.out.println(b);
        }
    }
}
