package Exception;

public class Exc_Demo {
    public static void main(String[] args) {

        try{
            // EXCEPTION GENERATING STATEMENTS
            int result = 10 / 0;
        }
        catch(Exception e){
            //EXCEPTION HANDLING STATEMENTS
            System.out.println("In Catch Block");
        }
        System.out.println("Done");

        //ArrayIndexOutOfBoundException

        int[] a = {1, 2, 3};
        try{
            System.out.println(a[6]);
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("Exception");
        }
        finally {
            //ALWAYS EXECUTES
            System.out.println("Finally");
        }
    }
}
