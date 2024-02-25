package Conceptofjava;

import java.util.StringTokenizer;

public class StringReverseCode {

    public static String  StringReverse(String str)
    {
        StringBuilder builder = new StringBuilder();
        StringTokenizer tokenizer = new StringTokenizer(str , " ");

        System.out.println("The total number of tokens are: "+tokenizer.countTokens());

        while (tokenizer.hasMoreTokens())
        {
            StringBuilder sb = new StringBuilder();
            sb.append(tokenizer.nextToken());
            sb.reverse();

            builder.append(sb);
            builder.append(" ");
        }

        return builder.toString();


    }

    public static void main(String[] args) {

        String ex = "My Name is Himanshi.";
        String get = StringReverse(ex);
        System.out.println(get);


    }
}
