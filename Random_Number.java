package Basic;

import java.util.Random;

public class Random_Number {

    public static void main(String[] args) {

    int n;
    for(n=1; n<=100; n++)
    {
    Random r = new Random();
    int value=r.nextInt(50);
    System.out.println("Random Value="+value);
    }

}
}
