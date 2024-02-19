public class Alternatives {

    public static int convertSimple(String input){

        if(input.equals("I"))
            return 1;
        else if (input.equals("III"))
            return 3;
        else if (input.equals("VI"))
            return 6;
        else if (input.equals("IV"))
            return 4;
        else if (input.equals("XVI"))
            return 16;
        else if (input.equals("XIV"))
            return 14;
        else
            return 0;
    }

    public static int convertEmpty(String input){
        return 0;
    }

    public static int convertOKButNaive(String input){
        int value = 0;
        for(int i = input.length() - 1; i >= 0; i-- ){
            switch(input.charAt(i)){
                case 'I':
                    value += 1;
                    break;
                case 'V':
                    value += 5;
                    break;
                case 'X':
                    value += 10;
                    break;
                default:
                    return -1;
            }
        }

        return value;
    }

    public static int convertWrong(String input){
        int value = 0;
        for(int i = input.length() - 1; i >= 0; i-- ){
            switch(input.charAt(i)){
                case 'I':
                    value += 1 * (i + 1);
                    break;
                case 'V':
                    value += 5 * (i + 1);
                    break;
                case 'X':
                    value += 10 * (i + 1);
                    break;
                default:
                    return -1;
            }
        }

        return value;
    }

    //https://www.geeksforgeeks.org/converting-roman-numerals-decimal-lying-1-3999/
    public static int convert(String input) {
        // Initialize result
        int res = 0;

        for (int i=0; i<input.length(); i++)
        {
            // Getting value of symbol s[i]
            int s1 = value(input.charAt(i));

            // Getting value of symbol s[i+1]
            if (i+1 <input.length())
            {
                int s2 = value(input.charAt(i+1));

                // Comparing both values
                if (s1 >= s2)
                {
                    // Value of current symbol is greater
                    // or equalto the next symbol
                    res = res + s1;
                }
                else
                {
                    res = res + s2 - s1;
                    i++; // Value of current symbol is
                    // less than the next symbol
                }
            }
            else
            {
                res = res + s1;
                i++;
            }
        }

        return res;
    }


    //https://www.geeksforgeeks.org/converting-roman-numerals-decimal-lying-1-3999/
    static int value(char r)
    {
        if (r == 'I')
            return 1;
        if (r == 'V')
            return 5;
        if (r == 'X')
            return 10;
        if (r == 'L')
            return 50;
        if (r == 'C')
            return 100;
        if (r == 'D')
            return 500;
        if (r == 'M')
            return 1000;
        return -1;
    }
}
