// package Check if Array Is Sorted and Rotated;

public class main {
    public static void main(String[] args) {
        
        int arr[]={2,1,3,4};
        // int arr[]={3,4,5,1,2};
        // int arr[]={1,2,3};
        
        int drop=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>arr[(i+1)%arr.length]){
                drop++;
            }
            
        }

        if(drop>1) System.out.println("False"); 
        else System.out.println("True");   
    }
}
