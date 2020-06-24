/* 
 * 	課程名稱:	軟體工程導論
 * 	授課老師:	許懷中 博士
 * 	小組組名:	軟工非軟工
 *	專題名稱:	心理分析大師
 *	功能名稱:	設置討論
 *	學生學號:	D0611057
 *	學生姓名:	黃皓偉
 *
 *	最後修改日期:	2018.12.29
 */

package function;

import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.io.File; 

public class ForumSetting {
	
	private String[] tmpStore = new String[1000];
	
	public ForumSetting(){
		
		String location = "DataBase_Test.txt";
		File file = new File(location);
		
		if(!file.exists()){
			
			try {

				file.createNewFile();
				
				PrintWriter textOutput = null;
				try {
			
					textOutput = new PrintWriter(new FileOutputStream(location));
		
					textOutput.println("==============================盡情暢談，留下色彩================================");
		
					textOutput.close();
				}catch(FileNotFoundException e) {
		
					System.out.println("檔案檔名錯誤或不跟此程式同一路徑!!!");
					System.exit(0);
				//	e.printStackTrace();
				}	
			} catch (Exception e) {
			
				System.out.println("創建失敗!!!");
				System.exit(0);
				//	e.printStackTrace();
			}

			System.out.println("建立測試檔成功!!!");
			System.out.println("*****************");
		}			
			
		for(int i = 0; i < tmpStore.length; i++) {
			
			tmpStore[i] = "N/A";
		}
		
		String str = null;
		String op = null;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("---------------------------");
		System.out.println("請選擇功能:");
		System.out.println("新增意見               ---1");
		System.out.println("查看歷史               ---2");
		System.out.println("結束功能               ---0");
		System.out.println("---------------------------");
		System.out.print("請輸入功能(請輸入1或2或0): ");
		op = keyboard.nextLine();
		System.out.println("");
			
		if(op.equals("1")) {
			
			String name = null;
			System.out.println("請輸入發言的稱號(若要匿名，請直接按[Enter 鍵]，而[anonymous]是預設匿名也不得輸入!)):");
			name = keyboard.nextLine();
			if(name.equals("anonymous")){
				
				System.out.println("");
				System.out.println("此為預設匿名，故將設為匿名名稱!");
				name = "anonymous";
			}
			
			System.out.println("請輸入文字(文明社會)");
			str = keyboard.nextLine();
			
			if(name.equals("")) {
				
				name = "anonymous";
			}
			
			this.inputdata(name, str, location);
			System.out.println("---------------------------");
			System.out.println("輸入完成");
		}else if(op.equals("2")) {
			
			this.checkHistory(location);
			System.out.println("---------------------------");
			System.out.println("查看完成");
		}else if(op.equals("0")){
				
			if(file.exists()){
				
				file.delete();
			//	file.close();
				
				System.out.println("刪除測試檔成功!!!");
				System.out.println("*****************");
			}	
		}else{
						
			System.out.println("");
			System.out.println("輸入錯誤，終止程式!!!");
			System.exit(0);
		}
	//	keyboard.close();
	}
	
	public ForumSetting(String location) {
		
		// 參考[http://rex5405.pixnet.net/blog/post/57234687-%5Bjava%5D-%E6%96%B0%E5%A2%9E%E6%88%96%E5%88%AA%E9%99%A4%E6%AA%94%E6%A1%88%E5%8F%8A%E8%B3%87%E6%96%99%E5%A4%BE]
		
		for(int i = 0; i < tmpStore.length; i++) {
			
			tmpStore[i] = "N/A";
		}
		
		String str = null;
		String op = null;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("---------------------------");
		System.out.println("請選擇功能:");
		System.out.println("新增意見               ---1");
		System.out.println("查看歷史               ---2");
		System.out.println("結束功能               ---0");
		System.out.println("---------------------------");
		System.out.print("請輸入功能(請輸入1或2或0): ");
		op = keyboard.nextLine();
		System.out.println("");
			
		if(op.equals("1")) {
			
			String name = null;
			System.out.println("請輸入發言的稱號(若要匿名，請直接按[Enter 鍵]，而[anonymous]是預設匿名也不得輸入!)):");
			name = keyboard.nextLine();
			if(name.equals("anonymous")){
				
				System.out.println("");
				System.out.println("此為預設匿名，故將設為匿名名稱!");
				name = "anonymous";
			}
			
			System.out.println("請輸入文字(文明社會)");
			str = keyboard.nextLine();
			
			if(name.equals("")) {
				
				name = "anonymous";
			}
			
			this.inputdata(name, str, location);
			System.out.println("---------------------------");
			System.out.println("輸入完成");
		}else if(op.equals("2")) {
			
			this.checkHistory(location);
			System.out.println("---------------------------");
			System.out.println("查看完成");
		}else if(op.equals("0")){
			
			
		}else{
						
			System.out.println("");
			System.out.println("輸入錯誤，終止程式!!!");
			System.exit(0);
		}
	//	keyboard.close();
	}


	public void inputdata(String name, String str, String location) {
		
		Scanner textInput = null;
		try {
			
			textInput = new Scanner(new FileInputStream(location), "big5");
		}catch(FileNotFoundException e) {
			System.out.println("檔案檔名錯誤或不跟此程式同一路徑!!!");
			System.exit(0);
		//	e.printStackTrace();
		}
		
		int count = 0;
		while(textInput.hasNextLine()) {
			
			tmpStore[count++] = textInput.nextLine();
		}
		//參考[http://blog.udn.com/LupinBlog/1900848]
		SimpleDateFormat stdFormat = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
		Date date = new Date();
		String stdDate = stdFormat.format(date);
		
		tmpStore[count++] = "名稱: " + name;
		tmpStore[count++] = "時間: " + stdDate + " 內文: " + str;
		tmpStore[count++] = "================================================================================";
	//	textInput.close();
		
		PrintWriter textOutput = null;
		try {
			
			textOutput = new PrintWriter(new FileOutputStream(location));
			
			for(int i = 0; i < count; i++) {
				
				textOutput.println(tmpStore[i]);
			}
			
			textOutput.close();
		}catch(FileNotFoundException e) {
			
			System.out.println("檔案檔名錯誤或不跟此程式同一路徑!!!");
			System.exit(0);
		//	e.printStackTrace();
		}	
	}
	
	public void checkHistory(String location) {
		
		String tmp = null;
		String op = null;
		Scanner textInput = null;
		Scanner keyboard = new Scanner(System.in);
		
		try {
			
			textInput = new Scanner(new FileInputStream(location), "big5");
		}catch(FileNotFoundException e) {
			
			System.out.println("檔案檔名錯誤或不跟此程式同一路徑!!!");
			System.exit(0);
		//	e.printStackTrace();
		}
		
		while(textInput.hasNextLine()) {
			
			tmp = textInput.nextLine();
			System.out.println(tmp);
		}
		
		while(true){
				
			System.out.println("");
			System.out.println("請問是否要回覆留言?(Y/N)");
			op = keyboard.nextLine();
		
			if(op.equals("Y") || op.equals("y")){
				
				String searchName = null;
				System.out.println("請輸入名稱(注意!!!必須確認有輸入過，[anonymous]是預設匿名，也不得回覆!): ");
				searchName = keyboard.nextLine();
				if(searchName.equals("anonymous")){
							
					System.out.println("");
					System.out.println("匿名無法回覆!!!");
					break;
				}
				
				Scanner dataInput = null;
				String tmpData = null;
				boolean flag = false;
				try {
				
					dataInput = new Scanner(new FileInputStream(location), "big5");
					while(dataInput.hasNextLine()) {
						
						tmpData = dataInput.nextLine();
						if(tmpData.equals("名稱: " + searchName)){
							
							flag = true;
							break;
						}
						
					}
					
					if(!flag) {
						System.out.println("");
						System.out.print("Are you kidding me?");
						
						File file = new File("DataBase_Test.txt");
						if(file.exists()){
				
							file.delete();
						}	
						
						System.exit(0);
					}else{
						
						String name = null;
						String str = null;
						System.out.println("請輸入發言的稱號(若要匿名，請直接按[Enter 鍵]，而[anonymous]是預設匿名也不得輸入!):");
						name = keyboard.nextLine();
						if(name.equals("anonymous")){
				
							System.out.println("");
							System.out.println("此為預設匿名，故將設為匿名名稱!");
							
							name = "anonymous";
							name =  name + " 回覆: " + searchName;
						}
						
						System.out.println("請輸入文字(文明社會)");
						str = keyboard.nextLine();
						
						if(name.equals("")) {
								
							name = "anonymous";
							name =  name + " 回覆: " + searchName;
						}else {
							
							name =  name + " 回覆: " + searchName;
						}

						this.inputdata(name, str, location);
						System.out.println("---------------------------");
						System.out.println("輸入完成");
						break;
					}
				}catch(FileNotFoundException e) {
				
					System.out.println("檔案檔名錯誤或不跟此程式同一路徑!!!");
					System.exit(0);
				//	e.printStackTrace();
				}
			}else if(op.equals("N") || op.equals("n")){
				
				System.out.println("");
				System.out.println("結束功能");
				break;
			}else{
			
				System.out.println("輸入錯誤，請再次輸入!!!");
			}		
		}
	//	textInput.close();
	}
}
