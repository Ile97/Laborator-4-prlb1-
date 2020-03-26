package com.company;

public class sort {

    int[] a;
    int temp;
    public sort(){
    }
public void getArray(int[] a,int n){
        for(int i=0;i<n;++i){
            int j = i+1;
            System.out.println("a[" + j + "]" + a[j]);
        }
}

public void selection(int[] a , int n){
        for( int i=0;i<n;++i){
            int min_id = i;
            int j;
            for(j=i+1;j<n;++j){
                if(a[j]<a[min_id]){
                    min_id= i;
                }
                j = a[min_id];
                a[min_id] = a[i];
                a[i] = j;
            }
            this.getArray(a,n);
        }
   }

}
