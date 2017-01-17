import java.util.HashSet;

/**
 * Created by salonibindra on 1/15/17.
 */
public class PalindromePermutation
{
    public boolean PalindromePermute (String s)
    {
        String str= s.toLowerCase();

        //Create the frequency count;
        int[] count = new int[35];
        boolean flag= true;

        for (char c: s.toCharArray() )
        {
           int temp=  Character.getNumericValue(c);
           if (temp!=-1)
               count[temp]++;
        }
        for (int i:count )
        {
            System.out.print(i);
        }
        System.out.println();
        System.out.println(s.length()%2);



        if (s.length()%2==0)
        {
            for (int i : count)
            {
                if ((count[i] % 2) == 1)
                {  flag = false;
                    System.out.println("in even at "+i);}
            }
        }
        else
        {   int found=0;
            for (int i : count)
            {
                System.out.print(count[i]);
                if ((count[i] % 2) == 1)
                { found++;System.out.println("in odd at "+i );}
            }
            System.out.println(found+" "+(count[26]%2));
            if (found != 1)
                flag = false;
        }


        return  flag;

    }
    public boolean hashSolution(String s) {
        HashSet<Character> hs = new HashSet<>();

        for (char c: s.toCharArray()) {
            if (hs.contains(c)) {
                hs.remove(c);
            } else {
                hs.add(c);
            }
        }
        return hs.size() <=1;

    }




    public static void main(String[] args) {
        String s = "abacct6aba";
        PalindromePermutation per = new PalindromePermutation();
       // System.out.println(per.PalindromePermute(s));
       // System.out.println( Character.getNumericValue('q'));
       // System.out.println(getCharNumber(ch: 'Z')));
        System.out.println(per.hashSolution(s));
    }
}
