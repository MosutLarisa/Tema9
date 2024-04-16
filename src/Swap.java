import java.util.ArrayList;

public class Swap {
    public static void main(String[] args) {
    	
        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("hello");
        list1.add("world");
        System.out.println(list1);
        swapFirstLast(list1);
        System.out.println("New list: " + list1);

        ArrayList<String> list2 = new ArrayList<String>();
        list2.add("hello");
        System.out.println(list2);
        swapFirstLast(list2);
        System.out.println("New list: " + list2);

        ArrayList<String> list3 = new ArrayList<String>();
        System.out.println(list3);
        swapFirstLast(list3);
        System.out.println("New list: " + list3);
    }

    public static void swapFirstLast(ArrayList<String> list) {
        if (list.size() >= 2) {
            String first = list.get(0);
            String last = list.get(list.size() - 1);
            list.set(0, last);
            list.set(list.size() - 1, first);
        }
    }
}
