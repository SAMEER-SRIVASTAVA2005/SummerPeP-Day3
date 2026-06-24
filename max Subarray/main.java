// package max Subarray;

public class main {
    public static void main(String...args){

        int []arr={-2,1,-3,4,-1,2,1,-5,4};
        // int []arr={5,4,-1,7,8};


        int psum=0;
        int msum=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            psum+=arr[i];
            msum=Math.max(msum,psum);
            if(psum<0){
                psum=0;
            }
            
        }

        System.out.println(msum);
    }
}
