// import java.lang.reflect.Type;

public class datatypes {
    public static void main(String[] x){
        int mynum=5;
        // int num=null; // This will cause an error because primitive data types cannot be null   
        System.out.println(mynum);
        // System.out.println(Type(mynum));

        float myfloatnum=5.99f;
        System.out.println(myfloatnum);

        char myletter='D';
        System.out.println(myletter);

        boolean mybool=true;
        System.out.println(mybool);

        String mytext="Hello World";
        System.out.println(mytext);

        double mydoublenum=19.99d;
        System.out.println(mydoublenum);

        byte mybytenum=100;
        System.out.println(mybytenum);

        short myshortnum=5000;
        System.out.println(myshortnum);

        long mylongnum=15000000000L;
        System.out.println(mylongnum);

        Integer mynum2=null; // This is ok because Integer is a reference data type
        System.out.println(mynum2);

        
    }
}
