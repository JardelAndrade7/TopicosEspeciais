package com.javaproject.quicksort;

public class Main {
    
    public static void main(String[] args) {




        // Declarando QuickSort

        QuickSort quickSort = new QuickSort();




        // Declarando vetores de exemplo

        // Vetores da publicação

        int [ ] vector = {3, 8, 7, 10, 0, 23, 2, 1, 77, 7};

        int [ ] vector2 = {6, 4, 12, 2, 24, 1};

        // Meu vetor, inventado por mim

        int [ ] vector3 = {60, 50, 80, 40, 30, 90};

        int [ ] vector4 = {3, 8, 7, 10, 0, 2, 1, 7};




        // Declarando início e fim do vetor a ser utilizado

        int left = 0;

        int right = vector.length - 1;




        System.out.print(

            "----------------" +
            
            "\n\n\n\n\n");

        // Chamando o quickSort, que vai fazer cada um dos particionamentos e mostrar cada um

        quickSort.quickSort(vector, left, right);

        System.out.print(

            "----------------");


            
        
    } // main

} // Main