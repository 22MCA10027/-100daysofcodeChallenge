import java.io.*;

class FileExample
{
	public static void main(String[] args)
		throws IOException
	{
		int i;
		FileOutputStream fout = new FileOutputStream("testout.txt",true);
	
		String st = "TATA";

		char ch[] = st.toCharArray();
		for (i = 0; i < st.length(); i++) 
        {
		
			fout.write(ch[i]);
		}
	
		fout.close();
	}
}
