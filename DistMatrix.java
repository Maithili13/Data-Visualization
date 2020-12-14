
import java.util.ArrayList;
import java.io.IOException;
import java.io.File;
import java.util.List;
import java.util.Scanner;

class DistMatrix 
{ 
    public static void main(String[] args) throws IOException 
    {   
    	String S;
    	File file=new File("C:\\Users\\Maithili\\Desktop\\Viz Data\\0002.txt");
        Scanner sc=new Scanner(file);
        
        ArrayList<String> Xarr=new ArrayList<String>();//Creating arraylist  
        ArrayList<String> Yarr=new ArrayList<String>();//Creating arraylist  
        ArrayList<String> Zarr=new ArrayList<String>();//Creating arraylist
        
        
        	for (int i =0 ; sc.hasNextLine();i++) 
        		for (int j =0 ; sc.hasNextLine();i++)
        	{
        			S = sc.nextLine();
        			String [] X = S.split(" ");
            
        			String xcor = X[0];
        			String ycor = X[1];
        			String zcor = X[2];
            
              
        			Xarr.add(xcor);//Adding object in arraylist    
        			Yarr.add(ycor);//Adding object in arraylist  
            		Zarr.add(zcor);//Adding object in arraylist  
            
        	}
        	
            List<Double> Xval = new ArrayList<Double>() ;
            for (String myDouble : Xarr) 
            { 
              Xval.add(Double.valueOf(myDouble)); 
            }
            
            List<Double> Yval = new ArrayList<Double>() ;
            for (String myDouble : Yarr) 
            { 
              Yval.add(Double.valueOf(myDouble)); 
            }
          
            List<Double> Zval = new ArrayList<Double>() ;
            for (String myDouble : Zarr) 
            { 
              Zval.add(Double.valueOf(myDouble)); 
            }
           
            ArrayList<Double> Dist = new ArrayList<Double>() ;
            double[][] DistMat = new double[1000][1000];
            
            int maxindex = Xarr.size() - 1;
            
            for ( int i = 0; i < Xarr.size() - 1; i++)
            for ( int  j = 1; j < Yarr.size() ; j++)
            {
            		
            	if (i+j < maxindex)	
            		System.out.print( Math.sqrt((Math.pow((Xval.get(i) - Xval.get(i+j)),2)) + (Math.pow((Yval.get(i) - Yval.get(i+j)),2)) + (Math.pow((Zval.get(i) - Zval.get(i+j)),2)))+ ", ") ;
            	else
            	    {if (i+j > maxindex)	
            	    	{
            	    		System.out.println( Math.sqrt((Math.pow((Xval.get(i) - Xval.get(maxindex)),2)) + (Math.pow((Yval.get(i) - Yval.get(maxindex)),2)) + (Math.pow((Zval.get(i) - Zval.get(maxindex)),2)))+ ", ") ;
            	    		break;
            	    	}
            	    if (i == maxindex)
            	    	{
            	    		System.out.println( Math.sqrt((Math.pow((Xval.get(i) - Xval.get(maxindex)),2)) + (Math.pow((Yval.get(i) - Yval.get(maxindex)),2)) + (Math.pow((Zval.get(i) - Zval.get(maxindex)),2)))) ;
            	    		break;
            	    	}
            	    }
            }             		            	
    }    
}