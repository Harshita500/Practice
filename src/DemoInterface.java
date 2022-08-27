
interface car
{
    public void ride();

}

 class DemoInterface implements car {

    public void ride()
    {
        System.out.println("Helo from Interface");
    }
    public static void main(String args[])
    {
        DemoInterface di=new DemoInterface();
        di.ride();

    }
}
