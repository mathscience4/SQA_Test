package BlackBox_Tesing;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

import function.ConnectWeb;

public class ConnectWebTest {

	@Test
	public void test_1() {
		String test = "-----------------------------------------------------------------------------------------------\r\n" +
					  "相關連結網址:\r\n" +
					  "思考型-觀察者 : http://www2.hkedcity.net/sch_files/a/lkc/lkc-tyl/public_html/read/part5.htm\r\n" +
					  "思考型-忠誠者 : http://www2.hkedcity.net/sch_files/a/lkc/lkc-tyl/public_html/read/part6.htm\r\n" +
					  "思考型-享樂者 : http://www2.hkedcity.net/sch_files/a/lkc/lkc-tyl/public_html/read/part7.htm\r\n" +
					  "華人心理治療基金會 : https://www.tip.org.tw/therapyonline\r\n" +
					  "張老師基金會(線上輔導) : http://www.1980.org.tw/web3-20101110/main.php?customerid=3\r\n" +
					  "心理分析相關書籍 : https://www.kingstone.com.tw/book/book_class.asp?class_id=CBC\r\n" +
					  "-----------------------------------------------------------------------------------------------\r\n";
		ByteArrayOutputStream stream =  new ByteArrayOutputStream();
		PrintStream printstream = new PrintStream(stream);
		System.setOut(printstream);
		
		ConnectWeb t = new ConnectWeb();
		t.sendWeb(1);
		assertEquals(test, stream.toString());
	}
	
	@Test
	public void test_2() {
		String test = "-----------------------------------------------------------------------------------------------\r\n" +
					  "相關連結網址:\r\n" +
					  "感情型-助人者 : http://www2.hkedcity.net/sch_files/a/lkc/lkc-tyl/public_html/read/part2.htm\r\n" +
					  "感情型-成就者 : http://www2.hkedcity.net/sch_files/a/lkc/lkc-tyl/public_html/read/part3.htm\r\n" +
					  "感情型-浪漫型 : http://www2.hkedcity.net/sch_files/a/lkc/lkc-tyl/public_html/read/part4.htm\r\n" +
					  "華人心理治療基金會 : https://www.tip.org.tw/therapyonline\r\n" +
					  "張老師基金會(線上輔導) : http://www.1980.org.tw/web3-20101110/main.php?customerid=3\r\n" +
					  "心理分析相關書籍 : https://www.kingstone.com.tw/book/book_class.asp?class_id=CBC\r\n" +
					  "-----------------------------------------------------------------------------------------------\r\n";
		ByteArrayOutputStream stream =  new ByteArrayOutputStream();
		PrintStream printstream = new PrintStream(stream);
		System.setOut(printstream);
		
		ConnectWeb t = new ConnectWeb();
		t.sendWeb(2);
		assertEquals(test, stream.toString());
	}

	@Test
	public void test_3() {
		String test = "-----------------------------------------------------------------------------------------------\r\n" +
					  "相關連結網址:\r\n" +
					  "行動型-挑戰者 : http://www2.hkedcity.net/sch_files/a/lkc/lkc-tyl/public_html/read/part8.htm\r\n" +
					  "行動型-和平者 : http://www2.hkedcity.net/sch_files/a/lkc/lkc-tyl/public_html/read/part9.htm\r\n" +
					  "行動型-改革者 : http://www2.hkedcity.net/sch_files/a/lkc/lkc-tyl/public_html/read/part1.htm\r\n" +
					  "華人心理治療基金會 : https://www.tip.org.tw/therapyonline\r\n" +
					  "張老師基金會(線上輔導) : http://www.1980.org.tw/web3-20101110/main.php?customerid=3\r\n" +
					  "心理分析相關書籍 : https://www.kingstone.com.tw/book/book_class.asp?class_id=CBC\r\n" +
					  "-----------------------------------------------------------------------------------------------\r\n";
		ByteArrayOutputStream stream =  new ByteArrayOutputStream();
		PrintStream printstream = new PrintStream(stream);
		System.setOut(printstream);
		
		ConnectWeb t = new ConnectWeb();
		t.sendWeb(3);
		assertEquals(test, stream.toString());
	}
	
	@Test
	public void test_4() {
		String test = "-----------------------------------------------------------------------------------------------\r\n" +
					  "相關連結網址:\r\n" +
					  "思考型-觀察者 : http://www2.hkedcity.net/sch_files/a/lkc/lkc-tyl/public_html/read/part5.htm\r\n" +
					  "思考型-忠誠者 : http://www2.hkedcity.net/sch_files/a/lkc/lkc-tyl/public_html/read/part6.htm\r\n" +
					  "思考型-享樂者 : http://www2.hkedcity.net/sch_files/a/lkc/lkc-tyl/public_html/read/part7.htm\r\n" +
					  "感情型-助人者 : http://www2.hkedcity.net/sch_files/a/lkc/lkc-tyl/public_html/read/part2.htm\r\n" +
					  "感情型-成就者 : http://www2.hkedcity.net/sch_files/a/lkc/lkc-tyl/public_html/read/part3.htm\r\n" +
					  "感情型-浪漫型 : http://www2.hkedcity.net/sch_files/a/lkc/lkc-tyl/public_html/read/part4.htm\r\n" +
					  "華人心理治療基金會 : https://www.tip.org.tw/therapyonline\r\n" +
					  "張老師基金會(線上輔導) : http://www.1980.org.tw/web3-20101110/main.php?customerid=3\r\n" +
					  "心理分析相關書籍 : https://www.kingstone.com.tw/book/book_class.asp?class_id=CBC\r\n" +
					  "-----------------------------------------------------------------------------------------------\r\n";
		ByteArrayOutputStream stream =  new ByteArrayOutputStream();
		PrintStream printstream = new PrintStream(stream);
		System.setOut(printstream);
		
		ConnectWeb t = new ConnectWeb();
		t.sendWeb(4);
		assertEquals(test, stream.toString());
	}
	
	@Test
	public void test_5() {
		String test = "-----------------------------------------------------------------------------------------------\r\n" +
					  "相關連結網址:\r\n" +
					  "思考型-觀察者 : http://www2.hkedcity.net/sch_files/a/lkc/lkc-tyl/public_html/read/part5.htm\r\n" +
					  "思考型-忠誠者 : http://www2.hkedcity.net/sch_files/a/lkc/lkc-tyl/public_html/read/part6.htm\r\n" +
					  "思考型-忠誠者 : http://www2.hkedcity.net/sch_files/a/lkc/lkc-tyl/public_html/read/part6.htm\r\n" +
					  "行動型-挑戰者 : http://www2.hkedcity.net/sch_files/a/lkc/lkc-tyl/public_html/read/part8.htm\r\n" +
					  "行動型-和平者 : http://www2.hkedcity.net/sch_files/a/lkc/lkc-tyl/public_html/read/part9.htm\r\n" +
					  "行動型-改革者 : http://www2.hkedcity.net/sch_files/a/lkc/lkc-tyl/public_html/read/part1.htm\r\n" +
					  "華人心理治療基金會 : https://www.tip.org.tw/therapyonline\r\n" +
					  "張老師基金會(線上輔導) : http://www.1980.org.tw/web3-20101110/main.php?customerid=3\r\n" +
					  "心理分析相關書籍 : https://www.kingstone.com.tw/book/book_class.asp?class_id=CBC\r\n" +
					  "-----------------------------------------------------------------------------------------------\r\n";
		ByteArrayOutputStream stream =  new ByteArrayOutputStream();
		PrintStream printstream = new PrintStream(stream);
		System.setOut(printstream);
		
		ConnectWeb t = new ConnectWeb();
		t.sendWeb(5);
		assertEquals(test, stream.toString());
	}
	
	@Test
	public void test_6() {
		String test = "-----------------------------------------------------------------------------------------------\r\n" +
					  "相關連結網址:\r\n" +
					  "感情型-助人者 : http://www2.hkedcity.net/sch_files/a/lkc/lkc-tyl/public_html/read/part2.htm\r\n" +
					  "感情型-成就者 : http://www2.hkedcity.net/sch_files/a/lkc/lkc-tyl/public_html/read/part3.htm\r\n" +
					  "感情型-浪漫型 : http://www2.hkedcity.net/sch_files/a/lkc/lkc-tyl/public_html/read/part4.htm\r\n" +
					  "行動型-挑戰者 : http://www2.hkedcity.net/sch_files/a/lkc/lkc-tyl/public_html/read/part8.htm\r\n" +
					  "行動型-和平者 : http://www2.hkedcity.net/sch_files/a/lkc/lkc-tyl/public_html/read/part9.htm\r\n" +
					  "行動型-改革者 : http://www2.hkedcity.net/sch_files/a/lkc/lkc-tyl/public_html/read/part1.htm\r\n" +
					  "華人心理治療基金會 : https://www.tip.org.tw/therapyonline\r\n" +
					  "張老師基金會(線上輔導) : http://www.1980.org.tw/web3-20101110/main.php?customerid=3\r\n" +
					  "心理分析相關書籍 : https://www.kingstone.com.tw/book/book_class.asp?class_id=CBC\r\n" +
					  "-----------------------------------------------------------------------------------------------\r\n";
		ByteArrayOutputStream stream =  new ByteArrayOutputStream();
		PrintStream printstream = new PrintStream(stream);
		System.setOut(printstream);
		
		ConnectWeb t = new ConnectWeb();
		t.sendWeb(6);
		assertEquals(test, stream.toString());
	}
	
	@Test
	public void test_7() {
		String test = "-----------------------------------------------------------------------------------------------\r\n" +
					  "相關連結網址:\r\n" +
					  "思考型-觀察者 : http://www2.hkedcity.net/sch_files/a/lkc/lkc-tyl/public_html/read/part5.htm\r\n" +
					  "思考型-忠誠者 : http://www2.hkedcity.net/sch_files/a/lkc/lkc-tyl/public_html/read/part6.htm\r\n" +
					  "思考型-享樂者 : http://www2.hkedcity.net/sch_files/a/lkc/lkc-tyl/public_html/read/part7.htm\r\n" +
					  "感情型-助人者 : http://www2.hkedcity.net/sch_files/a/lkc/lkc-tyl/public_html/read/part2.htm\r\n" +
					  "感情型-成就者 : http://www2.hkedcity.net/sch_files/a/lkc/lkc-tyl/public_html/read/part3.htm\r\n" +
					  "感情型-浪漫型 : http://www2.hkedcity.net/sch_files/a/lkc/lkc-tyl/public_html/read/part4.htm\r\n" +
					  "行動型-挑戰者 : http://www2.hkedcity.net/sch_files/a/lkc/lkc-tyl/public_html/read/part8.htm\r\n" +
					  "行動型-和平者 : http://www2.hkedcity.net/sch_files/a/lkc/lkc-tyl/public_html/read/part9.htm\r\n" +
					  "行動型-改革者 : http://www2.hkedcity.net/sch_files/a/lkc/lkc-tyl/public_html/read/part1.htm\r\n" +
					  "華人心理治療基金會 : https://www.tip.org.tw/therapyonline\r\n" +
					  "張老師基金會(線上輔導) : http://www.1980.org.tw/web3-20101110/main.php?customerid=3\r\n" +
					  "心理分析相關書籍 : https://www.kingstone.com.tw/book/book_class.asp?class_id=CBC\r\n" +
					  "-----------------------------------------------------------------------------------------------\r\n";
		ByteArrayOutputStream stream =  new ByteArrayOutputStream();
		PrintStream printstream = new PrintStream(stream);
		System.setOut(printstream);
		
		ConnectWeb t = new ConnectWeb();
		t.sendWeb(7);
		assertEquals(test, stream.toString());
	}
	
	@Test
	public void test_10() {
		String test = "-----------------------------------------------------------------------------------------------\r\n" +
					  "相關連結網址:\r\n" +
					  "思考型-觀察者 : http://www2.hkedcity.net/sch_files/a/lkc/lkc-tyl/public_html/read/part5.htm\r\n" +
					  "思考型-忠誠者 : http://www2.hkedcity.net/sch_files/a/lkc/lkc-tyl/public_html/read/part6.htm\r\n" +
					  "思考型-享樂者 : http://www2.hkedcity.net/sch_files/a/lkc/lkc-tyl/public_html/read/part7.htm\r\n" +
					  "感情型-助人者 : http://www2.hkedcity.net/sch_files/a/lkc/lkc-tyl/public_html/read/part2.htm\r\n" +
					  "感情型-成就者 : http://www2.hkedcity.net/sch_files/a/lkc/lkc-tyl/public_html/read/part3.htm\r\n" +
					  "感情型-浪漫型 : http://www2.hkedcity.net/sch_files/a/lkc/lkc-tyl/public_html/read/part4.htm\r\n" +
					  "行動型-挑戰者 : http://www2.hkedcity.net/sch_files/a/lkc/lkc-tyl/public_html/read/part8.htm\r\n" +
					  "行動型-和平者 : http://www2.hkedcity.net/sch_files/a/lkc/lkc-tyl/public_html/read/part9.htm\r\n" +
					  "行動型-改革者 : http://www2.hkedcity.net/sch_files/a/lkc/lkc-tyl/public_html/read/part1.htm\r\n" +
					  "華人心理治療基金會 : https://www.tip.org.tw/therapyonline\r\n" +
					  "張老師基金會(線上輔導) : http://www.1980.org.tw/web3-20101110/main.php?customerid=3\r\n" +
					  "心理分析相關書籍 : https://www.kingstone.com.tw/book/book_class.asp?class_id=CBC\r\n" +
					  "-----------------------------------------------------------------------------------------------\r\n";
		ByteArrayOutputStream stream =  new ByteArrayOutputStream();
		PrintStream printstream = new PrintStream(stream);
		System.setOut(printstream);
		
		ConnectWeb t = new ConnectWeb();
		t.sendWeb(10);
		assertEquals(test, stream.toString());
	}
	
	@Test
	public void test_0() {
		String test = "-----------------------------------------------------------------------------------------------\r\n" +
					  "相關連結網址:\r\n" +
					  "思考型-觀察者 : http://www2.hkedcity.net/sch_files/a/lkc/lkc-tyl/public_html/read/part5.htm\r\n" +
					  "思考型-忠誠者 : http://www2.hkedcity.net/sch_files/a/lkc/lkc-tyl/public_html/read/part6.htm\r\n" +
					  "思考型-享樂者 : http://www2.hkedcity.net/sch_files/a/lkc/lkc-tyl/public_html/read/part7.htm\r\n" +
					  "感情型-助人者 : http://www2.hkedcity.net/sch_files/a/lkc/lkc-tyl/public_html/read/part2.htm\r\n" +
					  "感情型-成就者 : http://www2.hkedcity.net/sch_files/a/lkc/lkc-tyl/public_html/read/part3.htm\r\n" +
					  "感情型-浪漫型 : http://www2.hkedcity.net/sch_files/a/lkc/lkc-tyl/public_html/read/part4.htm\r\n" +
					  "行動型-挑戰者 : http://www2.hkedcity.net/sch_files/a/lkc/lkc-tyl/public_html/read/part8.htm\r\n" +
					  "行動型-和平者 : http://www2.hkedcity.net/sch_files/a/lkc/lkc-tyl/public_html/read/part9.htm\r\n" +
					  "行動型-改革者 : http://www2.hkedcity.net/sch_files/a/lkc/lkc-tyl/public_html/read/part1.htm\r\n" +
					  "華人心理治療基金會 : https://www.tip.org.tw/therapyonline\r\n" +
					  "張老師基金會(線上輔導) : http://www.1980.org.tw/web3-20101110/main.php?customerid=3\r\n" +
					  "心理分析相關書籍 : https://www.kingstone.com.tw/book/book_class.asp?class_id=CBC\r\n" +
					  "-----------------------------------------------------------------------------------------------\r\n";
		ByteArrayOutputStream stream =  new ByteArrayOutputStream();
		PrintStream printstream = new PrintStream(stream);
		System.setOut(printstream);
		
		ConnectWeb t = new ConnectWeb();
		t.sendWeb(0);
		assertEquals(test, stream.toString());
	}
	
}
