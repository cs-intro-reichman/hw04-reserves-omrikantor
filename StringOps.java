public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) 
    {
        
    }

    public static String capVowelsLowRest (String string) {
        String last = "";
        String str = lowerCase(string);
        for (int j = 0; j < str.length(); j++)
        {
            if ((str.charAt(j) == 'a') || (str.charAt(j) == 'e') || (str.charAt(j) == 'i') || (str.charAt(j) == 'o') || (str.charAt(j) == 'u'))
            {
                last += (char) (str.charAt(j) - 32);
            }
            else
            {
                last += str.charAt(j);
            }
        }
        return last;
    }

    public static String camelCase (String string) {
        String last = "";
        String str = lowerCase(string);
        for(int i = 0; i < str.length(); i++)
        {
            if (str.charAt(i) == ' ')
            {
                last += (char) (str.charAt(i + 1) - 32);
                i++;
            }
            else
            {
                last += str.charAt(i);
            }
        }
        return last;
    }

    public static int[] allIndexOf (String string, char chr) 
    {
        int count = 0;
        int a = 0;
        for (int i = 0; i < string.length(); i++)
        {
            if(chr == string.charAt(i))
            {
                count++;
            }
        }
        int [] arr = new int [count];
        for (int j = 0; j < string.length(); j++)
        {
            if(chr == string.charAt(j))
            {
                arr[a] = j;
                a++;
            }
        }
        return arr;
    }
    public static String lowerCase(String s)
    {
        String a = "";
        for (int i = 0; i < s.length(); i++)
        {
            if ((s.charAt(i) >= 'A') && (s.charAt(i)) <= 'Z') 
            {
                a = a + (char) (s.charAt(i) + 32);
            }
            else
            {
                    a += s.charAt(i);
            }
        }
        return a;
    }
    public static void println(int[] arr) 
    {
        for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + " ");
        }
        System.out.println();
        }
}
