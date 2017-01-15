import java.util.Arrays;

/**
 * Created by salonibindra on 1/14/17.
 */
public class CheckPermutation {
    public static void main(String[] args)
    {
        String a = "qwert";
        String b = "terwq";

        CheckPermutation per = new CheckPermutation();
        System.out.println(per.Validate(a,b));
    }

    public boolean Validate (String a , String b)
    {
        if (a.length()!=b.length())
        {
            System.out.println("length");return false;
        }

        char[] x1 = a.toCharArray();
        char[] x2 = b.toCharArray();

        Arrays.sort(x1);
        String a1= new String(x1);
        System.out.println(x1);

        Arrays.sort(x2);
        String b2 = new String(x2);
        System.out.println(x2);
        return (a1.equals(b2));

    }


}
