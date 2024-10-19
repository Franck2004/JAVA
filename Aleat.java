// package cm.test;
import java.util.*;

public class Aleat {

    private int n,lim;
    private int[] suite;    
    private int[] val;

    Aleat(int n , int lim)
    {
        this.n = n;
        this.lim =lim;

        suite= new int[n+1];
        for(int i = 0; i < n+1; i++)
        {
            suite[i] = (int)(Math.random()*(lim+1));
        }
    }
    public int getValeur(int n)
    {
        return suite[n];
    }
    public int[] getValeurs()
    {
        val = new int[n+1];
        for(int i=0; i < n+1; i++) val[i] = suite[i];
        return val;
    }
    
    
    public static void main(String[] args) {
        final int N = 17,LIM = 485;
        Aleat suite1 = new Aleat(N,LIM);
        System.out.print(suite1.getValeur(4));
        for(int i=0; i < N+1 ; i++)
        {
            System.out.println(suite1.getValeurs()[i]);
        }
    }
}
