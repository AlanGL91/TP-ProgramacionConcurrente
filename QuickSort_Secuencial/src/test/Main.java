package test;

import datos.Funciones;

public class Main
{
		public static void main(String[] args) 
		{
			int cantidadElementos = 10;

			// Generar un array aleatorio
			int[] arr2 = Funciones.generarArrayAleatorio(cantidadElementos, 0, cantidadElementos*10);

			// Mostrar el array antes de ordenar
			//System.out.println("Array antes de ordenar:");
			//Funciones.mostrarArray(arr2);
			
			//Secuencial
			
			// Iniciar el contador de tiempo
			long startTime = System.nanoTime();
			System.out.println("\nQuicksort secuencial iniciado");
			Funciones.quickSort(arr2,0,arr2.length-1);
			
			// Detener el contador de tiempo
			long endTime = System.nanoTime();
						
			// Calcular el tiempo transcurrido en nanosegundos
			long duration = (endTime - startTime);

			// Mostrar el array después de ordenar
			//System.out.println("\nArray después de ordenar:");
			//Funciones.mostrarArray(arr2);

			// Mostrar el tiempo transcurrido
			System.out.println("\nQuicksort secuencial termimado. Tiempo transcurrido: " + duration + " ns");
		}
}
