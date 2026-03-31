import java.util.Scanner;
public class App
 {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, world!");
        System.out.print(rounding(48,100));
    }
    public static int rounding(int val, int d)
    {
        if(val % d < d/2)
        {
            return(val - val%d);
        }
        return (val + d - val%d);
    }

    


    public static int countDigits(int number) 
    {
    number = Math.abs(number); 
    int count = 0;
    while (number != 0) 
    {
        number /= 10;
        count++;
    }
    return count;
}

}
