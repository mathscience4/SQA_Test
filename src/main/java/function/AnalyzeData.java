/* 
 * 	課程名稱:	軟體工程導論
 * 	授課老師:	許懷中 博士
 * 	小組組名:	軟工非軟工
 *	專題名稱:	心理分析大師
 *	功能名稱:	需求分析
 *	學生學號:	D0611057
 *	學生姓名:	黃皓偉
 *
 *	最後修改日期:	2018.12.29
 */

package function;

import java.util.Random;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class AnalyzeData {
	
	private String[] questionFirst = new String[18];
	private String[] questionSecond = new String[2];
	private double[][] personalAnswer = new double[10][5];
	
	public void setPersonalAnswer(double[][] personalAnswer) {
		this.personalAnswer = personalAnswer;
	}
	
	
	public AnalyzeData(){
		
		for(int i = 0; i < personalAnswer.length; i++) {
			for(int j = 0; j < personalAnswer[i].length; j++) {
				personalAnswer[i][j] = 0;
			}
		}
		Scanner textInput = null;
		try {
			
			textInput = new Scanner(new FileInputStream("TestBank.txt"), "BIG5");
		}catch(FileNotFoundException e) {
			
			System.out.println("檔案檔名錯誤或不跟此程式同一路徑!!!");
			System.exit(0);
		//	e.printStackTrace();
		}
		
		for(int i = 0; i < questionFirst.length; i++) {
			questionFirst[i] = textInput.nextLine();
		}
		for(int i = 0; i < questionSecond.length; i++) {
			questionSecond[i] = textInput.nextLine();
		}
	//	textInput.close();
	}
	
	private int[] random(int num) {
		
		Random r = new Random();
		
		int [] array = new int[num];
		for(int i = 0; i < num; i++) {

			array[i] = r.nextInt(num);
		}
		
		for(int i = 0; i < array.length; i++) {
			
			for(int j = 0; j < i; j++) {
				
				if(array[i] == array[j]) {
					
					array[i] = r.nextInt(num);
					i--;
				}
			}
		}
		
		return array;
	}
	
	public void readQuestionFirst() {
		
		
		int[] array = random(18);
		int[] ans = new int[18];
	    Scanner keyboard = new Scanner(System.in);
	    String op = null;
	   
	    for(int i = 0; i < questionFirst.length; i++) {
			System.out.println("第" + (i+1) + "題:	" + questionFirst[array[i]]);
			System.out.println("非常符合			---1");
			System.out.println("比較符合			---2");
			System.out.println("不太符合			---3");
			System.out.println("全不符合			---4");
			System.out.println("----------------");
			System.out.print("請輸入您最認同的選項: ");
			op = keyboard.nextLine();
			
			if(op.equals("1")) {
				
				ans[i] = 0;
			}else if(op.equals("2")){
				
				ans[i] = 1;
			}else if(op.equals("3")) {
				
				ans[i] = 2;
			}else if(op.equals("4")){
				
				ans[i] = 3;
			}else {
				
				System.out.println("輸入錯誤，終止程式!!!");
				System.exit(0);
			}
			
			System.out.println("");
		}
	    
	    this.settingScoreFromFirstPart(array, ans);
	  //  keyboard.close();
	}
	
	public void settingScoreFromFirstPart(int[] checkTable, int[] personalAnswerToFirstPart) {
		
		int judge;
		for(int i = 0; i < checkTable.length; i++) {
			
			judge = checkTable[i]/2 + 1;
			if(personalAnswerToFirstPart[i] == 0) {
				
				this.personalAnswer[judge % 9][2] += 10;
				this.personalAnswer[(judge + 1)% 9][2] += 5;
				this.personalAnswer[(judge + 2) % 9][2] += 5;
			}else if(personalAnswerToFirstPart[i] == 1) {
				
				this.personalAnswer[judge % 9][2] += 5;
				this.personalAnswer[(judge + 1) % 9][2] += 1;
				this.personalAnswer[(judge + 2) % 9][2] += 1;
			}else if(personalAnswerToFirstPart[i] == 2) {
				
				this.personalAnswer[judge % 9][2] += 1;
				this.personalAnswer[(judge + 1) % 9][2] += 0;
				this.personalAnswer[(judge + 2) % 9][2] += 0;
			}else {
				
				this.personalAnswer[judge % 9][2] += 0;
				this.personalAnswer[(judge + 1) % 9][2] += 0;
				this.personalAnswer[(judge + 2) % 9][2] += 0;
			}
		}
		
		double[] arr = new double[3];
		double[] max = new double[3];
		
		judge = 2;
		while(true) {

			if(judge == 11) {
				break;
			}
			for(int i = 0; i < arr.length; i++) {
				
				arr[i] = this.personalAnswer[judge % 9][2];
				judge++;
			}
			
			max[(judge + 1) / 3 - 2] = findMAX(arr);
			for(int i = 0; i < arr.length; i++) {
				
				arr[i] = 0;
			}
		}
		
		if(20 < max[0] && max[0] <= 30) {
			
			this.personalAnswer[5][2] += 5;
			this.personalAnswer[6][2] += 5;
			this.personalAnswer[7][2] += 5;
			
			this.personalAnswer[8][2] += 5;
			this.personalAnswer[0][2] += 5;
			this.personalAnswer[1][2] += 5;
		}else if(0 < max[2] && max[0] <= 20){
			
			this.personalAnswer[5][2] += 10;
			this.personalAnswer[6][2] += 10;
			this.personalAnswer[7][2] += 10;
			
			this.personalAnswer[8][2] += 10;
			this.personalAnswer[0][2] += 10;
			this.personalAnswer[1][2] += 10;
		}
		
		if(20 < max[1] && max[1] <= 30) {
			
			
			this.personalAnswer[8][2] += 5;
			this.personalAnswer[0][2] += 5;
			this.personalAnswer[1][2] += 5;
			
			this.personalAnswer[2][2] += 5;
			this.personalAnswer[3][2] += 5;
			this.personalAnswer[4][2] += 5;
		}else if(0 < max[2] && max[1] <= 20){
			
			
			this.personalAnswer[8][2] += 10;
			this.personalAnswer[0][2] += 10;
			this.personalAnswer[1][2] += 10;
			
			this.personalAnswer[2][2] += 10;
			this.personalAnswer[3][2] += 10;
			this.personalAnswer[4][2] += 10;
		}
		
		if(20 < max[2] && max[2] <= 30) {
			
			
			this.personalAnswer[2][2] += 5;
			this.personalAnswer[3][2] += 5;
			this.personalAnswer[4][2] += 5;
			
			this.personalAnswer[5][2] += 5;
			this.personalAnswer[6][2] += 5;
			this.personalAnswer[7][2] += 5;
		}else if(0 < max[2] && max[2] <= 20){
			
			
			this.personalAnswer[2][2] += 10;
			this.personalAnswer[3][2] += 10;
			this.personalAnswer[4][2] += 10;
			
			this.personalAnswer[5][2] += 10;
			this.personalAnswer[6][2] += 10;
			this.personalAnswer[7][2] += 10;
		}
		
		this.readQuestionSecond();
	}
	public void readQuestionSecond() {	
		
		int [] array =  random(3);
		String op = null;
		Scanner keyboard = new Scanner(System.in);
		String mainOption[] = new String[3];
		System.out.println("第19題:	" + questionSecond[0]);
		Scanner textInput = null;
		
		
		try {
			
			textInput = new Scanner(new FileInputStream("MainChoice.txt"), "BIG5");
		}catch(FileNotFoundException e) {
			
			e.printStackTrace();
		}
		for(int i = 0; i < array.length; i++) {
			mainOption[i] = textInput.nextLine();
		}
		textInput.close();
		
		for(int i = 0; i < array.length; i++) {
			System.out.println(mainOption[array[i]] + "		---" + (i+1));
		}
		System.out.println("----------------");
		System.out.print("請輸入最符合您的敘述: ");
		op = keyboard.nextLine();
		
		if(op.equals("1")) {
			
			if(array[0] == 0) {
				
				leftFromMain();	
			}else if(array[0] == 1) {
				
				middleFromMain();
			}else{
				
				rightFromMain();
			}
		}else if(op.equals("2")){
			
			if(array[0] == 0) {
				
				leftFromMain();	
			}else if(array[0] == 1) {
				
				middleFromMain();
			}else{
				
				rightFromMain();
			}
		}else if(op.equals("3")) {
			
			if(array[0] == 0) {
				
				leftFromMain();	
			}else if(array[0] == 1) {
				
				middleFromMain();
			}else{
				
				rightFromMain();
			}
		}else {
			System.out.println("輸入錯誤，終止程式!!!");
			System.exit(0);
		}
		
	//	keyboard.close();
	}
	
	public void leftFromMain() {
		
		Scanner textInput = null;
		String option[] = new String[3];
		int [] array =  random(3);
		
		System.out.println("");
		System.out.println("第20題:	" + questionSecond[1]);
		try {
			
			textInput = new Scanner(new FileInputStream("Choice1.txt"), "BIG5");
		}catch(FileNotFoundException e) {
			
			System.out.println("檔案檔名錯誤或不跟此程式同一路徑!!!");
			System.exit(0);
		//	e.printStackTrace();
		}
		for(int i = 0; i < array.length; i++) {
			
			option[i] = textInput.nextLine();
		}
		textInput.close();
		
		for(int i = 0; i < array.length; i++) {
			
			System.out.println(option[array[i]] + "		---" + (i+1));
		}
		
		System.out.println("----------------");
		System.out.print("請輸入最符合您的敘述: ");
		String op = null;
		Scanner keyboard = new Scanner(System.in);
	//	System.out.println(keyboard.nextLine().isEmpty());
		
		
		op = keyboard.nextLine();
	//	keyboard.close();
		
		if(op.equals("1")) {
			
			if(array[0] == 0) {
				
				this.personalAnswer[1][3] = 100;
			}else if(array[0] == 1) {
				
				this.personalAnswer[3][3] = 100;
			}else{
				
				this.personalAnswer[5][3] = 100;
			}
		}else if(op.equals("2")){
			
			if(array[1] == 0) {
				
				this.personalAnswer[1][3] = 100;
			}else if(array[1] == 1) {
				
				this.personalAnswer[3][3] = 100;
			}else{
				
				this.personalAnswer[5][3] = 100;
			}
		}else if(op.equals("3")) {
			
			if(array[2] == 0) {
				
				this.personalAnswer[1][3] = 100;
			}else if(array[2] == 1) {
				
				this.personalAnswer[3][3] = 100;
			}else{
				
				this.personalAnswer[5][3] = 100;
			}
		}else {
			System.out.println("輸入錯誤，終止程式!!!");
			System.exit(0);
		}
	}
		
	public void middleFromMain() {
		
		Scanner textInput = null;
		String option[] = new String[3];
		int [] array =  random(3);
		
		System.out.println("");
		System.out.println("第20題:	" + questionSecond[1]);
		try {
			
			textInput = new Scanner(new FileInputStream("Choice2.txt"), "BIG5");
		}catch(FileNotFoundException e) {
			
			System.out.println("檔案檔名錯誤或不跟此程式同一路徑!!!");
			System.exit(0);
		//	e.printStackTrace();
		}
		for(int i = 0; i < array.length; i++) {
			option[i] = textInput.nextLine();
		}
		textInput.close();
		
		for(int i = 0; i < array.length; i++) {
			System.out.println(option[array[i]] + "		---" + (i+1));
		}
		System.out.println("----------------");
		System.out.print("請輸入最符合您的敘述: ");
		String op = null;
		Scanner keyboard = new Scanner(System.in);
	//	System.out.println(keyboard.nextLine().isEmpty());
		
		op = keyboard.next();
	//	keyboard.close();
		
		if(op.equals("1")) {
			
			if(array[0] == 0) {
				
				this.personalAnswer[2][3] = 100;
			}else if(array[0] == 1) {
				
				this.personalAnswer[7][3] = 100;
			}else{
				
				this.personalAnswer[0][3] = 100;
			}
		}else if(op.equals("2")){
			
			if(array[1] == 0) {
				
				this.personalAnswer[2][3] = 100;
			}else if(array[1] == 1) {
				
				this.personalAnswer[7][3] = 100;
			}else{
				
				this.personalAnswer[0][3] = 100;
			}
		}else if(op.equals("3")) {
			
			if(array[2] == 0) {
				
				this.personalAnswer[2][3] = 100;
			}else if(array[2] == 1) {
				
				this.personalAnswer[7][3] = 100;
			}else{
				
				this.personalAnswer[0][3] = 100;
			}
		}else {
			System.out.println("輸入錯誤，終止程式!!!");
			System.exit(0);
		}
	}
	
	public void rightFromMain() {
		
		Scanner textInput = null;
		String option[] = new String[3];
		int [] array =  random(3);
		
		System.out.println("");
		System.out.println("第20題:	" + questionSecond[1]);
		try {
			
			textInput = new Scanner(new FileInputStream("Choice3.txt"), "BIG5");
		}catch(FileNotFoundException e) {
			
			e.printStackTrace();
		}
		for(int i = 0; i < array.length; i++) {
			option[i] = textInput.nextLine();
		}
		textInput.close();
		
		for(int i = 0; i < array.length; i++) {
			System.out.println(option[array[i]] + "		---" + (i+1));
		}
		System.out.println("----------------");
		System.out.print("請輸入最符合您的敘述: ");
		String op = null;
		Scanner keyboard = new Scanner(System.in);
		System.out.println(keyboard.nextLine().isEmpty());
		
	//	keyboard.close();
		op = keyboard.nextLine();
		
		
		if(op.equals("1")) {
			
			if(array[0] == 0) {
				
				this.personalAnswer[6][3] = 100;
			}else if(array[0] == 1) {
				
				this.personalAnswer[8][3] = 100;
			}else{
				
				this.personalAnswer[4][3] = 100;
			}
		}else if(op.equals("2")){
			
			if(array[1] == 0) {
				
				this.personalAnswer[6][3] = 100;
			}else if(array[1] == 1) {
				
				this.personalAnswer[8][3] = 100;
			}else{
				
				this.personalAnswer[4][3] = 100;
			}
		}else if(op.equals("3")) {
			
			if(array[2] == 0) {
				
				this.personalAnswer[6][3] = 100;
			}else if(array[2] == 1) {
				
				this.personalAnswer[8][3] = 100;
			}else{
				
				this.personalAnswer[4][3] = 100;
			}
		}else {
			System.out.println("輸入錯誤，終止程式!!!");
			System.exit(0);
		}
	}
	
	private double findMAX(double[] arr) {
		
		double max;
		max = arr[0];
		for(int i = 1; i < arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		
		return max;
	}
	public double[] calculatingScore(String[] data) {

		String[] star = {"水瓶座" , "射手座" , "雙子座" , "獅子座" , "金牛座" , "天秤座" , "牡羊座" , "巨蟹座" , "處女座" , "摩羯座" , "雙魚座" , "天蠍座"} ;
		String[] bType = {"A", "B", "AB", "O"};
		
		if(data[3].equals(bType[0])) {
			
			this.personalAnswer[2][0] = 100;
			this.personalAnswer[4][0] = 100;
		}else if((data[3].equals(bType[1]))) {
			
			this.personalAnswer[1][0] = 100;
			this.personalAnswer[8][0] = 100;
		}else if(data[3].equals(bType[2])) {
			
			this.personalAnswer[4][0] = 100;
			this.personalAnswer[5][0] = 100;
			this.personalAnswer[6][0] = 100;
			this.personalAnswer[0][0] = 100;
		}else {
			
			this.personalAnswer[3][0] = 100;
			this.personalAnswer[7][0] = 100;
		}
		
		if(data[1].equals(star[0])) {
			
			this.personalAnswer[2][1] = 100;
		}else if(data[1].equals(star[1])) {
			
			this.personalAnswer[0][1] = 100;
		}else if(data[1].equals(star[2])) {
			
			this.personalAnswer[3][1] = 100;
		}else if(data[1].equals(star[3])) {
			
			this.personalAnswer[1][1] = 100;
		}else if(data[1].equals(star[4])) {
			
			this.personalAnswer[8][1] = 100;
		}else if(data[1].equals(star[5])) {
			
			this.personalAnswer[2][1] = 100;
		}else if(data[1].equals(star[6])) {
			
			this.personalAnswer[7][1] = 100;
		}else if(data[1].equals(star[7])) {
			
			this.personalAnswer[6][1] = 100;
		}else if(data[1].equals(star[8])) {
			
			this.personalAnswer[4][1] = 100;
		}else if(data[1].equals(star[9])) {
			
			this.personalAnswer[5][1] = 100;
		}else if(data[1].equals(star[10])) {
			
			this.personalAnswer[6][1] = 100;
		}else {
			
			this.personalAnswer[1][1] = 100;
		}
		
		double[] outcome = new double[9];
		for(int i = 0; i < 9; i++) {
			
			this.personalAnswer[i][4] = (this.personalAnswer[i][0] * 0.1) + 
										(this.personalAnswer[i][1] * 0.2) + 
										(this.personalAnswer[i][2] * 5 / 3 * 0.4) + 
										(this.personalAnswer[i][3] * 0.3);
		}
		outcome[0] = this.personalAnswer[0][4];
		outcome[1] = this.personalAnswer[1][4];
		outcome[2] = this.personalAnswer[2][4];
		outcome[3] = this.personalAnswer[3][4];
		outcome[4] = this.personalAnswer[4][4];
		outcome[5] = this.personalAnswer[5][4];
		outcome[6] = this.personalAnswer[6][4];
		outcome[7] = this.personalAnswer[7][4];
		outcome[8] = this.personalAnswer[8][4];
		return outcome;
	}
	
	public String putData(double[] outcome) {
		
		String allData = null, temp = null;
		for(int i = 0; i < outcome.length; i++) {
			
			temp = Double.toString(outcome[i]);
			if(i == 0) {
				
				allData = temp; 
			}else {
				
				allData += " " + temp; 
			}
		}
		
		return allData;
	}
}
