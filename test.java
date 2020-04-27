import java.util.Random;

public class test 
{
    public static void main(String[] args) {
        int a = 10;
        Random random = new Random(a);
        System.out.print(   random.nextInt()    );    
    }
}