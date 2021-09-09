public class TravellingTester {
    public static void main(String[] args) {
        Travelling t1 = new Travelling("Toronto", "Car", 5);


        System.out.println(t1.toString());
        t1.confirmation(6);

        try{
            t1.confirmation(7);

        }
        catch(Exception e)
        {
            System.out.println("something went wrong");
        }
    }
}
