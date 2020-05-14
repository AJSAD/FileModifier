package FileModifier;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;

import Documents.InputFile;

public class FileModifier
{
	ArrayList< InputFile > files = new ArrayList< InputFile >();
	File file;
	
	public File getFile() 
	{
		return file;
	}

	public void setFile( File file ) 
	{
		this.file = file;
	}

	public ArrayList< InputFile > getFiles() 
	{
		return files;
	}

	public void setFiles( ArrayList< InputFile > files ) 
	{
		this.files = files;
	}

	boolean IsValidJSONFilePath( String inPath ) 
	{
		file = new File( inPath );
		 
        try 
        {   	
            if ( file != null && file.exists() ) 
            {
                String extension = file.getName().substring( file.getName().lastIndexOf( "." ) );
                if( !extension.toLowerCase().equals( ".json" ) ) 
                {
                	System.out.println( "Invalid file Type. JSON file Expected" );
                	return false;
                }   
            }
            else
            {
            	System.out.println( "File path does not exists" );
                return false;
            }
            
        } 
        catch ( Exception e ) 
        {
            System.out.println( "Fatal Error!!!... Invalid file Path" );
            return false;
        }
	
        return true;
	}
	
	public void FileModifierImpl() 
	{	
		Scanner sc = new Scanner( System.in );
		String path = sc.next();
		
		if( IsValidJSONFilePath( path ) ) 
		{
			System.out.println( "TO BE CONTINUED" );
			//TODO
		}
	}
}
