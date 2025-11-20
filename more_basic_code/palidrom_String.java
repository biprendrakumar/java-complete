public class palidrom_String {
    public static void main(String[] args) {
        String str="viprendra singh";
        StringBuffer sb=new StringBuffer(str);
        sb.reverse();
        if(str.equals(sb.toString())){
            System.out.println("Palidrom String");
        }
        else{
            System.out.println("Not a Palidrom String");
        }
    }
}
