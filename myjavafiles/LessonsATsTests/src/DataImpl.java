/* interface Data {
    default void print(String str) {
        if ( !isNull(str) ) {
            System.out.println("Data. Prints lines: " + str);
        }
    }
    static boolean isNull(String str) {
        System.out.println("Static method null checking ");
        return str == null ? true : "".equals(str.trim()) ? true : false;
    }
}
public class DataImpl implements Data {
    public boolean isNull(String str) {
        System.out.println("Null check ");
        return str == null;
    }
    public static void main(String[] args) {
        Data obj = new DataImpl();
        obj.print("");
        //obj.isNull("");
    }
}*/

  interface Data {
     default void print(String str) {
         //System.out.println("Data: " + str);
         if ( !isNull(str) ) {
             System.out.println("Data: " + str);
         }
     }
     static boolean isNull(String str) {
         return str == null ? true : "".equals(str.trim()) ? true : false;
     }
 }
 public class DataImpl implements Data {
     public static void main(String[] args) {
         Data obj = new DataImpl();
         obj.print("test");
     }
 }