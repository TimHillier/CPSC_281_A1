import java.util.Arrays;
import java.util.Random;

//using Arrays to make it easier to see the array. 


/*
 * OUTPUT
 * 
Print the 2d array
[[42, 11, 0, 0], [6, 25, 40, 0], [0, 38, 22, 25], [0, 0, 2, 6]]
Storing non zero values in 1d array
Print value array
11,40,25,42,25,22,6,6,38,2,Get 3,3: 22
 * 
 * 
 * 
 * 
 * 
 * 
 */



public class Question_2 {
	
	
	static int[][] ARRAY2D; 
	static int[]   ARRAY1D;
	static int SIZE =10; 

	public static void main (String args[]){
		
		//set size of the 2darray
		setSize(4); 
		//create 2d array
		setDDArray(getSize()); 
		//create 1d array
		setDArray(getSize());
		//int[] Array = new int[(3*(getSize()))-2];
		
		//store the values into an array
		for(int i =0; i<getSize();i++)
		{
			for(int j =0; j<getSize(); j++)
			{
				//store method
				store(i,j,getSize()); 
				
			}
		}
		
		//retreive method
		
		
		
		
		//print the 2d array
		System.out.println("Print the 2d array");
		System.out.println(Arrays.deepToString(getDDArray()));
		System.out.println("Storing non zero values in 1d array\nPrint value array");
		//Print the storing array
		for(int i:getDArray())
		{
			System.out.print(i+",");
		}
		System.out.println("Get 3,3: "+retreave(3,3, getSize()));
		
		
		

		
		
	}
	
	
	/*
	 * getter and setter for 2d array
	 */
	public static void setDDArray(int size)
	{
		ARRAY2D = create(size); 
	}
	public static int[][] getDDArray()
	{
		return ARRAY2D; 
	}
	
	/*
	 * getter and setter for 1d array
	 */
	public static void setDArray(int size)
	{
		ARRAY1D = new int[(3*(size))-2]; 
	}
	public static int[] getDArray()
	{
		return ARRAY1D; 
	}
	/*
	 * getter and setter for size of array
	 */
	public static void setSize(int size)
	{
		SIZE = size; 
	}
	public static int getSize()
	{
		return SIZE;
	}
	
	
	
	/**
	 * creates a square, diagonal, 2d array
	 * @param size
	 * @return 
	 */
	private static int[][] create(int size)
	{
		
		
		
		Random rando = new Random();  
		//initialize new array
		int [][] intArray = new int[size][size]; 
	
		for(int i =0; i<size; i++)
		{
			for(int j=0; j<size;j++)
			{
				switch(i-j)
				{
				case -1: 
				case 0:
				case 1:
					intArray[i][j] = rando.nextInt(50)+1; 
					
					break;
				//Defaults to 0
				default: 
					intArray[i][j] = 0; 
					break; 
					
				}
				 
				
			}
		}
		
		return intArray; 
		//System.out.println(number_of_elements); 
		//System.out.println(Arrays.deepToString(intArray));
		
		
	}
	
	/**
	 * Retreave the value at the specified location in the 1d from location in 2d array
	 * @param i, j location in 2d array
	 * @param size- size of the 2d array
	 * @return
	 */
	public static int retreave(int i,int j,int size)
	{
		int val =0; 
		
		switch(i-j)
		{
		case -1:
			val = getDArray()[(2*size)-2+i]; 
			break;
		case 0: 
			val = getDArray()[size+i-2]; 
			break;
		case 1:
			val = getDArray()[i-2]; 
			break; 
			//if its not on the diag its gonna be 0
		default:
			val = 0; 
			break; 
		
		
		
		
		}
		
		
		
		return val; 
	}
	/**
	 * Stores the value in the 1d array
	 * @param val - value to sotre
	 * @param i - i val
	 * @param j - j val
	 * @param arry - array to store in
	 * @param size - size of array
	 */
	public static void store(int i,int j,int size)
	{
		
		
		
		
		switch(i-j)
		{
		case 1:
			getDArray()[(2*size)-1+j] = getDDArray()[i][j];
			break;
		case 0:
			getDArray()[size+i-1] = getDDArray()[i][j]; 
			break; 
		case -1: 
			getDArray()[j-1] = getDDArray()[i][j]; 
			break; 
			default:
			break;
		
		}
		
		
		
		
		
		
		
		
		
}
	
	
}





