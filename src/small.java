public class small {
    public static void main(String[] arg)
    {
        {
            int[] marks = { 125, 132, 95, 116, 110 };
            int lowest_marks = maximum(marks);
            System.out.println("The lowest score is " + lowest_marks);
        }
    }
    public static int maximum(int[] numbers)
    { 
        int lowSoFar = numbers[0];
        for (int num : numbers) 
        {
            if (num < lowSoFar)
            {
                lowSoFar = num;
            }
        }
    return lowSoFar;
    }
}

