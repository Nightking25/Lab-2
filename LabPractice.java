public class LabPractice {

      public static void main(String[] args){

        System.out.println("*****String Practice*****");

        //String hello = "hello";
        String hello = new String("hello");

        System.out.println(hello);

        String upHello =  hello.toUpperCase();

        System.out.println(upHello);
        System.out.println(upHello.toLowerCase());

        String myBigString = " Hello everybody, today is THusrday, "
                              + "and we are having fun!";

        System.out.println(myBigString);

        System.out.println("\n The first index of 'o' is "
                            + myBigString.indexOf('o'));
        System.out.println("The last index of 'l' is  "
                            + myBigString.lastIndexOf('l'));
        System.out.println("The first index of 'o' in Trimmed string is "
                            + (myBigString.trim()).indexOf('o'));
        System.out.println("The first index of 'l' in Trimmed string is "
                            + (myBigString.trim()).indexOf('l'));                    
      }
}
