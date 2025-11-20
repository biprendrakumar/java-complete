public class largestof_three {
    public static void main(String[] args) {
        int a=10, b=20, c=15;

        // type 1
        // if(a>=b && a>=c){
        //     System.out.println("Largest number is: "+a);
        // }
        // else if(b>=a && b>=c){
        //     System.out.println("Largest number is: "+b);
        // }
        // else{
        //     System.out.println("Largest number is: "+c);
        // }


        // type 2
        int largest=(a>=b)?(a>=c?a:c):(b>=c?b:c);
        System.out.println("Largest number is: "+largest);
    }
}
