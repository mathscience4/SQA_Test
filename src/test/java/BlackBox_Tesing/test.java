package BlackBox_Tesing;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.junit.Test;

import function.AnalyzeData;

public class test {
	
	AnalyzeData test;
	private String[] questionFirst;
	private String[] questionSecond;
	private double[][] personalAnswer;
	
	/* 測試回答資料(1-18題)，全回答[非常符合] */
	@Test
	public void test_ans_1() {
		
		test = new AnalyzeData();
		questionFirst = new String[18];
		questionSecond = new String[2];
		personalAnswer = new double[10][5];
		
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
		
	
		String input = "1\r\n1\r\n";
	    InputStream in = new ByteArrayInputStream(input.getBytes());
	    System.setIn(in);
	  

		test.settingScoreFromFirstPart(checkTable, personalAnswerToFirstPart);
		String[] data = {"男", "射手座", "異性戀", "O"};
		double[] outcome;
		outcome = test.calculatingScore(data);
	
		assertEquals(86.67, outcome[0], 0.01);
 	}
}
