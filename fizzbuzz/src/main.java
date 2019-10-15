import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        fizzbuzz();

    }

    public static void fizzbuzz(){


        Scanner input = new Scanner(System.in);
        System.out.println("Input where you want to start from");
        int min = input.nextInt();
        System.out.println("Input where you want to end");
        int max = input.nextInt();

        int length = max-min;

        int[] list = new int[length];

        for(int i =0; i<list.length;i++)
        {
            list[i] = min + i;
        }

        for(int i = min; i<=max;i++){

            if(i%5 == 0 && i%3 == 0)
            {
                System.out.println("Fizz Buzz, ");
            }
            else if(i%5 == 0){
                System.out.println("Buzz, ");
            }
            else if(i%3 == 0){
                System.out.println("Fizz, ");
            }
            else
            {
                System.out.println(i + ", ");
            }



        }


    }
}
