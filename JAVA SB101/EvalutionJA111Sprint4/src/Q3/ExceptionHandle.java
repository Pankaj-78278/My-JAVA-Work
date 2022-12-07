package Q3;

public class ExceptionHandle {
    public static void fun(){
        int[] array= new int[10];

        Object object =null;

        try {
            array[11]=100;

        }catch (ArrayIndexOutOfBoundsException exception){
            System.out.println("ArrayIndexOutOfBoundsException Error");
        }
        try {
            object.toString();
        }catch (NullPointerException e){
            System.out.println("NullPointerException error");
        }
        catch (Exception exception){
            System.out.println("Any other exception");
        }
        System.out.println("End");
    }
    public static void main(String[] args){
        fun() ;
    }

}
