
/**
 * Ryan Wagner
 * Finding Minimum and Maximum values in an array
 */

public class FindMinMax
{
    public static void main(String[] args)
    {
        int [] numList = {3, 99, -1, 5, -10};
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        System.out.println("List of numbers to find min and max values from ->");
        for(int i: numList){
            System.out.printf(i + " ");
        }
        for(int i = 0; i < numList.length; i ++)
        {
            if(numList[i] < min)
                min = numList[i];

            if(numList[i] > max)
                max = numList[i];
        }
        System.out.println("\n\nMinimum value is " + min);
        System.out.println("Maximum value is " + max);
    }
}

