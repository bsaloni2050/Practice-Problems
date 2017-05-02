package Strings;

/**
 * Created by salonibindra on 1/15/17.
 */
public class ConvertToURL {
    public static void main(String[] args) {
        String s="Convert me to the url format ";
        ConvertToURL url = new ConvertToURL();
        System.out.println("String is URL format is  "+url.to_URL(s));
    }

    public String to_URL (String s)

    {
        int n = s.length(); int count=0;
        char[] x = s.toCharArray();

        for (int i = 0; i < n; i++)
         if (x[i]==' ') count++;
        //System.out.println(count);

        int n1=n+2*count; int marker =0;
        char[] g= new char[n1];
       // System.out.println(g);

        for (int i = 0; i < x.length; i++)
        {

                if (x[i] == ' ')
                {
                    g[marker++]='2';
                    g[marker++]='0';
                    g[marker++]='%';
                   // System.out.println(g);
                }
                else
                    g[marker++]=x[i];
            //System.out.println(g);

        }


        return String.valueOf(g);
    }
}
