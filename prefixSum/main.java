import java.util.Scanner;

public class main{
    public static void main(String...args){

        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int q=sc.nextInt();
        String str=sc.next();

        int[] prefix= new int[n+1];

        for(int i=1;i<n+1;i++){
            prefix[i]=prefix[i-1];
            if(str.charAt(i-1)=='a'){
                prefix[i]++;
            }
        }

        while(q-- >0){
            int L=sc.nextInt();
            int R=sc.nextInt();

            int count=prefix[R]-prefix[L-1];
            System.out.println("Count of a: "+count);
        }
    }
}