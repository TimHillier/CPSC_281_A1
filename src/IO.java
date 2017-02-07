
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;


public class IO {
	
	private static String LOCATION = "";
	
	public static void setlocation(String loc)
	{
		LOCATION = loc;
		
	}
	public static String getlocation()
	{
		return LOCATION;
	}



	//write values to file
	/**
	 * 
	 * @param filename name of file to write to
	 * @param input what to write in this case a String
	 */
	public static void write(String filename,String input)
	{
		try
		{

			
		//Real location should be the dir that gets created
		String FileLocation =getlocation();
		File file = new File(FileLocation+"/"+filename+".csv"); 
		
		//Check to see if file exists. 
		//else create it. 
		if(!file.exists())
		{
			file.createNewFile(); 
		}
		//hopefully this wont rewrite it when it writes again
		FileWriter fw = new FileWriter(file.getAbsoluteFile(), true); 
		BufferedWriter bw = new BufferedWriter(fw); 
		bw.write(input.toString()+",");
		bw.close();
		fw.close();
		
		
		}
		catch(IOException e)
		{
			e.printStackTrace(); 
		}
		
	}
	
	
	
	/**
	 * 
	 * @param filename Name of the file to write to
	 * @param input what to write, in this case an INT
	 */
	public static void write(String filename,int input)
	{
		try
		{
			
		//Real location should be the dir that gets created
		String FileLocation =getlocation();
		//File file = new File(System.getProperty("user.home"), "poop"); 
		File file = new File(FileLocation+"/"+filename+".csv"); 
		
		//Check to see if file exists. 
		//else create it. 
		if(!file.exists())
		{
			file.createNewFile(); 
		}
		//hopefully this wont rewrite it when it writes again
		FileWriter fw = new FileWriter(file.getAbsoluteFile(), true); 
		BufferedWriter bw = new BufferedWriter(fw); 
		bw.write(String.valueOf(input)+",");
		bw.newLine();
		bw.close();
		fw.close();
		
		
		}
		catch(IOException e)
		{
			e.printStackTrace(); 
		}
		
	}
	/**
	 * 
	 * @param filename Name of file to write to
	 * @param input input taken as a long
	 */
	public static void write(String filename,long input)
	{
		try
		{
			
		//Real location should be the dir that gets created
		String FileLocation =getlocation();
		//File file = new File(System.getProperty("user.home"), "poop"); 
		File file = new File(FileLocation+"/"+filename+".csv"); 
		
		//Check to see if file exists. 
		//else create it. 
		if(!file.exists())
		{
			file.createNewFile(); 
		}
		//hopefully this wont rewrite it when it writes again
		FileWriter fw = new FileWriter(file.getAbsoluteFile(), true); 
		BufferedWriter bw = new BufferedWriter(fw); 
		bw.write(String.valueOf(input)+",");
		bw.newLine();
		bw.close();
		fw.close();
		
		
		}
		catch(IOException e)
		{
			e.printStackTrace(); 
		}
		
	}
	
	
	
	
	
	
	
	
	
	
}
