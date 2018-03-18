package org.sustiha.singleton.org.sustiha.mergesort;

/**
 * Created by sustihashreesampath on 12/18/16.
 */
public class MergeSort {


    public static void main(String [] args)
    {
        int [] sortElements = {7,6,5,4,3,2,1};
        int [] temp = new int[sortElements.length];
        MergeSort mergeSort = new MergeSort();
        mergeSort.merge(sortElements,temp,0,sortElements.length);
        for (int t:temp
             ) {
                       System.out.println(t);
        }

    }


    public void merge(int [] sortElement,int [] temp,int left,int right)
    {
        if(left<right) {
            int middle = (left + right) / 2;
            merge(sortElement, temp,left,middle);
            merge(sortElement,temp, middle + 1, right);
            sort(sortElement,temp,right,middle,left);
        }
    }

    public void sort(int []  sortElement,int [] temp,int left,int middle,int right)
    {
        int i=0,k=0;
        int leftLength = middle-1;
        while(i<=leftLength && middle<=right)
        {
            if(sortElement[i] <= sortElement[middle])
            {
                temp[k] = sortElement[i];
                k++;
                i++;
            }
            else
            {
                temp[k]=sortElement[middle];
                k++;
                middle++;
            }

        }

        while(i<=leftLength)
        {
            temp[k]=sortElement[i];
            k++;
            i++;
        }

        while(middle<=right)
        {
            temp[k]=sortElement[middle];
            k++;
            middle++;
        }






    }
}
