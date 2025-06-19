'''
*****
*   *
*   *
*   *
*****
'''
import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner value=new Scanner(System.in);
        System.out.println("Enter the number for pattern: ");
        int num=value.nextInt();
        for(int i=0;i<num;i++){
            if(i==0||i==num-1){
                for(int j=0;j<num;j++){
                    System.out.print("*\t");
                }
                System.out.println();
            }else{
                for(int k=0;k<num;k++){
                    if(k==0||k==num-1){
                        System.out.print("*\t");
                    }else{
                        System.out.print("\t");
                    }
                    if(k==num-1){
                         System.out.println();
                    }}}}}}
