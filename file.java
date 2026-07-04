import java.io.*;
class file
{

	public static void main(String[] args)
	{


		File f = new File("C:\\Users\\ASUS\\Desktop\\javaprogram\\avdhoot.txt");

		try
		{
			if(f.createNewFile())
			{

				System.out.printf("\n\t FILE CREATED SUCCESSFULLY!");

			}

			else
			{
				System.out.printf("\n\t FILE ALREADY EXISTS");
			}
		}
		catch(IOException i)
		{

			System.out.println(i);
		}

	}

}
			