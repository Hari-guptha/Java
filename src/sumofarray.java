public class sumofarray {
    public static void main(String[] args){
        int [] arr = {1,34,5,5,6,98};
        int n= arr.length;
        int sum =0;
        for(int i= 0; i< n; i++){
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
