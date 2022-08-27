
abstract class Hello
{
    public abstract void run();

}


public class ExampAbstarct extends Hello {

public void run()
{
    System.out.println("Hello run");

}
}

class ExampAbstract
{
    public static void main(String args[])
    {
        Hello hw=new ExampAbstarct();
        hw.run();
    }
}
