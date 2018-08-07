import java.util.Scanner;

public class CountByAnything {
    public static void main (String[] args)
    {
        final int STOP = 200;
        final int NUMBER_PER_LIME;
        Scanner input = new Scanner(System.in);
        int StepValue;
        System.out.print("Enter number to count by >>>  ");
        StepValue = input.nextInt();
        NUMBER_PER_LIME = StepValue * 10;
        for (int i = StepValue; i <= STOP; i += StepValue)
        {
            System.out.print(i + " ");
            if(i % NUMBER_PER_LIME == 0)
            {
                System.out.println();
            }
        }
    }
}
