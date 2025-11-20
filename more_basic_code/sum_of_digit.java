public class sum_of_digit {
    public static void main(String[] args){
        int num=12445;
        int sum=0;
        while(num!=0){
            sum+=num%10;
            num/=10;
        }
        System.out.println("Sum of digits: "+sum);
    }
}
