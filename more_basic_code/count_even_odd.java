public class count_even_odd {
    public static void main(String[] args) {
        int num=123456;
        int even_count=0;
        int odd_count=0;
        while(num!=0){
            int digit=num%10;
            if(digit%2==0){
                even_count++;
            }
            else{
                odd_count++;
            }
            num=num/10;
        }
        System.out.println("Even digits: "+even_count);
        System.out.println("Odd digits: "+odd_count);
    }
}
