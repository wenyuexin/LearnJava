package sort;

import java.util.Arrays;

/**
 * @author Apollo4634
 * @create 2019/02/04
 * @see SortUtils
 */

public class MergeSort {

	//T[]
	private static <T extends Comparable<? super T>> 
	void merge(T[] arr, T[] aux, int left, int mid, int right) {
		for (int i = left; i <= right; i++) aux[i] = arr[i];
		
		int i=left, j=mid+1, k=left;
		while (i<=mid || j<=right) {
			if (i>mid) arr[k++] = aux[j++];
			else if (j>right) arr[k++] = aux[i++];
			else if (SortUtils.less(aux[j], aux[i])) arr[k++] = aux[j++];
			else arr[k++] = aux[i++];
		}
	}
	
	private static <T extends Comparable<? super T>>
	void subsort(T[] arr, T[] aux, int left, int right) {
		if (left<right) {
			int mid = (left+right)/2;
			subsort(arr, aux, left, mid);
			subsort(arr, aux, mid+1, right);
			merge(arr, aux, left, mid, right);
		}
	}
	
	public static <T extends Comparable<? super T>> 
	void sort(T[] arr) {
		int arrLen = arr.length;
		T[] aux = Arrays.copyOf(arr, arrLen);
		subsort(arr, aux, 0, arrLen-1);
	}
	
	
	//int
	private static void merge(int[] arr, int[] aux, int left, int mid, int right) {
		for (int i = left; i <= right; i++) aux[i] = arr[i];
		
		int i=left, j=mid+1, k=left;
		while (i<=mid || j<=right) {
			if (i>mid) arr[k++] = aux[j++];
			else if (j>right) arr[k++] = aux[i++];
			else if (SortUtils.less(aux[j], aux[i])) arr[k++] = aux[j++];
			else arr[k++] = aux[i++];
		}
	}
	
	private static void subsort(int[] arr, int[] aux, int left, int right) {
		if (left<right) {
			int mid = (left+right)/2;
			subsort(arr, aux, left, mid);
			subsort(arr, aux, mid+1, right);
			merge(arr, aux, left, mid, right);
		}
	}
	
	public static void sort(int[] arr) {
		int arrLen = arr.length;
		int[] aux = Arrays.copyOf(arr, arrLen);
		subsort(arr, aux, 0, arrLen-1);
	}
	
	
	//long
	private static void merge(long[] arr, long[] aux, int left, int mid, int right) {
		for (int i = left; i <= right; i++) aux[i] = arr[i];
		
		int i=left, j=mid+1, k=left;
		while (i<=mid || j<=right) {
			if (i>mid) arr[k++] = aux[j++];
			else if (j>right) arr[k++] = aux[i++];
			else if (SortUtils.less(aux[j], aux[i])) arr[k++] = aux[j++];
			else arr[k++] = aux[i++];
		}
	}
	
	private static void subsort(long[] arr, long[] aux, int left, int right) {
		if (left<right) {
			int mid = (left+right)/2;
			subsort(arr, aux, left, mid);
			subsort(arr, aux, mid+1, right);
			merge(arr, aux, left, mid, right);
		}
	}
	
	public static void sort(long[] arr) {
		int arrLen = arr.length;
		long[] aux = Arrays.copyOf(arr, arrLen);
		subsort(arr, aux, 0, arrLen-1);
	}
	
	
	//double
	private static void merge(double[] arr, double[] aux, int left, int mid, int right) {
		for (int i = left; i <= right; i++) aux[i] = arr[i];
		
		int i=left, j=mid+1, k=left;
		while (i<=mid || j<=right) {
			if (i>mid) arr[k++] = aux[j++];
			else if (j>right) arr[k++] = aux[i++];
			else if (SortUtils.less(aux[j], aux[i])) arr[k++] = aux[j++];
			else arr[k++] = aux[i++];
		}
	}
	
	private static void subsort(double[] arr, double[] aux, int left, int right) {
		if (left<right) {
			int mid = (left+right)/2;
			subsort(arr, aux, left, mid);
			subsort(arr, aux, mid+1, right);
			merge(arr, aux, left, mid, right);
		}
	}
	
	public static void sort(double[] arr) {
		int arrLen = arr.length;
		double[] aux = Arrays.copyOf(arr, arrLen);
		subsort(arr, aux, 0, arrLen-1);
	}
}