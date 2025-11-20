public class reverseString {
    public static void main(String[] args){
        String str="Helloworld";
        StringBuffer sb=new StringBuffer(str);
        sb.reverse();
        System.out.println(sb);
    }
}
