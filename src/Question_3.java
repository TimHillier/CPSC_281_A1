import java.util.Arrays;
import java.util.Random;
//using Arrays to make it easier to see the array. 



/* output on a 4x4 array that has 3 values. 
origin[[0, 0, 0, 0], [0, 46, 0, 0], [0, 0, 0, 25], [0, 0, 0, 33]]
tempA[[1, 1, 46], [2, 3, 25], [3, 3, 33], [0, 0, 0]]
tempB[[0, 0, 0], [1, 1, 46], [3, 2, 25], [3, 3, 33]]
Complete[[0, 0, 0, 0], [0, 46, 0, 0], [0, 0, 0, 0], [0, 0, 25, 33]]
 */









public class Question_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] Test = createSparse(10000,10000); 
		
		
		System.out.println("origin"+Arrays.deepToString(Test));
		transpose(4,4,Test); 
		//System.out.println(Arrays.deepToString(ayyyy)); 

		
		
		
		
		
		
		
	}
	
	/**
	 * Create a nonsquare sparse matrix of a desired size
	 * @param size
	 */
	public static int[][] createSparse(int x,int y)
	{
		
		//Fill 1% of the array with numbers. 
		Random rando = new Random(); 
		//generate 1% random numbers
		int fullSize = x*y; 
		int onePercent = (int) (fullSize*.01)+3; 
		//debug
		System.out.println("1%"+onePercent); 
		int[] sparce = new int[onePercent];  
		//fill sparce with distance
		for(int i =0; i<sparce.length;i++)
		{
			
			sparce[i]=rando.nextInt(fullSize/onePercent)+1; 
			//System.out.println("Sparce"+sparce[i]);
		}
		
 
		//initialize new array
		int [][] sparceArray = new int[x][y]; 
		int a =0; 
		int b =0; 
	
		for(int i =0; i<x;i++)
		{
			for(int j=0; j<y;j++)
			{
				if(b < sparce.length && a == sparce[b])
				{
					//fill array with random numbers at weird distances. 
					sparceArray[i][j] = rando.nextInt(50)+1; 
					//System.out.println("haha"+sparceArray[i][j]);
					a=0; 
					b++; 
				}
				else
				{
					//fill the rest of it with zeros
					sparceArray[i][j] = 0; 
					a++; 
				}
				 
				
			}
		}
		return sparceArray; 
		
		
	}
	
	public static void transpose(int x,int y,int[][] arr)
	{
		int[][] tempA = new int[x][3]; 
		//TempA cols = Row, col, val; 
		 
	
		//get values, and location. Store them in a temp array 
		int a = 0; 
		for(int i =0; i<x;i++)
		{
			for(int j=0; j<y; j++)
			{
				if(arr[i][j] != 0)
				{
					
					tempA[a][0]=i;
					tempA[a][1]=j;
					tempA[a][2]=arr[i][j];
					a++;
					
				}
				
			}
		}
		System.out.println("tempA"+Arrays.deepToString(tempA));

		//second temp matrix
		int[][] tempB = new int[x][3];  
		int j =1; 
		int[][] Complete = new int[x][y];
		for(int i=0; i<a;i++)
		{
			
			tempB[j][0] = tempA[i][1];  //B rows = A colms
			tempB[j][1] = tempA[i][0];  //B colms = A rows
			tempB[j][2] = tempA[i][2];            //B vals = A vals
			Complete[tempB[j][0]][tempB[j][1]]=tempB[j][2]; 
			j++;
			
			
			
		}
		//put them back into an array
		

		
		
		
		System.out.println("tempB"+Arrays.deepToString(tempB));
		System.out.println("Complete"+Arrays.deepToString(Complete));

		
		
		
	}
	
	

}
