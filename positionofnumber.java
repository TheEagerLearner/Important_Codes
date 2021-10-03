package com.company;

public class positionofnumber {

    public  static void main(String[] args){
        int[] arr= {5,7,7,7,7,8,8,10};
        int target = 7;
        int position1= Startposition(arr,target);
        int position2 = Endposition(arr,target);
        binaryserachpos(arr, target);

        System.out.println("["+position1+" "+position2+"]");
    }


    static int[] binaryserachpos(int[] arr,int target){

        int[] ans={-1,-1};
        int start =search(arr,target,true);
        int end= search(arr,target,false);
        System.out.println("["+start+" "+end+"]");
        ans[0]=start;
        ans[1]=end;
        return ans;
    }
     static int search(int[] arr,int target,boolean findStartIndex){
        int start=0;
        int end = arr.length-1;
        int middle;
        int ans=-1;
        while(start<=end){
            middle = start +(end - start)/2;
            if(target<arr[middle]){
                end = middle-1;
            }else if(target>arr[middle]){
                start=middle+1;
            }else{
                ans=middle;
                if(findStartIndex)
                    end=middle-1;
                else
                    start=middle+1;
            }
        }
        return ans;
    }
    static int Startposition(int[] arr,int target){
//        int pos=0;
        for(int i= 0;i<arr.length;i++){
            if(arr[i]==target)
                return i;
            else
                continue;
        }
        return -1;
    }
    static int Endposition(int[] arr,int target){
//        int pos=0;

        for(int i= arr.length-1;i>=0;i--){
            if(arr[i]==target)
                return i;
            else
                continue;
        }
        return -1;
    }

}
