
    public class main{
       public static void main(String[]args) {
           try {
    	  int arr[]= {1,2,3};
    	  System.out.println(arr[5]);
        }
        catch (ArrayIndexOutOfBoundsExpection e) {
           System.out.println("Invalid index!");
        }
        catch(Exception e) {
           System.out.println("Something went wrong!");
    }
      }
    }
