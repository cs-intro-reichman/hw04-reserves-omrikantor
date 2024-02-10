public class ArrayOps {
    public static void main(String[] args) 
    {

    }
    
    public static int findMissingInt (int [] array) {
        int x = array.length;
        int a = 0;
        boolean [] is = new boolean[x];
        if (x == 1) 
        {
            return x;            
        }
        for (int s = 0; s < is.length; s++)
        {
            is[s] = false;
        }
        for (int i = 0; i < array.length; i++)
        {
            for (int j = 0; j < array.length; j++)
            {
                if (i == array[j])
                {
                    is[i] = true;
                }
            }
        }
        for (int b = 0; b < is.length; b++)
        {
            if(is[b] == false)
            {
                a = b;
            }
        }
        return a;
        }

    public static int secondMaxValue(int [] array) {
        int max = array[0];
        int secondMax = array[0];
        for (int i = 0; i < array.length; i++)
        {
            if (array[i] > max) 
            {
                secondMax = max;
                max = array[i];
            }
            else
            {
                if (array[i] > secondMax) 
                {
                    secondMax = array[i];    
                }
            }
        }
        return secondMax;
    }

    public static boolean containsTheSameElements(int [] array1,int [] array2) {
        int [] a1 = set(array1);
        int [] a2 = set(array2);
        boolean [] is = new boolean[a1.length];
        for (int s = 0; s < is.length; s++)
        {
            is[s] = false;
        }
        if (a1.length != a2.length) 
        {
            return false;
        }
        else
        {
            for (int i = 0; i < a1.length; i++)
            {
                for (int j = 0; j < a2.length; j++)
                {
                    if (a1[i] == a2[j])
                    {
                        is[i] = true;
                    }
                }
            }
        }
        for(int x = 0; x < is.length; x++)
        {
            if (is[x] == false) 
            {
                return false;
            }
        }
        return true;
    }

    public static boolean isSorted(int [] array) {
        if (array[0] > array[1])
        {
            for(int i = 1; (i + 1) < array.length; i++)
            {
                if (array[i] < array[i+1]) 
                {
                    return false;                    
                }
            }
            return true;
        }
        else
        {
            for(int j = 1; (j + 1) < array.length; j++)
            {
                if (array[j] > array[j+1]) 
                {
                    return false;                    
                }
            }
            return true;
        }
    }
    public static boolean contains(int[] arr, int value, int index) {
        for (int i = 0; i < index; i++) {
        if (arr[i] == value) {
        return true;
        }
        }
        return false ;
        }
    public static int countUnique(int[] arr) 
    {
        int count = 0; 
        for (int i = 0; i < arr.length; i++) {
        count = contains(arr, arr[i], i) ? count : count + 1;
        }
        return count;
        }
    public static int [] set (int[] arr) {
        int [] res = new int [countUnique(arr)];
        int index = 0; 
        for (int i = 0; i < arr.length; i++) {
            if (!contains(arr, arr[i], i))
            {
            res[index++] = arr[i];
            }
            }
            return res;
            }

}
