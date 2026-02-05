public class smallest_element {
    public static void main(String[] args) {
       int[]arr={88,99,44,11,55,78};
       int min=arr[0];
       for(int i=0;i<arr.length;i++){
        if(arr[i]<min){
            min=arr[i];
        }
       }
       System.out.println(min);
    }
}
