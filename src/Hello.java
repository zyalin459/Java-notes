// ******** WEEK 1 *************
import java.util.Scanner;

public class Hello {
    public static boolean isPrime (int i)
    {
        boolean isPrime = true;
        for (int k = 2; k < i; k++)
        {
            if (k % i == 0)
            {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    public static void main(String[] args) {
//        System.out.println("Hello World");
//        Scanner in = new Scanner(System.in);
////        System.out.println("echo: " + in.nextLine());
//        System.out.print("Please enter an amount: ");
//        int amount = in.nextInt();
//        System.out.print("Please enter a price: ");
//        int price = in.nextInt();
//        System.out.println(amount+"-"+price+"="+(amount-price));

//        int foot;
//        double inch;
//        Scanner in = new Scanner(System.in);
//        foot = in.nextInt();
//        inch = in.nextDouble();
//        System.out.println((int)12.9);
//        System.out.println("foot="+foot+", inch="+inch);
//        System.out.println((int)((foot+inch/12.0)*0.3048*100)+"cm");

//        System.out.println("Please enter your age: ");
//        Scanner in = new Scanner(System.in);
//        int age = in.nextInt();
//        if (age < 35) {
//            System.out.println("Good age");
//        }

//        Scanner in = new Scanner(System.in);
//        int num = in.nextInt();
//        int count = 0;
//        do {
//            num /= 10;
//            count += 1;
//            System.out.println("Number: "+num+" Count: "+count);
//        } while (num > 0);
//        System.out.println(count);

//        Scanner in = new Scanner(System.in);
//        int sum = 0;
//        int count = 0;
//        int num = in.nextInt();
//        while (num != -1) {
//            sum += num;
//            count += 1;
//            num = in.nextInt();
//        }
//        System.out.println("Sum: "+sum+" Count: "+count+" Average: "+((double)(sum)/count));

//        // Guess random number
//        int target = (int)(Math.random() * 100 + 1);
//        Scanner in = new Scanner(System.in);
//        int num = in.nextInt();
//        int count = 0;
//        do {
//            count += 1;
//            if (num > target)
//            {
//                System.out.println("Too large");
//            }
//            else if (num < target)
//            {
//                System.out.println("Too small");
//            }
//            num = in.nextInt();
//        } while (num != target);
//        System.out.println("Congrats! It's the right number. You guess "+count+" times.");

//        Scanner in = new Scanner(System.in);
//        int a = in.nextInt();
//        int b = in.nextInt();
//        int oa = a;
//        int ob = b;
//        while (b != 0)
//        {
//            int r = a % b;
//            a = b;
//            b = r;
//        }
//        System.out.println("GCD of "+oa+" and "+ob+" is: "+a);

//        Scanner in = new Scanner(System.in);
//        int cnt = in.nextInt();
//        double sum = 0;
//        if (cnt > 0)
//        {
//            int[] numbers = new int[cnt];
//            for (int i = 0; i < cnt; i++)
//            {
//                numbers[i] = in.nextInt();
//                sum += numbers[i];
//            }
//            double average = sum/cnt;
//            for (int i = 0; i < numbers.length; i++)
//            {
//                if (numbers[i] > average)
//                {
//                    System.out.println(numbers[i]);
//                }
//            }
//        }

//        Scanner in = new Scanner(System.in);
//        int x;
//        int[] numbers = new int[10];
//        x = in.nextInt();
//        while (x != -1)
//        {
//            if (x >= 0 && x <= 9)
//            {
//                numbers[x] ++;
//            }
//            x = in.nextInt();
//        }
//        for (int i = 0; i < numbers.length; i++)
//        {
//            System.out.println(numbers[i]+" ");
//        }

//        Scanner in = new Scanner(System.in);
//        char c ='A';
//        char d = (char)(c + 'a'-'A');
//        System.out.println(d);

//        System.out.println("abc\bde");

//        String s = "Hello";
//        System.out.println(s+(12+24));

        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        if (m == 1) m=2;
        int cnt = 0;
        int sum = 0;
        for (int i=m; i <= n; i++)
        {
            if (isPrime(i))
            {
                cnt++;
                sum+=i;
            }
        }
        System.out.println("There are "+cnt+" primes from "+m+" to "+n);
    }
}
