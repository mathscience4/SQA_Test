package BlackBox_Tesing;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.PrintWriter;
import org.junit.Test;

import function.ForumSetting;


public class ForumSettingTest {

	@Test
	public void test() {
		
		String input = "0";
	    InputStream in = new ByteArrayInputStream(input.getBytes());
	    System.setIn(in);
	    
	    PrintWriter textOutput = null;
    	try {
			
			textOutput = new PrintWriter(new FileOutputStream("DataBase_Test.txt"));
			textOutput.close();
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
	    
		ForumSetting FS = new ForumSetting();
	}
	
	@Test
	public void test1() {
		
		String input = "0";
	
	    InputStream in = new ByteArrayInputStream(input.getBytes());
	    System.setIn(in);
		
	    File file = new File("DataBase_Test.txt");
	    file.delete();
	    
		ForumSetting FS = new ForumSetting();
	}
	
	@Test
	public void test2() {
		
		String input = "1\n\n123132\n";
	    InputStream in = new ByteArrayInputStream(input.getBytes());
	    System.setIn(in);
	    
		ForumSetting FS = new ForumSetting();
	}
	
	@Test
	public void test3() {
		
		String input = "1\nanonymous\n123132\n";
	    InputStream in = new ByteArrayInputStream(input.getBytes());
	    System.setIn(in);
	    
		ForumSetting FS = new ForumSetting();
	}
	
	@Test
	public void test4() {
		
		String input = "0";
	    InputStream in = new ByteArrayInputStream(input.getBytes());
	    System.setIn(in);
		ForumSetting FS = new ForumSetting();
		
		input = "N";
	    in = new ByteArrayInputStream(input.getBytes());
	    System.setIn(in);
	    FS.checkHistory("DataBase.txt");
		
	}
	
	@Test
	public void test5() {
		
		String input = "1\n1\n123132\n";
	    InputStream in = new ByteArrayInputStream(input.getBytes());
	    System.setIn(in);
		ForumSetting FS = new ForumSetting("DataBase.txt");
		
		input = "Y\n1\n2\ntestreward\n";
	    in = new ByteArrayInputStream(input.getBytes());
	    System.setIn(in);
	    FS.checkHistory("DataBase.txt");
		
	}
	
	@Test
	public void test7() {
		
		String input = "0";
	    InputStream in = new ByteArrayInputStream(input.getBytes());
	    System.setIn(in);
		ForumSetting FS = new ForumSetting("DataBase.txt");
		
		input = "y\nanonymous\n";
	    in = new ByteArrayInputStream(input.getBytes());
	    System.setIn(in);
	    FS.checkHistory("DataBase.txt");
	}
	
	@Test
	public void test8() {
		
		String input = "1\n\n123132"+"\n";
	    InputStream in = new ByteArrayInputStream(input.getBytes());
	    System.setIn(in);
		ForumSetting FS = new ForumSetting("DataBase.txt");
		
		input = "y\n1\n\nfdfjsdkfj\n";
	    in = new ByteArrayInputStream(input.getBytes());
	    System.setIn(in);
	    FS.checkHistory("DataBase.txt");
	}
	
	@Test
	public void test9() {
		
		String input = "1\nanonymous\n123132"+ "\n";
	    InputStream in = new ByteArrayInputStream(input.getBytes());
	    System.setIn(in);
		ForumSetting FS = new ForumSetting("DataBase.txt");
		
		input = "y\n1\nanonymous\nfdfjsdkfj\n";
	    in = new ByteArrayInputStream(input.getBytes());
	    System.setIn(in);
	    FS.checkHistory("DataBase.txt");
	}
	
	@Test
	public void test10() {
		
		String input = "1\nanonymous\n123132"+ "\n";
	    InputStream in = new ByteArrayInputStream(input.getBytes());
	    System.setIn(in);
		ForumSetting FS = new ForumSetting("DataBase.txt");
		
		input = "E\nn\n";
	    in = new ByteArrayInputStream(input.getBytes());
	    System.setIn(in);
	    FS.checkHistory("DataBase.txt");
	}
}
