import java.util.*;
import java.lang.*;
import java.io.*;

class Hello 
{
	public static void main (String[] args)throws IOException 
	{
	    InputStreamReader g=new InputStreamReader(System.in);
	    BufferedReader br=new BufferedReader(g);
		
		int n=Integer.parseInt(br.readLine());
		while(n-- >0)
		{
		    int size=Integer.parseInt(br.readLine());
		    String st[]=br.readLine().trim().split(" ");
		    StringBuffer str1=new StringBuffer();
		    StringBuffer str2=new StringBuffer();
		    StringBuffer str3=new StringBuffer();
		    
		    for(int i=0;i<st.length;i++)
		    {
		       
		        if(st[i].equals("0"))
		        {
		            str1.append(0+" ");
		        }
		        else if(st[i].equals("1"))
		        {
		            str2.append(1+" ");
		        }
		        else
		        {
		            str3.append(2+" ");
		        }
		    }
		    System.out.println(str1+""+str2+""+str3);
		}
	}
}






