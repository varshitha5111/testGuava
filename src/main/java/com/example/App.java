package com.example;

import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;
//import com.google.common.collect.ImmutableList;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//ImmutableList<String> list = ImmutableList.of("hello","world","hii");
        //System.out.println( list );
        File source = new File("source.txt");
        File dest = new File("dest.txt");
        try{
        	FileUtils.copyFile(source,dest);
  	        System.out.println("success");
        	
        }
        catch(IOException e){
        	System.out.println("error"+e);
        }
    }
}
