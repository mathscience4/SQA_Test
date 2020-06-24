package BlackBox_Tesing;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import function.print_SumClass;

public class print_SumClassTest {
	
	print_SumClass test;
	double[] text_predata;
	
	/* 設定 */
	@Before
	public void before() {
		test = new print_SumClass();
		text_predata = new double[9];
	}
	@After
	public void after() {
		test = null;
		text_predata = null;
	}
	
	/* case1: sum1 > sum2 && sum1 > sum3 */
	@Test
	public void test_output1() {
		for(int i = 0; i < text_predata.length; i++) {
			if(i == 0 || i == 1 || i == 8) {
				text_predata[i] = 90;
			}else {
				text_predata[i] = 60;
			}
		}
		test.totalSum(text_predata);
		test.print(text_predata);
		assertEquals(1, test.compare());
	}
	/* case2: sum2 > sum1 && sum2 > sum3 */
	@Test
	public void test_output2() {
		for(int i = 0; i < text_predata.length; i++) {
			if(i == 2 || i == 3 || i == 4) {
				text_predata[i] = 90;
			}else {
				text_predata[i] = 60;
			}
		}
		test.totalSum(text_predata);
		test.print(text_predata);
		assertEquals(2, test.compare());
	}
	/* case3: sum3 > sum1 && sum3 > sum2 */
	@Test
	public void test_output3() {
		for(int i = 0; i < text_predata.length; i++) {
			if(i == 5 || i == 6 || i == 7) {
				text_predata[i] = 90;
			}else {
				text_predata[i] = 60;
			}
		}
		test.totalSum(text_predata);
		test.print(text_predata);
		assertEquals(3, test.compare());
	}
	/* case4: sum1 == sum2 && sum1 != sum3 */
	@Test
	public void test_output4() {
		for(int i = 0; i < text_predata.length; i++) {
			if(i == 5 || i == 6 || i == 7) {
				text_predata[i] = 60;
			}else {
				text_predata[i] = 90;
			}
		}
		test.totalSum(text_predata);
		test.print(text_predata);
		assertEquals(4, test.compare());
	}
	/* case5: sum1 == sum3 && sum1 != sum2 */
	@Test
	public void test_output5() {
		for(int i = 0; i < text_predata.length; i++) {
			if(i == 2 || i == 3 || i == 4) {
				text_predata[i] = 60;
			}else {
				text_predata[i] = 90;
			}
		}
		test.totalSum(text_predata);
		test.print(text_predata);
		assertEquals(5, test.compare());
	}
	/* case6: sum2 == sum3 && sum2 != sum1 */
	@Test
	public void test_output6() {
		for(int i = 0; i < text_predata.length; i++) {
			if(i == 0 || i == 1 || i == 8) {
				text_predata[i] = 60;
			}else {
				text_predata[i] = 90;
			}
		}
		test.totalSum(text_predata);
		test.print(text_predata);
		assertEquals(6, test.compare());
	}
	/* case7: sum1 == sum2 && sum2 == sum3 */
	@Test
	public void test_output7() {
		for(int i = 0; i < text_predata.length; i++) {
			text_predata[i] = 60;
		}
		test.totalSum(text_predata);
		test.print(text_predata);
		assertEquals(7, test.compare());
	}
	/* 例外輸入: 有負值 */
	@Test(expected =  Exception.class)
	public void test_wrong1() {
		for(int i = 0; i < text_predata.length; i++) {
				text_predata[i] = -1;
		}
		test.totalSum(text_predata);
	//	test.print(text_predata);
		test.compare();
	}
	/* 例外輸入: 超出總分 */
	@Test(expected =  Exception.class)
	public void test_wrong2() {
		for(int i = 0; i < text_predata.length; i++) {
				text_predata[i] = 101;
		}
		test.totalSum(text_predata);
	//	test.print(text_predata);
		test.compare();
	}
}
