//prorgram to perform multiThreading
import java.util.Random;
class EvenThread extends Thread{
    private int num;
    EvenThread(int num){
        this.num = num;
    }
    public void run()
    {
        System.out.println("The square of the number is: "+num*num);
    }
}
class OddThread extends Thread{
    private int num;
    public OddThread(int num)
    {
        this.num = num;
    }
    public void run()
    {
        System.out.println("The cube of the numbers are: "+num*num*num);
    }
}
class RandomThread extends Thread{
    public void run()
    {
        Random r = new Random();
        for(int i = 0; i < 5; i++)
        {
            int num = r.nextInt(100);
            if(num % 2 == 0)
            {
                EvenThread e = new EvenThread(num);
                e.start();
            }
            else{
                OddThread o = new OddThread(num);
                o.start();
            }
        }

    }
}
class MultiThread
{
    public static void main(String [] args)
    {
        RandomThread rt = new RandomThread();
        rt.start();
    }
}