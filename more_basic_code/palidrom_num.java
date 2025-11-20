public class palidrom_num {
    public static void main(String[] args) {
        int num=121;
        int org=num;
        int rev=0;
        while(num!=0){
            rev=rev*10+num%10;
            num=num/10;

        }
        if(org==rev){
            System.out.println("Palidrom Number");
        }
        else{
            System.out.println("Not a Palidrom Number");
        }
    }
}
