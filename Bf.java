// programme for bufferreader class for taking the input through keyboard
import java.io.*;
import java.util.*;
class Bf
{
   public static void main(String[] args)throws IOException
   {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int a,b,c;
		//a=Integer.parseInt(br.readLine());
		//b=Integer.parseInt(br.readLine());
		a=br.nextInt();
		b=br.nextInt();
		c=a+b;
		System.out.println("output is :"+c);
		
   }
}