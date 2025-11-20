public class reverse_number {
    public static void main(String[] args) {
        int num=12345;


        // type 1
        // int reversed=0;
        // while(num!=0){
        //     reversed=reversed*10+num%10;
        //     num=num/10;
        // }
        // System.out.println("Reversed Number: "+reversed);


        // type 2
        // String str=Integer.toString(num);
        // String reversest="";
        // int l=str.length();
        // for(int i=0;i<str.length();i++){
        //     reversest+=str.charAt(l-1-i);
        // }
        // System.out.println(reversest);

        // type 3
        StringBuffer sb= new StringBuffer(Integer.toString(num));
        sb.reverse();
        System.out.println(sb);







    }
}
