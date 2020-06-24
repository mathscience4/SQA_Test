/* 
 * 	�ҵ{�W��:	�n��u�{�ɽ�
 * 	�½ҦѮv:	�\�h�� �դh
 * 	�p�ղզW:	�n�u�D�n�u
 *	�M�D�W��:	�߲z���R�j�v
 *	�\��W��:	�]�m�Q��
 *	�ǥ;Ǹ�:	D0611057
 *	�ǥͩm�W:	���q��
 *
 *	�̫�ק���:	2018.12.29
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
		
					textOutput.println("==============================�ɱ��Z�͡A�d�U��m================================");
		
					textOutput.close();
				}catch(FileNotFoundException e) {
		
					System.out.println("�ɮ��ɦW���~�Τ��򦹵{���P�@���|!!!");
					System.exit(0);
				//	e.printStackTrace();
				}	
			} catch (Exception e) {
			
				System.out.println("�Ыإ���!!!");
				System.exit(0);
				//	e.printStackTrace();
			}

			System.out.println("�إߴ����ɦ��\!!!");
			System.out.println("*****************");
		}			
			
		for(int i = 0; i < tmpStore.length; i++) {
			
			tmpStore[i] = "N/A";
		}
		
		String str = null;
		String op = null;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("---------------------------");
		System.out.println("�п�ܥ\��:");
		System.out.println("�s�W�N��               ---1");
		System.out.println("�d�ݾ��v               ---2");
		System.out.println("�����\��               ---0");
		System.out.println("---------------------------");
		System.out.print("�п�J�\��(�п�J1��2��0): ");
		op = keyboard.nextLine();
		System.out.println("");
			
		if(op.equals("1")) {
			
			String name = null;
			System.out.println("�п�J�o�����ٸ�(�Y�n�ΦW�A�Ъ�����[Enter ��]�A��[anonymous]�O�w�]�ΦW�]���o��J!)):");
			name = keyboard.nextLine();
			if(name.equals("anonymous")){
				
				System.out.println("");
				System.out.println("�����w�]�ΦW�A�G�N�]���ΦW�W��!");
				name = "anonymous";
			}
			
			System.out.println("�п�J��r(������|)");
			str = keyboard.nextLine();
			
			if(name.equals("")) {
				
				name = "anonymous";
			}
			
			this.inputdata(name, str, location);
			System.out.println("---------------------------");
			System.out.println("��J����");
		}else if(op.equals("2")) {
			
			this.checkHistory(location);
			System.out.println("---------------------------");
			System.out.println("�d�ݧ���");
		}else if(op.equals("0")){
				
			if(file.exists()){
				
				file.delete();
			//	file.close();
				
				System.out.println("�R�������ɦ��\!!!");
				System.out.println("*****************");
			}	
		}else{
						
			System.out.println("");
			System.out.println("��J���~�A�פ�{��!!!");
			System.exit(0);
		}
	//	keyboard.close();
	}
	
	public ForumSetting(String location) {
		
		// �Ѧ�[http://rex5405.pixnet.net/blog/post/57234687-%5Bjava%5D-%E6%96%B0%E5%A2%9E%E6%88%96%E5%88%AA%E9%99%A4%E6%AA%94%E6%A1%88%E5%8F%8A%E8%B3%87%E6%96%99%E5%A4%BE]
		
		for(int i = 0; i < tmpStore.length; i++) {
			
			tmpStore[i] = "N/A";
		}
		
		String str = null;
		String op = null;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("---------------------------");
		System.out.println("�п�ܥ\��:");
		System.out.println("�s�W�N��               ---1");
		System.out.println("�d�ݾ��v               ---2");
		System.out.println("�����\��               ---0");
		System.out.println("---------------------------");
		System.out.print("�п�J�\��(�п�J1��2��0): ");
		op = keyboard.nextLine();
		System.out.println("");
			
		if(op.equals("1")) {
			
			String name = null;
			System.out.println("�п�J�o�����ٸ�(�Y�n�ΦW�A�Ъ�����[Enter ��]�A��[anonymous]�O�w�]�ΦW�]���o��J!)):");
			name = keyboard.nextLine();
			if(name.equals("anonymous")){
				
				System.out.println("");
				System.out.println("�����w�]�ΦW�A�G�N�]���ΦW�W��!");
				name = "anonymous";
			}
			
			System.out.println("�п�J��r(������|)");
			str = keyboard.nextLine();
			
			if(name.equals("")) {
				
				name = "anonymous";
			}
			
			this.inputdata(name, str, location);
			System.out.println("---------------------------");
			System.out.println("��J����");
		}else if(op.equals("2")) {
			
			this.checkHistory(location);
			System.out.println("---------------------------");
			System.out.println("�d�ݧ���");
		}else if(op.equals("0")){
			
			
		}else{
						
			System.out.println("");
			System.out.println("��J���~�A�פ�{��!!!");
			System.exit(0);
		}
	//	keyboard.close();
	}


	public void inputdata(String name, String str, String location) {
		
		Scanner textInput = null;
		try {
			
			textInput = new Scanner(new FileInputStream(location), "big5");
		}catch(FileNotFoundException e) {
			System.out.println("�ɮ��ɦW���~�Τ��򦹵{���P�@���|!!!");
			System.exit(0);
		//	e.printStackTrace();
		}
		
		int count = 0;
		while(textInput.hasNextLine()) {
			
			tmpStore[count++] = textInput.nextLine();
		}
		//�Ѧ�[http://blog.udn.com/LupinBlog/1900848]
		SimpleDateFormat stdFormat = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
		Date date = new Date();
		String stdDate = stdFormat.format(date);
		
		tmpStore[count++] = "�W��: " + name;
		tmpStore[count++] = "�ɶ�: " + stdDate + " ����: " + str;
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
			
			System.out.println("�ɮ��ɦW���~�Τ��򦹵{���P�@���|!!!");
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
			
			System.out.println("�ɮ��ɦW���~�Τ��򦹵{���P�@���|!!!");
			System.exit(0);
		//	e.printStackTrace();
		}
		
		while(textInput.hasNextLine()) {
			
			tmp = textInput.nextLine();
			System.out.println(tmp);
		}
		
		while(true){
				
			System.out.println("");
			System.out.println("�аݬO�_�n�^�Яd��?(Y/N)");
			op = keyboard.nextLine();
		
			if(op.equals("Y") || op.equals("y")){
				
				String searchName = null;
				System.out.println("�п�J�W��(�`�N!!!�����T�{����J�L�A[anonymous]�O�w�]�ΦW�A�]���o�^��!): ");
				searchName = keyboard.nextLine();
				if(searchName.equals("anonymous")){
							
					System.out.println("");
					System.out.println("�ΦW�L�k�^��!!!");
					break;
				}
				
				Scanner dataInput = null;
				String tmpData = null;
				boolean flag = false;
				try {
				
					dataInput = new Scanner(new FileInputStream(location), "big5");
					while(dataInput.hasNextLine()) {
						
						tmpData = dataInput.nextLine();
						if(tmpData.equals("�W��: " + searchName)){
							
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
						System.out.println("�п�J�o�����ٸ�(�Y�n�ΦW�A�Ъ�����[Enter ��]�A��[anonymous]�O�w�]�ΦW�]���o��J!):");
						name = keyboard.nextLine();
						if(name.equals("anonymous")){
				
							System.out.println("");
							System.out.println("�����w�]�ΦW�A�G�N�]���ΦW�W��!");
							
							name = "anonymous";
							name =  name + " �^��: " + searchName;
						}
						
						System.out.println("�п�J��r(������|)");
						str = keyboard.nextLine();
						
						if(name.equals("")) {
								
							name = "anonymous";
							name =  name + " �^��: " + searchName;
						}else {
							
							name =  name + " �^��: " + searchName;
						}

						this.inputdata(name, str, location);
						System.out.println("---------------------------");
						System.out.println("��J����");
						break;
					}
				}catch(FileNotFoundException e) {
				
					System.out.println("�ɮ��ɦW���~�Τ��򦹵{���P�@���|!!!");
					System.exit(0);
				//	e.printStackTrace();
				}
			}else if(op.equals("N") || op.equals("n")){
				
				System.out.println("");
				System.out.println("�����\��");
				break;
			}else{
			
				System.out.println("��J���~�A�ЦA����J!!!");
			}		
		}
	//	textInput.close();
	}
}
