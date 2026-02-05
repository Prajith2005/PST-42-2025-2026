public class largest_element {
public static void main(String[] args) {
    int[] arr ={11,29,67,4,55,44};
    int max =arr[0];
    for(int i=0;i<arr.length;i++){
        if(arr[i]>max){
            max=arr[i];
        }
    }
    System.out.println(max);
}    
}
