public class prime {
    public static void main(String[] args) {
        int num=29;
        boolean isPrime=true;
        for(int i=2;i<=num/2;i++){
            if(num%2==0){
                isPrime=false;
                break;
            }else{
                isPrime=true;
            }
        }System.out.println(isPrime?"prime":"not prime");


}
}
