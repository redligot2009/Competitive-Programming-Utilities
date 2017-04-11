import java.math.BigInteger;
static class FastReader
{
	BufferedReader br;
	StringTokenizer st;
	String line;
 
	public FastReader()
	{
		br = new BufferedReader(new InputStreamReader(System.in));
	}
 
	String next()
	{
		while (st == null || !st.hasMoreElements())
		{
			try
			{
				st = new StringTokenizer(br.readLine());
			}
			catch (IOException  e)
			{
				e.printStackTrace();
			}
		}
		return st.nextToken();
	}
 
	int nextInt()
	{
		return Integer.parseInt(next());
	}
 
	long nextLong()
	{
		return Long.parseLong(next());
	}
 
	double nextDouble()
	{
		return Double.parseDouble(next());
	}
  
	BigInteger nextBigInteger()
	{
		BigInteger retValue = new BigInteger(next());
		return retValue;
	}
 
	String nextLine()
	{
		String str = "";
		try
		{
			str = br.readLine();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		return str;
	}
        
	public boolean hasNext() throws Exception
	{
		if ( st == null || !st.hasMoreTokens() )
		{
			line = br.readLine();
			if ( line != null )
			{
				st = new StringTokenizer(line.trim());
				return hasNext();
			}
			else
			{
				return false;
			}
		}
		return true;
	}
}