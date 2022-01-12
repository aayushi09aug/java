/******************************/
/*       Star Patterns       */
/******************************/

import java.util.*;
public class Main 
{
	public static void main(String[] args) 
	{
	    
	    StarPattern oStarPattern = new StarPattern();
	    System.out.print("Enter the dimension : ");
	    Scanner sc =new Scanner(System.in);
	    int n=sc.nextInt();
	    oStarPattern.rightTriangle(n);
	    System.out.print("\n");
	    oStarPattern.rightMirrorTriangle(n);
	    System.out.print("\n");
	    oStarPattern.rightInverseTriangle(n);
	    System.out.print("\n");
	    oStarPattern.rightInverseMirrorTriangle(n);
	    System.out.print("\n");
	    oStarPattern.diamondPattern(n);
	    System.out.print("\n");
	    oStarPattern.innerDiamondPattern(n);
	}
}

class StarPattern 
{
	public void rightTriangle(int n) 
	{
	   for(int i = 0; i < n; i++)
	   {
	        for(int j = 0; j <= i; j++)
	        {
	            System.out.print("*");
	        }
	        System.out.print("\n");
	   }
	}
	   
	
	public void rightMirrorTriangle(int n) 
	{
	    for(int i = 1; i <= n; i++)
	    {
	        for(int j = 1; j <= n-i; j++)
	        {
	            System.out.print(" "); 
	        }
	        for(int j = 1; j <= i; j++)
	        {
	            System.out.print("*");
	        }
	        System.out.print("\n");
	    }
	    
	}
	
	public void rightInverseTriangle(int n) 
	{
	    for(int i = 1; i <=n; i++)
	    {
	        for(int j = i; j <=n; j++)
	        {
	            System.out.print("*");
	        }
	        System.out.print("\n");
	    }
	}
	
	public void rightInverseMirrorTriangle(int n) 
	{
	    for(int i = 1; i <= n; i++)
	    {
	        for(int j = 1; j <= (i-1); j++)
	        {
	           System.out.print(" "); 
	        }
	        for(int j = i; j <= n; j++)
	        {
	           System.out.print("*"); 
	        }
	        System.out.print("\n");
	    }
	    
	}
	
	public void diamondPattern(int n) 
	{
	    for(int i=1; i<=n; i++)
	    {
	        for(int j=i; j<n; j++)
	        {
	            System.out.print(" ");
	        }
	        for(int j=n-i; j<n; j++)
	        {
	            System.out.print("*");
	        }
	        for(int j=1; j<=i-1; j++)
	        {
	            System.out.print("*");
	            
	        }
	        System.out.print("\n");
	        
	    }
	    for(int i=1; i<=n; i++)
	    {
	        for(int j=1 ; j<=i ; j++)
	        {
	           System.out.print(" ");
	        }
	        for(int j=i ; j<n ; j++)
	        {
	           System.out.print("*");
	        }
	        for(int j=i ; j<n-1 ; j++)
	        {
	           System.out.print("*");
	        }
	        System.out.print("\n");
	    }
	}	
	
	public void innerDiamondPattern(int n) 
	{
	    for(int i = 1; i <= n; i++)
	    {
	        for(int j=i; j <=n; j++)
	        {
	            System.out.print("*");
	            
	        }
	        for(int j=1; j < i; j++)
	        {
	            System.out.print(" ");
	        }
	        for(int j=1; j <i ; j++)
	        {
	            System.out.print(" ");
	        }
	        for(int j=i; j <=n ; j++)
	        {
	            System.out.print("*");
	        }
	    System.out.print("\n");
	    }
	    
	   for(int i = 1; i<=n; i++)
	   {
	       for(int j = 1; j <=i; j++)
	       {
	           System.out.print("*");
	       }
	       for(int j = i; j <n; j++)
	       {
	           System.out.print(" ");
	       }
	       for(int j = i; j <n; j++)
	       {
	           System.out.print(" ");
	       }
	       for(int j = 1; j <=i; j++)
	       {
	           System.out.print("*");
	       }
	    System.out.print("\n");
	   }
	    
	}    
}
