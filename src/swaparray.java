public class swaparray {
    void swap(int[] numbers)
    { 
        int len = numbers.length;
        int temp=0;
        temp = numbers[0];
        numbers[0]= numbers[4];
        numbers[4]= temp;

        for(int i=0; i<=len ;i++)
        {
            System.out.println(numbers[i]);
        }
    }
    public static void main(String[] arg)
    {
        swaparray s = new swaparray();

        int[] arr = { 125, 132, 95, 116, 110 };
        s.swap(arr);
        
    }
}

