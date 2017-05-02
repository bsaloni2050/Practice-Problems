package Strings;

import java.util.Stack;

/**
 * Created by salonibindra on 2/23/17.
 */
public class RevPolishNotation {

    public static int eval (String[] input){

        if (input == null ||  input.length <3)
            return 0;
        
        String operators = "+-*/";
        Stack<String> st = new Stack<>();

        for (String val: input ) {
            if (operators.contains(val)) {
                int x = Integer.valueOf(st.pop());
                int y = Integer.valueOf(st.pop());

                switch (val){
                    case "+" : st.push(String.valueOf(x+y));
                    break;
                    case "-" : st.push(String.valueOf(x-y));
                    break;
                    case "*" : st.push(String.valueOf(x*y));
                    break;
                    case "/" : st.push(String.valueOf(x/y));
                    break;
                }


            } else
                    st.push(val);
            
        }
        return Integer.valueOf(st.pop());
        
    }
    public static int eval2 (String[] input){

        if (input == null ||  input.length <3)
            return 0;

        String operators = "+-*/";
        Stack<String> st = new Stack<>();

        for (String val: input ) {
            if (operators.contains(val)) {
                int x = Integer.valueOf(st.pop());
                int y = Integer.valueOf(st.pop());
                int op = operators.indexOf(val);

                switch (op){
                    case 0 : st.push(String.valueOf(x+y));
                        break;
                    case 1 : st.push(String.valueOf(x-y));
                        break;
                    case 2 : st.push(String.valueOf(x*y));
                        break;
                    case 3 : st.push(String.valueOf(x/y));
                        break;
                }


            } else
                st.push(val);

        }
        return Integer.valueOf(st.pop());

    }


    public static int eval1 (String[] input){

        if (input == null ||  input.length <3)
            return 0;

        String operators = "+-*/";
        Stack<String> st = new Stack<>();

        for (String val: input ) {
            if (operators.contains(val)) {
                int x = Integer.valueOf(st.pop());
                int y = Integer.valueOf(st.pop());
                int op = operators.indexOf(val);

                switch (op){
                    case 0 : st.push(String.valueOf(x+y));
                        break;
                    case 1 : st.push(String.valueOf(x-y));
                        break;
                    case 2 : st.push(String.valueOf(x*y));
                        break;
                    case 3 : st.push(String.valueOf(x/y));
                        break;
                }


            } else
                st.push(val);

        }
        return Integer.valueOf(st.pop());

    }


    public static void main(String[] args) {
        String[] input = new String[] {"1", "2"};
        //"+","3","*","5","+"};
        System.out.println(eval(input));
        System.out.println(eval1(input));
       // System.out.println(Integer.valueOf(2+3));
    }


}
