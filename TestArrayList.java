import java.util.*;
public  class TestArrayList
{
    public static void main(String[] args)
    {
        List<Integer> a = new ArrayList<>();

        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);

        for(Integer i : a)
        {
            System.out.println(i);
        }

        System.out.println("Premier element "+a.get(0));

        a.set(0,6);

        System.out.println("Premier element "+a.get(0));
        System.out.println("Taille "+a.size());

        a.remove(0);
        
        System.out.println("Premier element "+a.get(0));
        System.out.println("Taille "+a.size());

    }
}