public class max_value_array {
    public static void main(String[] args) {
        int[] arr={10,20,5,30,15};
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Maximum value in the array is: "+max);
    }
}
