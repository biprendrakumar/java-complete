public class prime_range {
    public static void main(String[] args) {
        int lower=10;
        int upper=50;
        for(int num=lower;num<=upper;num++){
            boolean isPrime=true;
            for(int i=2;i<=num/2;i++){
                if(num%i==0){
                    isPrime=false;
                    break;
                }
            }
            if(isPrime && num>1){
                System.out.println(num+" is prime");
            }
        }
    }
}
