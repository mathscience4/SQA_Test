package BlackBox_Tesing;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import function.AnalyzeData;

public class AnalyzeDataTest {
	
	AnalyzeData test;
	private String[] questionFirst;
	private String[] questionSecond;
	private double[][] personalAnswer;
	
	/* 設定 */
	@Before
	public void before() {
		test = new AnalyzeData();
		questionFirst = new String[18];
		questionSecond = new String[2];
		personalAnswer = new double[10][5];
	}
	@After
	public void after() {
		test = null;
		questionFirst = null;
		questionSecond = null;
		personalAnswer = null;
	}
	/* 測試基本資料(血型的影響，第2.6型增加) */
	@Test
	public void test_basic_bloodtype1() {
		for(int i = 0; i < 9; i++) {
		//	this.personalAnswer[i][0] = 100;
			this.personalAnswer[i][1] = 100;
			this.personalAnswer[i][2] = 60;
			this.personalAnswer[i][3] = 100; 							
		}
		test.setPersonalAnswer(personalAnswer);
		
		String[] data = {"男", "水瓶座", "異性戀", "A"};
		double[] outcome;
		outcome = test.calculatingScore(data);
		assertEquals(90+10, outcome[2], 0.0);
		assertEquals(90+10, outcome[4], 0.0);
 	}
	/* 測試基本資料(血型的影響，第1.8型增加) */
	@Test
	public void test_basic_bloodtype2() {
		for(int i = 0; i < 9; i++) {
		//	this.personalAnswer[i][0] = 100;
			this.personalAnswer[i][1] = 100;
			this.personalAnswer[i][2] = 60;
			this.personalAnswer[i][3] = 100; 							
		}
		test.setPersonalAnswer(personalAnswer);
		
		String[] data = {"男", "水瓶座", "異性戀", "B"};
		double[] outcome;
		outcome = test.calculatingScore(data);
		assertEquals(90+10, outcome[1], 0.0);
		assertEquals(90+10, outcome[8], 0.0);
 	}
	/* 測試基本資料(血型的影響，第4.5.6.9型增加) */
	@Test
	public void test_basic_bloodtype3() {
		for(int i = 0; i < 9; i++) {
		//	this.personalAnswer[i][0] = 100;
			this.personalAnswer[i][1] = 100;
			this.personalAnswer[i][2] = 60;
			this.personalAnswer[i][3] = 100; 							
		}
		test.setPersonalAnswer(personalAnswer);
		
		String[] data = {"男", "水瓶座", "異性戀", "AB"};
		double[] outcome;
		outcome = test.calculatingScore(data);
		assertEquals(90+10, outcome[4], 0.0);
		assertEquals(90+10, outcome[5], 0.0);
		assertEquals(90+10, outcome[6], 0.0);
		assertEquals(90+10, outcome[0], 0.0);
 	}
	/* 測試基本資料(血型的影響，第3.7型增加) */
	@Test
	public void test_basic_bloodtype4() {
		for(int i = 0; i < 9; i++) {
		//	this.personalAnswer[i][0] = 100;
			this.personalAnswer[i][1] = 100;
			this.personalAnswer[i][2] = 60;
			this.personalAnswer[i][3] = 100; 							
		}
		test.setPersonalAnswer(personalAnswer);
		
		String[] data = {"男", "水瓶座", "異性戀", "O"};
		double[] outcome;
		outcome = test.calculatingScore(data);
		assertEquals(90+10, outcome[3], 0.0);
		assertEquals(90+10, outcome[7], 0.0);
 	}
	/* 測試基本資料(星座的影響，第1型增加) */
	@Test
	public void test_star_1() {
		for(int i = 0; i < 9; i++) {
			this.personalAnswer[i][0] = 100;
		//	this.personalAnswer[i][1] = 100;
			this.personalAnswer[i][2] = 60;
			this.personalAnswer[i][3] = 100; 							
		}
		test.setPersonalAnswer(personalAnswer);
		
		String[] data = {"男", "天蠍座", "異性戀", "O"};
	//	String[] data = {"男", "獅子座", "異性戀", "O"};
		double[] outcome;
		outcome = test.calculatingScore(data);
		assertEquals(80+20, outcome[1], 0.0);
 	}
	/* 測試基本資料(星座的影響，第1型增加) */
	@Test
	public void test_star_1_2() {
		for(int i = 0; i < 9; i++) {
			this.personalAnswer[i][0] = 100;
		//	this.personalAnswer[i][1] = 100;
			this.personalAnswer[i][2] = 60;
			this.personalAnswer[i][3] = 100; 							
		}
		test.setPersonalAnswer(personalAnswer);
		
	//	String[] data = {"男", "天蠍座", "異性戀", "O"};
		String[] data = {"男", "獅子座", "異性戀", "O"};
		double[] outcome;
		outcome = test.calculatingScore(data);
		assertEquals(80+20, outcome[1], 0.0);
 	}
	/* 測試基本資料(星座的影響，第2型增加) */
	@Test
	public void test_star_2() {
		for(int i = 0; i < 9; i++) {
			this.personalAnswer[i][0] = 100;
		//	this.personalAnswer[i][1] = 100;
			this.personalAnswer[i][2] = 60;
			this.personalAnswer[i][3] = 100; 							
		}
		test.setPersonalAnswer(personalAnswer);
		
		String[] data = {"男", "水瓶座", "異性戀", "O"};
	//	String[] data = {"男", "天秤座", "異性戀", "O"};
		double[] outcome;
		outcome = test.calculatingScore(data);
		assertEquals(80+20, outcome[2], 0.0);
 	}
	/* 測試基本資料(星座的影響，第2型增加) */
	@Test
	public void test_star_2_2() {
		for(int i = 0; i < 9; i++) {
			this.personalAnswer[i][0] = 100;
		//	this.personalAnswer[i][1] = 100;
			this.personalAnswer[i][2] = 60;
			this.personalAnswer[i][3] = 100; 							
		}
		test.setPersonalAnswer(personalAnswer);
		
	//	String[] data = {"男", "水瓶座", "異性戀", "O"};
		String[] data = {"男", "天秤座", "異性戀", "O"};
		double[] outcome;
		outcome = test.calculatingScore(data);
		assertEquals(80+20, outcome[2], 0.0);
 	}
	/* 測試基本資料(星座的影響，第3型增加) */
	@Test
	public void test_star_3() {
		for(int i = 0; i < 9; i++) {
			this.personalAnswer[i][0] = 100;
		//	this.personalAnswer[i][1] = 100;
			this.personalAnswer[i][2] = 60;
			this.personalAnswer[i][3] = 100; 							
		}
		test.setPersonalAnswer(personalAnswer);
		
		String[] data = {"男", "雙子座", "異性戀", "O"};
		double[] outcome;
		outcome = test.calculatingScore(data);
		assertEquals(80+20, outcome[3], 0.0);
 	}
	/* 測試基本資料(星座的影響，第4型增加) */
	@Test
	public void test_star_4() {
		for(int i = 0; i < 9; i++) {
			this.personalAnswer[i][0] = 100;
		//	this.personalAnswer[i][1] = 100;
			this.personalAnswer[i][2] = 60;
			this.personalAnswer[i][3] = 100; 							
		}
		test.setPersonalAnswer(personalAnswer);
		
		String[] data = {"男", "處女座", "異性戀", "O"};
		double[] outcome;
		outcome = test.calculatingScore(data);
		assertEquals(80+20, outcome[4], 0.0);
 	}
	/* 測試基本資料(星座的影響，第5型增加) */
	@Test
	public void test_star_5() {
		for(int i = 0; i < 9; i++) {
			this.personalAnswer[i][0] = 100;
		//	this.personalAnswer[i][1] = 100;
			this.personalAnswer[i][2] = 60;
			this.personalAnswer[i][3] = 100; 							
		}
		test.setPersonalAnswer(personalAnswer);
		
		String[] data = {"男", "摩羯座", "異性戀", "O"};
		double[] outcome;
		outcome = test.calculatingScore(data);
		assertEquals(80+20, outcome[5], 0.0);
 	}
	/* 測試基本資料(星座的影響，第6型增加) */
	@Test
	public void test_star_6() {
		for(int i = 0; i < 9; i++) {
			this.personalAnswer[i][0] = 100;
		//	this.personalAnswer[i][1] = 100;
			this.personalAnswer[i][2] = 60;
			this.personalAnswer[i][3] = 100; 							
		}
		test.setPersonalAnswer(personalAnswer);
		
		String[] data = {"男", "巨蟹座", "異性戀", "O"};
	//	String[] data = {"男", "雙魚座", "異性戀", "O"};
		double[] outcome;
		outcome = test.calculatingScore(data);
		assertEquals(80+20, outcome[6], 0.0);
 	}
	/* 測試基本資料(星座的影響，第6型增加) */
	@Test
	public void test_star_6_2() {
		for(int i = 0; i < 9; i++) {
			this.personalAnswer[i][0] = 100;
		//	this.personalAnswer[i][1] = 100;
			this.personalAnswer[i][2] = 60;
			this.personalAnswer[i][3] = 100; 							
		}
		test.setPersonalAnswer(personalAnswer);
		
	//	String[] data = {"男", "巨蟹座", "異性戀", "O"};
		String[] data = {"男", "雙魚座", "異性戀", "O"};
		double[] outcome;
		outcome = test.calculatingScore(data);
		assertEquals(80+20, outcome[6], 0.0);
 	}
	/* 測試基本資料(星座的影響，第7型增加) */
	@Test
	public void test_star_7() {
		for(int i = 0; i < 9; i++) {
			this.personalAnswer[i][0] = 100;
		//	this.personalAnswer[i][1] = 100;
			this.personalAnswer[i][2] = 60;
			this.personalAnswer[i][3] = 100; 							
		}
		test.setPersonalAnswer(personalAnswer);
		
		String[] data = {"男", "牡羊座", "異性戀", "O"};
		double[] outcome;
		outcome = test.calculatingScore(data);
		assertEquals(80+20, outcome[7], 0.0);
 	}
	/* 測試基本資料(星座的影響，第8型增加) */
	@Test
	public void test_star_8() {
		for(int i = 0; i < 9; i++) {
			this.personalAnswer[i][0] = 100;
		//	this.personalAnswer[i][1] = 100;
			this.personalAnswer[i][2] = 60;
			this.personalAnswer[i][3] = 100; 							
		}
		test.setPersonalAnswer(personalAnswer);
		
		String[] data = {"男", "金牛座", "異性戀", "O"};
		double[] outcome;
		outcome = test.calculatingScore(data);
		assertEquals(80+20, outcome[8], 0.0);
 	}
	/* 測試基本資料(星座的影響，第9型增加) */
	@Test
	public void test_star_9() {
		for(int i = 0; i < 9; i++) {
			this.personalAnswer[i][0] = 100;
		//	this.personalAnswer[i][1] = 100;
			this.personalAnswer[i][2] = 60;
			this.personalAnswer[i][3] = 100; 							
		}
		test.setPersonalAnswer(personalAnswer);
		
		String[] data = {"男", "射手座", "異性戀", "O"};
		double[] outcome;
		outcome = test.calculatingScore(data);
		assertEquals(80+20, outcome[0], 0.0);
 	}
	
	/* 測試回答資料(1-18題)，全回答[非常符合] */
	@Test
	public void test_ans_1() {
		for(int i = 0; i < 9; i++) {
			this.personalAnswer[i][0] = 100;
			this.personalAnswer[i][1] = 100;
		//	this.personalAnswer[i][2] = 60;
			this.personalAnswer[i][3] = 100; 							
		}
		test.setPersonalAnswer(personalAnswer);
		
		int[] checkTable = new int[18];
		int[] personalAnswerToFirstPart = new int[18];
		for(int i = 0; i < checkTable.length; i++) {
			checkTable[i] = i;
		}
		for(int i = 0; i < personalAnswerToFirstPart.length; i++) {
			personalAnswerToFirstPart[i] = 0;
		}
		
		String input = "1\n1\n";
	    InputStream in = new ByteArrayInputStream(input.getBytes());
	    System.setIn(in);

		test.settingScoreFromFirstPart(checkTable, personalAnswerToFirstPart);
		String[] data = {"男", "射手座", "異性戀", "O"};
		double[] outcome;
		outcome = test.calculatingScore(data);
	
		assertEquals(86.67, outcome[0], 0.01);
 	}
	
/*	
	/* 測試回答資料(1-18題)，全回答[全不符合] */
	@Test
	public void test_ans_2() {
		
		String input = "1\n1\n";
	    InputStream in = new ByteArrayInputStream(input.getBytes());
	    System.setIn(in);
	    
		for(int i = 0; i < 9; i++) {
			this.personalAnswer[i][0] = 100;
			this.personalAnswer[i][1] = 100;
		//	this.personalAnswer[i][2] = 60;
			this.personalAnswer[i][3] = 100; 							
		}
		test.setPersonalAnswer(personalAnswer);
		
		int[] checkTable = new int[18];
		int[] personalAnswerToFirstPart = new int[18];
		for(int i = 0; i < checkTable.length; i++) {
			checkTable[i] = i;
		}
		for(int i = 0; i < personalAnswerToFirstPart.length; i++) {
			personalAnswerToFirstPart[i] = 3;
		}
	
		
		test.settingScoreFromFirstPart(checkTable, personalAnswerToFirstPart);
		String[] data = {"男", "射手座", "異性戀", "O"};
		double[] outcome;
		outcome = test.calculatingScore(data);

		
		
		assertEquals(60, outcome[0], 0.0);
		
 	}

}
