import java.lang.reflect.Array;
import java.util.*;
public class AboveAverage
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Integer> aboveAverage = new ArrayList<>(c);
        ArrayList<Double> averages = new ArrayList<>();

        for(int i = 0; i < c; i++)
        {
            sc.next();
            String input = sc.nextLine();
            String[] split = input.split("\\s+");

            numbers.clear();
            aboveAverage.clear();

            for(int j = 1; j < split.length; j++)
            {
                numbers.add(Integer.parseInt(split[j]));
            }

            int sum = 0;
            for(int j = 0; j < numbers.size(); j++)
            {
                sum += numbers.get(j);
            }
            int average = sum/numbers.size();

            for(int j = 0; j < numbers.size(); j++)
            {
                if(numbers.get(j) > average)
                {
                    aboveAverage.add(numbers.get(j));
                }
            }

            averages.add((double)aboveAverage.size()/numbers.size());
        }

        for(Double average : averages)
        {
            average *= 100;
            System.out.printf("%.3f", average);
            System.out.print("%");
            System.out.println();
        }
    }
}
