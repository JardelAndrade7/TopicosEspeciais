package com.javaproject.quicksort;

public class QuickSort {



	
    public int [ ] swap(int [ ] vector, int posicaoTrocar1, int posicaoTrocar2) {

        int vectorPosicaoTrocar1 = vector [ posicaoTrocar1 ];

        vector [ posicaoTrocar1 ] = vector [ posicaoTrocar2 ];

        vector [ posicaoTrocar2 ] = vectorPosicaoTrocar1 ;

        return vector;
            
    } // swap




    public int partition(int[] values, int left, int right) {
        
        int pivot = values[left]; // pivot = 8

        int i = left; // i = 6

        for (int j = left + 1; j <= right; j++) { // j = 9

            if (values[j] <= pivot) { // 7 <= 8?

                i+=1;

                swap(values, i, j);

            } // if

        } // for




        // Troca values [ left ] por values [ i ]

        // Ou seja, troca pivot pelo último número da sequência que é menor ou igual a ele

        swap(values, left, i);




        // Retorna a posição do pivot
        
        return i;

    } // partition




    public void quickSort(int[] values, int left, int right) {

	    if (left < right) {

		    int index_pivot = partition(values, left, right); // 3




            // Depois de fazer a partição, mostrar como ficou o vetor. Ou seja, depois de cada partição, mostrar como ficou o vetor

            System.out.print(
                
                "values: ");

            showVector(values);

            System.out.print(
                
                "\n\n" +
                
                "indexPivot: " + index_pivot +
                
                "\n\n\n\n\n");




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