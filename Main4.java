import static java.lang.Character.*;

public class Main4 {
    public static void main(String[] args)
    {
        String str = "SsTyubTOLj567!@#NM@__";
        int lower=0,upper=0,special=0,digit=0;
        for(int i=0;i<str.length();i++)
        {
            if(isUpperCase(str.charAt(i)))
            {
             upper++;
            }
            else if(isLowerCase(str.charAt(i)))
            {
                lower++;
            }
            else if(isDigit(str.charAt(i)))
            {
               digit++;
            }
            else
                special++;

        }
        System.out.println(lower);
        System.out.println(upper);
        System.out.println(digit);
        System.out.println(special);
        int perlower= (lower*100)/str.length();
        System.out.println(perlower+"%");
        int perupper= (upper*100)/str.length();
        System.out.println(perupper+"%");
        int perdigit= (digit*100)/str.length();
        System.out.println(perdigit+"%");
        int perspecial= (special*100)/str.length();
        System.out.println(perspecial+"%");

    }
}
