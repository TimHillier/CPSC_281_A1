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
		//Row and Column size of the array
		int col = 1000; 
		int row = 500; 
//timing varables
		long startTime=0; 
		long endTime=0; 
		long averageTime=0;
		long run = 0; 
//set location for files
		IO.setlocation("/Users/Tim/Desktop/Cpsc_281/Q1");
		String filename = "Question1"; 
		
//row major		
	System.out.println("::::::::ROW MAJOR:::::::");
	IO.write(filename, "::::::::ROW MAJOR:::::::\n");
	//do 10 experiments
	for(int a = 0; a<10; a++)
	{
		//create 5 arrays for better sample size
		for(int i =0; i<5; i++ )
		{
			
			double [][] array = new double[row][col]; 
		
			/*fill array row major
			 *Row is the outer loop
			 */
			startTime=System.currentTimeMillis(); 
			for(int j=0; j<row;j++)
			{
				for(int k=0; k<col; k++)
				{
					array[j][k]=rando.nextDouble(); 
					
			
					
				}
			
			}
			endTime = System.currentTimeMillis(); 
			run = run +(endTime - startTime); 
		
		
		
		
		
		
		}
		
		
		//calculate time
		averageTime=run/5; 
		System.out.println("col size:"+col+"\nRow size:"+row+"\naverage Time:"+averageTime+"\n");
		IO.write(filename, col +","+row+","+averageTime+"\n");
		endTime = 0; 
		//increase size
		col += 1000; 
		row += 1000; 	
	}
	
	//reset
	col = 1000; 
	row = 500; 
	startTime=0; 
	endTime=0; 
	averageTime=0;
	run = 0; 
	
	//col major
	System.out.println("::::::::COL MAJOR:::::::");
	IO.write(filename, "::::::::COL MAJOR:::::::\n");
	//create 10 different array sizes
	for(int a = 0; a<10; a++)
	{
		 endTime =0; 
		//create 5 arrays for better sample size
		for(int i =0; i<5; i++ )
		{
			double [][] array = new double[row][col]; 
		
			//time at start
			startTime=System.currentTimeMillis(); 
			
			for(int j=0; j<col;j++)
			{
				for(int k=0; k<row; k++)
				{
					array[k][j]=rando.nextDouble(); 
					
			
					
				}
			
				
			}
			//time at end
			endTime = System.currentTimeMillis(); 
			
			run = run +(endTime - startTime); 
		
		
		
		
		
		}
		
		
		//calculate time
		averageTime=run/5; 
		System.out.println("col size:"+col+"\nRow size:"+row+"average Time:"+averageTime+"\n");
		IO.write(filename, col +","+row+","+averageTime+"\n");
		run = 0; 
		
		//increase size
		col += 1000; 
		row += 1000; 	
	}
	
		
		
		
			
			
			
			
			
	}
	
	
	
	
	
	
}
/*
output:::

::::::::ROW MAJOR:::::::
col size:1000
Row size:500
average Time:18

col size:2000
Row size:1500
average Time:106

col size:3000
Row size:2500
average Time:323

col size:4000
Row size:3500
average Time:717

col size:5000
Row size:4500
average Time:1545

col size:6000
Row size:5500
average Time:3325

col size:7000
Row size:6500
average Time:5264

col size:8000
Row size:7500
average Time:7912

col size:9000
Row size:8500
average Time:11293

col size:10000
Row size:9500
average Time:15070

::::::::COL MAJOR:::::::
col size:1000
Row size:500
average Time:62

col size:2000
Row size:1500
average Time:177

col size:3000
Row size:2500
average Time:541

col size:4000
Row size:3500
average Time:1228

col size:5000
Row size:4500
average Time:2259

col size:6000
Row size:5500
average Time:3508

col size:7000
Row size:6500
average Time:5277

col size:8000
Row size:7500
average Time:8063

col size:9000
Row size:8500
average Time:12410

col size:10000
Row size:9500
average Time:10137




*/