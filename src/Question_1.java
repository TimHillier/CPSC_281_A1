import java.util.Random;

/*
 * Tim Hillier
 * 230108884
 * Question 1
 */

public class Question_1 {

	public static void main (String args[]){
		
		//random number for generation
		Random rando = new Random();  
			

		
		
// Double arrays
		//Row and Column of the array
		int col = 1000; 
		int row = 1000; 
//timing varables
		long startTime=0; 
		long endTime=0; 
		long averageTime=0;
//create array to use
	
		
//row major		
	System.out.println("::::::::ROW MAJOR:::::::");
	for(int a = 0; a<10; a++)
	{
		//create 5 arrays for better sample size
		for(int i =0; i<5; i++ )
		{
			double [][] array = new double[row][col]; 
		
		
			startTime=System.currentTimeMillis(); 
			for(int j=0; j<row;j++)
			{
				for(int k=0; k<col; k++)
				{
					array[j][k]=rando.nextDouble(); 
					
			
					
				}
			endTime+=System.currentTimeMillis()-startTime; 
				
			}
		
		
		
		
		
		
		
		}
		
		
		//calculate time
		averageTime=endTime/5; 
		System.out.println("col size:"+col+"\nRow size:"+row+"\naverage Time:"+averageTime+"\n");
		
		//increase size
		col += 1000; 
		row += 1000; 	
	}
	
	//reset
	col = 1000; 
	row = 1000; 
	startTime=0; 
	endTime=0; 
	averageTime=0;
	
	//col major
	System.out.println("::::::::COL MAJOR:::::::");
	for(int a = 0; a<10; a++)
	{
		//create 5 arrays for better sample size
		for(int i =0; i<5; i++ )
		{
			double [][] array = new double[row][col]; 
		
		
			startTime=System.currentTimeMillis(); 
			for(int j=0; j<col;j++)
			{
				for(int k=0; k<row; k++)
				{
					array[j][k]=rando.nextDouble(); 
					
			
					
				}
			endTime+=System.currentTimeMillis()-startTime; 
				
			}
		
		
		
		
		
		
		
		}
		
		
		//calculate time
		averageTime=endTime/5; 
		System.out.println("col size:"+col+"\nRow size:"+row+"\naverage Time:"+averageTime+"\n");
		
		//increase size
		col += 1000; 
		row += 1000; 	
	}
	
		
		
		
			
			
			
			
			
	}
	
	
	
	
	
	
}
