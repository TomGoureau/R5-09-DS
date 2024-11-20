public class Q3
{
	public static void main(String[] arg)
	{
    String s="";
    int cpt=0;
		while (cpt < Integer.parseInt(arg[0]) )
		{
			s+= '*';
		
			cpt++ ;
		}
		System.out.println( s );
	}
}
