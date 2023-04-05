public class Exceptions {
    
    public static void main(String[] args) {
        try{
            int a = 3/0;
            System.out.println(a);
        }
        catch(ArithmeticException ex){
            System.out.println(ex.getMessage());
        }
        finally{
            System.out.println("finally");
        }
    }
}
