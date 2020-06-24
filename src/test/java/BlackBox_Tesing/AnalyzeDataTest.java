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
	
	/* �]�w */
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
	/* ���հ򥻸��(�嫬���v�T�A��2.6���W�[) */
	@Test
	public void test_basic_bloodtype1() {
		for(int i = 0; i < 9; i++) {
		//	this.personalAnswer[i][0] = 100;
			this.personalAnswer[i][1] = 100;
			this.personalAnswer[i][2] = 60;
			this.personalAnswer[i][3] = 100; 							
		}
		test.setPersonalAnswer(personalAnswer);
		
		String[] data = {"�k", "���~�y", "������", "A"};
		double[] outcome;
		outcome = test.calculatingScore(data);
		assertEquals(90+10, outcome[2], 0.0);
		assertEquals(90+10, outcome[4], 0.0);
 	}
	/* ���հ򥻸��(�嫬���v�T�A��1.8���W�[) */
	@Test
	public void test_basic_bloodtype2() {
		for(int i = 0; i < 9; i++) {
		//	this.personalAnswer[i][0] = 100;
			this.personalAnswer[i][1] = 100;
			this.personalAnswer[i][2] = 60;
			this.personalAnswer[i][3] = 100; 							
		}
		test.setPersonalAnswer(personalAnswer);
		
		String[] data = {"�k", "���~�y", "������", "B"};
		double[] outcome;
		outcome = test.calculatingScore(data);
		assertEquals(90+10, outcome[1], 0.0);
		assertEquals(90+10, outcome[8], 0.0);
 	}
	/* ���հ򥻸��(�嫬���v�T�A��4.5.6.9���W�[) */
	@Test
	public void test_basic_bloodtype3() {
		for(int i = 0; i < 9; i++) {
		//	this.personalAnswer[i][0] = 100;
			this.personalAnswer[i][1] = 100;
			this.personalAnswer[i][2] = 60;
			this.personalAnswer[i][3] = 100; 							
		}
		test.setPersonalAnswer(personalAnswer);
		
		String[] data = {"�k", "���~�y", "������", "AB"};
		double[] outcome;
		outcome = test.calculatingScore(data);
		assertEquals(90+10, outcome[4], 0.0);
		assertEquals(90+10, outcome[5], 0.0);
		assertEquals(90+10, outcome[6], 0.0);
		assertEquals(90+10, outcome[0], 0.0);
 	}
	/* ���հ򥻸��(�嫬���v�T�A��3.7���W�[) */
	@Test
	public void test_basic_bloodtype4() {
		for(int i = 0; i < 9; i++) {
		//	this.personalAnswer[i][0] = 100;
			this.personalAnswer[i][1] = 100;
			this.personalAnswer[i][2] = 60;
			this.personalAnswer[i][3] = 100; 							
		}
		test.setPersonalAnswer(personalAnswer);
		
		String[] data = {"�k", "���~�y", "������", "O"};
		double[] outcome;
		outcome = test.calculatingScore(data);
		assertEquals(90+10, outcome[3], 0.0);
		assertEquals(90+10, outcome[7], 0.0);
 	}
	/* ���հ򥻸��(�P�y���v�T�A��1���W�[) */
	@Test
	public void test_star_1() {
		for(int i = 0; i < 9; i++) {
			this.personalAnswer[i][0] = 100;
		//	this.personalAnswer[i][1] = 100;
			this.personalAnswer[i][2] = 60;
			this.personalAnswer[i][3] = 100; 							
		}
		test.setPersonalAnswer(personalAnswer);
		
		String[] data = {"�k", "���Ȯy", "������", "O"};
	//	String[] data = {"�k", "��l�y", "������", "O"};
		double[] outcome;
		outcome = test.calculatingScore(data);
		assertEquals(80+20, outcome[1], 0.0);
 	}
	/* ���հ򥻸��(�P�y���v�T�A��1���W�[) */
	@Test
	public void test_star_1_2() {
		for(int i = 0; i < 9; i++) {
			this.personalAnswer[i][0] = 100;
		//	this.personalAnswer[i][1] = 100;
			this.personalAnswer[i][2] = 60;
			this.personalAnswer[i][3] = 100; 							
		}
		test.setPersonalAnswer(personalAnswer);
		
	//	String[] data = {"�k", "���Ȯy", "������", "O"};
		String[] data = {"�k", "��l�y", "������", "O"};
		double[] outcome;
		outcome = test.calculatingScore(data);
		assertEquals(80+20, outcome[1], 0.0);
 	}
	/* ���հ򥻸��(�P�y���v�T�A��2���W�[) */
	@Test
	public void test_star_2() {
		for(int i = 0; i < 9; i++) {
			this.personalAnswer[i][0] = 100;
		//	this.personalAnswer[i][1] = 100;
			this.personalAnswer[i][2] = 60;
			this.personalAnswer[i][3] = 100; 							
		}
		test.setPersonalAnswer(personalAnswer);
		
		String[] data = {"�k", "���~�y", "������", "O"};
	//	String[] data = {"�k", "�ѯ��y", "������", "O"};
		double[] outcome;
		outcome = test.calculatingScore(data);
		assertEquals(80+20, outcome[2], 0.0);
 	}
	/* ���հ򥻸��(�P�y���v�T�A��2���W�[) */
	@Test
	public void test_star_2_2() {
		for(int i = 0; i < 9; i++) {
			this.personalAnswer[i][0] = 100;
		//	this.personalAnswer[i][1] = 100;
			this.personalAnswer[i][2] = 60;
			this.personalAnswer[i][3] = 100; 							
		}
		test.setPersonalAnswer(personalAnswer);
		
	//	String[] data = {"�k", "���~�y", "������", "O"};
		String[] data = {"�k", "�ѯ��y", "������", "O"};
		double[] outcome;
		outcome = test.calculatingScore(data);
		assertEquals(80+20, outcome[2], 0.0);
 	}
	/* ���հ򥻸��(�P�y���v�T�A��3���W�[) */
	@Test
	public void test_star_3() {
		for(int i = 0; i < 9; i++) {
			this.personalAnswer[i][0] = 100;
		//	this.personalAnswer[i][1] = 100;
			this.personalAnswer[i][2] = 60;
			this.personalAnswer[i][3] = 100; 							
		}
		test.setPersonalAnswer(personalAnswer);
		
		String[] data = {"�k", "���l�y", "������", "O"};
		double[] outcome;
		outcome = test.calculatingScore(data);
		assertEquals(80+20, outcome[3], 0.0);
 	}
	/* ���հ򥻸��(�P�y���v�T�A��4���W�[) */
	@Test
	public void test_star_4() {
		for(int i = 0; i < 9; i++) {
			this.personalAnswer[i][0] = 100;
		//	this.personalAnswer[i][1] = 100;
			this.personalAnswer[i][2] = 60;
			this.personalAnswer[i][3] = 100; 							
		}
		test.setPersonalAnswer(personalAnswer);
		
		String[] data = {"�k", "�B�k�y", "������", "O"};
		double[] outcome;
		outcome = test.calculatingScore(data);
		assertEquals(80+20, outcome[4], 0.0);
 	}
	/* ���հ򥻸��(�P�y���v�T�A��5���W�[) */
	@Test
	public void test_star_5() {
		for(int i = 0; i < 9; i++) {
			this.personalAnswer[i][0] = 100;
		//	this.personalAnswer[i][1] = 100;
			this.personalAnswer[i][2] = 60;
			this.personalAnswer[i][3] = 100; 							
		}
		test.setPersonalAnswer(personalAnswer);
		
		String[] data = {"�k", "���~�y", "������", "O"};
		double[] outcome;
		outcome = test.calculatingScore(data);
		assertEquals(80+20, outcome[5], 0.0);
 	}
	/* ���հ򥻸��(�P�y���v�T�A��6���W�[) */
	@Test
	public void test_star_6() {
		for(int i = 0; i < 9; i++) {
			this.personalAnswer[i][0] = 100;
		//	this.personalAnswer[i][1] = 100;
			this.personalAnswer[i][2] = 60;
			this.personalAnswer[i][3] = 100; 							
		}
		test.setPersonalAnswer(personalAnswer);
		
		String[] data = {"�k", "���ɮy", "������", "O"};
	//	String[] data = {"�k", "�����y", "������", "O"};
		double[] outcome;
		outcome = test.calculatingScore(data);
		assertEquals(80+20, outcome[6], 0.0);
 	}
	/* ���հ򥻸��(�P�y���v�T�A��6���W�[) */
	@Test
	public void test_star_6_2() {
		for(int i = 0; i < 9; i++) {
			this.personalAnswer[i][0] = 100;
		//	this.personalAnswer[i][1] = 100;
			this.personalAnswer[i][2] = 60;
			this.personalAnswer[i][3] = 100; 							
		}
		test.setPersonalAnswer(personalAnswer);
		
	//	String[] data = {"�k", "���ɮy", "������", "O"};
		String[] data = {"�k", "�����y", "������", "O"};
		double[] outcome;
		outcome = test.calculatingScore(data);
		assertEquals(80+20, outcome[6], 0.0);
 	}
	/* ���հ򥻸��(�P�y���v�T�A��7���W�[) */
	@Test
	public void test_star_7() {
		for(int i = 0; i < 9; i++) {
			this.personalAnswer[i][0] = 100;
		//	this.personalAnswer[i][1] = 100;
			this.personalAnswer[i][2] = 60;
			this.personalAnswer[i][3] = 100; 							
		}
		test.setPersonalAnswer(personalAnswer);
		
		String[] data = {"�k", "�d�Ϯy", "������", "O"};
		double[] outcome;
		outcome = test.calculatingScore(data);
		assertEquals(80+20, outcome[7], 0.0);
 	}
	/* ���հ򥻸��(�P�y���v�T�A��8���W�[) */
	@Test
	public void test_star_8() {
		for(int i = 0; i < 9; i++) {
			this.personalAnswer[i][0] = 100;
		//	this.personalAnswer[i][1] = 100;
			this.personalAnswer[i][2] = 60;
			this.personalAnswer[i][3] = 100; 							
		}
		test.setPersonalAnswer(personalAnswer);
		
		String[] data = {"�k", "�����y", "������", "O"};
		double[] outcome;
		outcome = test.calculatingScore(data);
		assertEquals(80+20, outcome[8], 0.0);
 	}
	/* ���հ򥻸��(�P�y���v�T�A��9���W�[) */
	@Test
	public void test_star_9() {
		for(int i = 0; i < 9; i++) {
			this.personalAnswer[i][0] = 100;
		//	this.personalAnswer[i][1] = 100;
			this.personalAnswer[i][2] = 60;
			this.personalAnswer[i][3] = 100; 							
		}
		test.setPersonalAnswer(personalAnswer);
		
		String[] data = {"�k", "�g��y", "������", "O"};
		double[] outcome;
		outcome = test.calculatingScore(data);
		assertEquals(80+20, outcome[0], 0.0);
 	}
	
	/* ���զ^�����(1-18�D)�A���^��[�D�`�ŦX] */
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
		String[] data = {"�k", "�g��y", "������", "O"};
		double[] outcome;
		outcome = test.calculatingScore(data);
	
		assertEquals(86.67, outcome[0], 0.01);
 	}
	
/*	
	/* ���զ^�����(1-18�D)�A���^��[�����ŦX] */
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
		String[] data = {"�k", "�g��y", "������", "O"};
		double[] outcome;
		outcome = test.calculatingScore(data);

		
		
		assertEquals(60, outcome[0], 0.0);
		
 	}

}
