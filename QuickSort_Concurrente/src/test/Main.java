package test;

import datos.ThreadedQuick;

public class Main
{
		public static void main(String[] args) 
		{
		
			//Concurrente
			int cantidadElementos = 10;

			// Generar un array aleatorio
			int[] arr1 = ThreadedQuick.generarArrayAleatorio(cantidadElementos, 0, cantidadElementos*10);

			// Mostrar el array antes de ordenar
			System.out.println("Array antes de ordenar:");
			ThreadedQuick.mostrarArray(arr1);
			
			// Crear una instancia de ThreadedQuick y ordenar el array
			
			ThreadedQuick sorter = new ThreadedQuick(arr1.length - 1 / ThreadedQuick.MAX_THREADS, arr1, 0, arr1.length - 1);

			System.out.println("\nCantidad de nodos disponibles:"+(ThreadedQuick.MAX_THREADS));

			System.out.println("\nCantidad de elementros a ordenar:"+(arr1.length));

			// Iniciar el contador de tiempo
			long startTime = System.nanoTime();
			System.out.println("\nQuicksort con hilos iniciado");

			// Ejecutar el ordenamiento
			sorter.run(); // Puedes también usar executor.submit(sorter);

			// Detener el contador de tiempo
			long endTime = System.nanoTime();
			
			// Calcular el tiempo transcurrido en nanosegundos
			long duration = (endTime - startTime);

			// Mostrar el array después de ordenar
			System.out.println("\nArray después de ordenar:");
			ThreadedQuick.mostrarArray(arr1);

			// Mostrar el tiempo transcurrido
			System.out.println("\nQuicksort con hilos terminado. Tiempo transcurrido: " + duration + " ns");

			// Apagar el executor
			ThreadedQuick.executor.shutdown();


		}
}
