package com.javaproject.quicksort2;

public class Main {
    
    public static void main(String[] args) {




        // Declarando QuickSort

        QuickSort quickSort = new QuickSort();




        // Declarando vetor de exemplo

        // Vetor da publicação

        int [ ] vector = {3, 8, 7, 10, 0, 23, 2, 1, 77, 7};




        // Declarando início e fim do vetor a ser ordenado

        int left = 0;

        int right = vector.length - 1;




        System.out.print(

            "----------------" +
            
            "\n\n");




        // Chamando o quickSort e ordenando o vetor

        quickSort.quickSort(vector, left, right);




        // Mosytrando o vetor ordenado

        quickSort.showVector(vector);




        System.out.print(

            "\n\n" +

            "----------------");


            
        
    } // main

} // Main