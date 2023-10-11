package com.javaproject.quicksort2;

public class QuickSort {



	
    public int [ ] swap(int [ ] vector, int posicaoTrocar1, int posicaoTrocar2) {

        int vectorPosicaoTrocar1 = vector [ posicaoTrocar1 ];

        vector [ posicaoTrocar1 ] = vector [ posicaoTrocar2 ];

        vector [ posicaoTrocar2 ] = vectorPosicaoTrocar1 ;

        return vector;
            
    } // swap




    public int partition(int[] values, int left, int right) {
        
        int pivot = values[left];

        int i = left;

        for (int j = left + 1; j <= right; j++) {

            if (values[j] <= pivot) {

                i+=1;

                swap(values, i, j);

            } // if

        } // for

        swap(values, left, i);
        
        return i;

    } // partition




    public void quickSort(int[] values, int left, int right) {

	    if (left < right) {

		    int index_pivot = partition(values, left, right); // 3

        	quickSort(values, left, index_pivot - 1);

		    quickSort(values, index_pivot + 1, right);

	    } // if

    } // quickSort




    public void showVector(int [ ] vector) {

        for(int i = 0; i < vector.length; i++) {

            System.out.print(
    
                vector [ i ]);
                
            if(i + 1 < vector.length) {
                
                System.out.print(

                    ", ");

            }

        } // for
        
    } // showVector
    
} // QuickSort