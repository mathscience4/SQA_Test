/* 
 * 	�ҵ{�W��:	�n��u�{�ɽ�
 * 	�½ҦѮv:	�\�h�� �դh
 * 	�p�ղզW:	�n�u�D�n�u
 *	�M�D�W��:	�߲z���R�j�v
 *	�\��W��:	��X�\��
 *	�ǥ;Ǹ�:	D0611057
 *	�ǥͩm�W:	���q��
 *
 *	�̫�ק���:	2018.12.29
 */
import function.AnalyzeData;
import function.ForumSetting;
import function.InputNeed;
import function.print_SumClass;
import function.ConnectWeb;

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

import java.io.File; 

public class start {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		String op = null, password = null;
		
		while(true){
			
			System.out.println("[�߲z���R�j�v]") ;
			System.out.println("  �z�{�@�@�@�z�{") ;
			System.out.println("�z-�}�}------�}�r�{") ;
			System.out.println("�x�@�@�@�@�@�@  �x ") ;
			System.out.println("�x�@�@�@ �@�@�@�x");
			System.out.println("�x�@�s�}�@�|�s�@ �x") ;
			System.out.println("�x�@�@�@�@�@�@�@�x") ;
			System.out.println("�x�@�@�@�r�@�@�@�x") ;
			System.out.println("�x�@�@�@�@�@�@�@�x");
			System.out.println("�|-�{�@�@�@�z-�}") ;
			System.out.println("�@�@�x�@�@�@�x���P����") ;
			System.out.println("�@�@�x�@�@�@�x�~���A�Ѧۤv�I") ;
			System.out.println("�@�@�x�@�@�@-----�{");
			System.out.println("�@�@�x�@�@�@-----�{") ;
			System.out.println("�@�@�x�@�@�@�@�@�@�@�u�{") ;
			System.out.println("�@�@�x�@�@�@�@�@�@�@�z�}");
			System.out.println("�@�@�|�{�{�z-�s�{�z�}") ;
			System.out.println("�@�@�@�x�t�t�@�x�t�t") ;
			System.out.println("�@�@�@�|�r�}�@�|�r�} ") ;
			System.out.println("--------------------------------------------------------------------") ;
			System.out.println("�q���R�ۧڤ��A�o�쥼�Ӫ���V!(�߲z����)----------------------------1") ;
			System.out.println("�P�H�ɱ��Z�͡A��o�ۤv���߱�~(�Q�װ�)------------------------------2") ;
			System.out.println("�ݬݹL�h���ڡA��y�N�{�b����?(�d�ݾ��v�߲z���G)--------------------3") ;
			System.out.println("���ݦA���ۨ��A���z���s�Ʊ�C(�h�X�{��)---------------------------0") ;
			System.out.println("") ;
			System.out.print("�п�J�z�Q�ϥΪ��\��^^: ");
			op = keyboard.nextLine();
		
			System.out.print("");
			if(op.equals("1")) {
			
				String[] data = new String[4];
				double[] outcome = new double[9];
				String name = null;
			
				System.out.println("") ;
				System.out.println("�п�J�W��: (��[Enter]�i�ΦW�A������d�ݾ��v�������)") ;
				name = keyboard.nextLine();
			
				InputNeed basicData = new InputNeed();
				data = basicData.transfer();
			
				AnalyzeData moreData_analyzing = new AnalyzeData();
				moreData_analyzing.readQuestionFirst();
				outcome = moreData_analyzing.calculatingScore(data);
			
				print_SumClass output = new print_SumClass();
				output.print(outcome);
			
				ConnectWeb hyperlink = new ConnectWeb();
				hyperlink.sendWeb(output.compare());
			
				String[] dataStore = new String[1000];
				if(!name.equals("\n")) {
				
					Scanner textInput = null;
					String temp = null;
				
					try {
					
						textInput = new Scanner(new FileInputStream("personalList.txt"), "big5");
					
						int count = 0;
						while(textInput.hasNextLine()) {
						
							temp = textInput.nextLine();		
							if(temp.equals(name)) {
							
								break;
							}else {
							
								dataStore[count++] = temp; 
							}
						}
					
						dataStore[count++] = name;
						dataStore[count++] = moreData_analyzing.putData(outcome);
						dataStore[count++] = "================================================================================";
					//	textInput.close();
					
					
						PrintWriter textOutput = null;
						try {
						
							textOutput = new PrintWriter(new FileOutputStream("personalList.txt"));
							for(int i = 0; i < count; i++) {
							
								textOutput.println(dataStore[i]);
							}
							textOutput.close();
						}catch(FileNotFoundException e) {
						
							System.out.println("�ɮ��ɦW���~�Τ��򦹵{���P�@���|!!!");
							System.exit(0);
						//	e.printStackTrace();
						}
					}catch(FileNotFoundException e) {
					
						System.out.println("�ɮ��ɦW���~�Τ��򦹵{���P�@���|!!!");
						System.exit(0);
					//	e.printStackTrace();
					}
				}
			}else if(op.equals("2")) {
			
				ForumSetting text = new ForumSetting("DataBase.txt");
			}else if(op.equals("3")){
			
				String searchName = null;
				double[] thisOutcome = new double[9];
			
				System.out.print("�п�J�W��(�`�N!!!�����T�{����J�L): ");
				searchName = keyboard.nextLine();
				System.out.print("");
			
				String tmpData = null;
				Scanner textInput = new Scanner(System.in);
				boolean flag = false;
				try {
				
					textInput = new Scanner(new FileInputStream("personalList.txt"), "big5");
				
					while(textInput.hasNextLine()) {
					
						tmpData = textInput.nextLine();	
						if(tmpData.equals(searchName)) {
						
							for(int i = 0; i < thisOutcome.length; i++) {
							
								thisOutcome[i] = textInput.nextDouble();
							}
							flag = true;
							break;
						}
					}
					if(!flag) {
					
						System.out.println("");
						System.out.print("�F�ڡA�����N�S���o�Ӹ��QQ");
						System.exit(0);
					}else {
					
						print_SumClass lookData = new print_SumClass();
						lookData.print(thisOutcome);
					
						ConnectWeb lookLink = new ConnectWeb();
						lookLink.sendWeb(lookData.compare());
					}

				}catch(FileNotFoundException e) {
				
					System.out.println("�ɮ��ɦW���~�Τ��򦹵{���P�@���|!!!");
					System.exit(0);
				//	e.printStackTrace();
				}
			}else if(op.equals("99")){
			
				System.out.print("�п�J�s�@���{�����զW: ") ;
				password = keyboard.nextLine();
			
				if(password.equals("�n�u�D�n�u")) {
					
					System.out.println("");	
					System.out.print("�Q�A�o�{�FXDD�A�ӤH���ե\��}��") ;
					System.out.println("") ;
					
					System.out.println("***************�p�@��***************");
					System.out.println("���ѭn�M�DDemo�H") ;
					System.out.println("       ���") ;
					System.out.println("�@�@�]/*�s*�^") ;
					System.out.println(" �@ ��|�@>��(�š�_") ;
					System.out.println(" �@�� �|-(�ššš�") ;
					System.out.println(" �S���Y�A�ڤ��O�Ĥ@�խnDemo��") ;
					System.out.println("�@�@ <^����-�B��") ;
					System.out.println("�@��<_/�ššš� ��") ;
					System.out.println("�@�áááááá�") ;
					System.out.println("���p�G�L��Demo�ܧ֩O?") ;
					System.out.println("       ���") ;
					System.out.println("�@�@�]/*�s*�^") ;
					System.out.println("�@ ��|�@>��(�š�_") ;
					System.out.println("   �� �|-(�ššš�") ;
					System.out.println(" �@�áááááá�") ;
					System.out.println("�ڲq���|��~~") ;
					System.out.println("�@�@ <^����-�B��") ;
					System.out.println("�@��<_/�ššš� ��") ;
					System.out.println("�@�áááááá�") ;
					System.out.println("***************�p�@��***************");
					System.out.println("");
					
					boolean flag1 = false, flag2 = false, flag3 = false, flag4 = false, flag5 = false;
					while(true) {
						
						System.out.println("-----------�ӤH�\��  Demo-----------");
						System.out.println("��J�ݨD(D0642089�t�d)-------------1");
						System.out.println("���R���(D0611057�t�d)-------------2");
						System.out.println("��X�n�D(D0650028�t�d)-------------3");
						System.out.println("�ѦҸ��(D0642089                   ");
						System.out.println("         D0611057�t�d)-------------4");
						System.out.println("�]�m�Q��(D0611057�t�d)-------------5");
						System.out.println("����Demo---------------------------0");
						if(flag1 && flag2 && flag3 && flag4 && flag5) {
							
							System.out.println("�����\��------------------(20181227)");
						}
					
						System.out.print("�п�J�\��: ");
						op = keyboard.nextLine();
						System.out.println("") ;
					
						if(op.equals("1")) {
						
							InputNeed test_1 = new InputNeed();
							
							flag1 = true;
						}else if(op.equals("2")) {
						
							AnalyzeData test_2 = new AnalyzeData();
							String[] test_2_basicData = new String[4];
							double[] text_2_outcome = new double[9];
							
							System.out.println("----------------") ;
							System.out.println("�e�m����:");
							test_2_basicData[0] = "�k";
							test_2_basicData[1] = "�ѯ��y";
							test_2_basicData[2] = "������";
							test_2_basicData[3] = "A";
							System.out.println("�ʧO: " + test_2_basicData[0] + 
											"\n�P�y: " + test_2_basicData[1] + 
											"\n�ʦV: " + test_2_basicData[2] + 
											"\n�嫬: " + test_2_basicData[3]);
							System.out.println("----------------") ;
							System.out.println("");
						
							test_2.readQuestionFirst();
							text_2_outcome = test_2.calculatingScore(test_2_basicData);
							
							System.out.println("") ;
							System.out.println("-------------------------") ;
							System.out.println("���R���G:");
							for(int i = 1; i < text_2_outcome.length; i++) {
							
								System.out.println("��" + i + "��: " + text_2_outcome[i]);
							}
							System.out.println("��9��: " + text_2_outcome[0]);
							System.out.println("-------------------------") ;
							
							flag2 = true;
						}else if(op.equals("3")) {
						
							print_SumClass test_3 = new print_SumClass();
							double[] text_3_predata = new double[9];
							
							text_3_predata[0] = 90;
							for(int i = 1; i < text_3_predata.length; i++) {
								text_3_predata[i] = 60;
							}
							
							System.out.println("----------------") ;
							System.out.println("�e�m����:(���R���G)");
							for(int i = 1; i < text_3_predata.length; i++) {
							
								System.out.println("��" + i + "��: " + text_3_predata[i]);
							}
							System.out.println("��9��: " + text_3_predata[0]);
							System.out.println("----------------") ;
							System.out.println("") ;
							
							test_3.print(text_3_predata);
							
							flag3 = true;
						}else if(op.equals("4")) {
						
							ConnectWeb test_4 = new ConnectWeb();
						
							System.out.print("�п�J�Ʀr(1~7): ");
							op = keyboard.nextLine();
						
							if(op.equals("1")) {
							
								test_4.sendWeb(1);
							}else if(op.equals("2")) {
							
								test_4.sendWeb(2);
							}else if(op.equals("3")) {
							
								test_4.sendWeb(3);
							}else if(op.equals("4")) {
							
								test_4.sendWeb(4);
							}else if(op.equals("5")) {
							
								test_4.sendWeb(5);
							}else if(op.equals("6")) {
							
								test_4.sendWeb(6);
							}else if(op.equals("7")) {
									
								test_4.sendWeb(7);
							}else {
							
								System.out.println("��J���~�A�פ�{��!!!") ;
								System.exit(0);
							}
							
							flag4 = true;
						}else if(op.equals("5")) {
						
							ForumSetting text_5 = new ForumSetting();
							
							flag5 = true;
						}else if(op.equals("0")){
							
							File file = new File("DataBase_Test.txt");
							if(file.exists()){
				
								file.delete();
							}	

							System.out.print("����Test_Case�A�����{��") ;
							System.exit(0);							
						}else if(op.equals("20181227")) {
						
							String ans = null;
							System.out.println("���|�@��[�n�u�ɽ�]����[�ӱ��}�o]������(���^��p�g): ");
							ans = keyboard.nextLine();
						
							if(ans.equals("scrum") || ans.equals("extreme programming") || ans.equals("extremeprogramming") || ans.equals("kanba")) {
							
								System.out.println("") ;
								System.out.println("����XDDD") ;
								System.out.println("**********************************************************************");
								System.out.println("[�n��u�{�ɽ�]�׽Ҵ���: 2018��") ;
								System.out.println("[�n��u�{�ɽ�]�½ҦѮv: �\�h�� �U�z�б�  (�{�Ҥj��)") ;
								System.out.println("[�n��u�{�ɽ�]�n�����: �L�i�� �Ʊб�    (�����j��)") ;
								System.out.println("[�n��u�{�ɽ�]�w���n��: �_���i �դh      (�굦�|)") ;
								System.out.println("") ;
								System.out.println("[�n�u���n�u]��GitHub����: https://github.com/karasu10250/BaseProject-Cpp");
								System.out.println("**********************************************************************");
							}else {
								
								System.out.println("") ;
								System.out.print("�A�S���{�uť����A�u�������{���F!!!");
								System.exit(0);
							}	
						}else {	
							
							System.out.println("");	
							System.out.println("��J���~�A�ЦA����J!!!") ;
						}	

						System.out.println("");		
					}	
				}else{	
				
					System.out.println("");	
					System.out.print("�u�i���A��J���~�A�פ�{��>_") ;
					System.exit(0);
				}
			}else if(op.equals("hjhsu")) {
				
				System.out.print("�п�J�ӦѮv��¾��: ") ;
				password = keyboard.nextLine();
			
				if(password.equals("�б�")) {
					
					System.out.println("");	
					System.out.println("                      _o�no�uo_");
					System.out.println("                      o8888888o");
					System.out.println("                      88\" . \"88");
					System.out.println("                      (| -_- |)");
					System.out.println("                      0\\  =  /0");
					System.out.println("                    ___/`---'\\___");
					System.out.println("                  .' \\\\|     |# '.");
					System.out.println("                 / \\\\|||  :  |||# \\");
					System.out.println("                / _||||| -:- |||||- \\");
					System.out.println("               |   | \\\\\\  -  #/ |   |");
					System.out.println("               | \\_|  ''\\---/''  |_/ |");
					System.out.println("               \\  .-\\__  '-'  ___/-. /");
					System.out.println("             ___'. .'  /--.--\\  `. .'___");
					System.out.println("          .\"\" '<  `.___\\_<|>_/___.' >' \"\".");
					System.out.println("         | | :  `- \\`.;`\\ _ /`;.`/ - ` : | |");
					System.out.println("         \\  \\ `_.   \\_ __\\ /__ _/   .-` /  /");
					System.out.println("     =====`-.____`.___ \\_____/___.-`___.-'=====");
					System.out.println("                       `=---='");
					System.out.println("     ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
					System.out.println("     �򯪫O��                   �Ǵ�High pass!!!");
				
					System.out.println("");
					System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
					System.out.println("���u�W��") ;
					System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
					System.out.println("D0642089_�����T:");
					System.out.println("1. ���g���ջP�ק���է@�~");
					System.out.println("2. �ѻP�Q�ױM�D���e");
					System.out.println("3. �t�d��J�ݨD�ѦҸ�Ƶ�2���\��");
					System.out.println("4. ��X�M�D�{�����ˬd + ���ѷN��");
					System.out.println("5. ����Coding �зǷN��");
				
					System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
					System.out.println("D0611057_���q��:");
					System.out.println("1. ���g���ջP�ק���է@�~");
					System.out.println("2. �ѻP�Q�ױM�D���e");
					System.out.println("3. �t�d�]�m�Q�סB���R�ݨD�P�ѦҸ�Ƶ�3���\��");
					System.out.println("4. �t�d�ΦX�M�D�{��(main class���g + �ק�O�H���{��XDD)");
					System.out.println("5. �s�@Coding �з� + ���ѷN��");
				
					System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
					System.out.println("D0650028_������:");
					System.out.println("1. �ѻP�Q�ױM�D���e");
					System.out.println("2. �t�d��X�ݨD��1���\��");
				
					System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
					System.out.println("D0649710_�d�}�ʤ}�x:");
					System.out.println("1. �ѻP�Q�ױM�D���e");	
					
					System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
					System.out.println("Dr. Hwai-Jung Hsu");
					System.out.println("[�s�X]���ѫ�ĳ!!!");	
					System.out.println("");	
					
					System.out.print("�������u�W��i��");	
					System.exit(0);
				}else {
					
					System.out.println("");	
					System.out.print("������!!!��J���~") ;
					System.exit(0);
				}
			}else if(op.equals("clear")){
				
				PrintWriter textOutput = null;
				try {
			
					textOutput = new PrintWriter(new FileOutputStream("DataBase.txt"));
			
					textOutput.println("==============================�ɱ��Z�͡A�d�U��m================================");
			
					textOutput.close();
				}catch(FileNotFoundException e) {
			
					System.out.println("�ɮ��ɦW���~�Τ��򦹵{���P�@���|!!!");
					System.exit(0);
				//	e.printStackTrace();
				}	
				
				try {
			
					textOutput = new PrintWriter(new FileOutputStream("personalList.txt"));
			

					textOutput.println("==============================���W��s�A�����L��================================");
			
					textOutput.close();
				}catch(FileNotFoundException e) {
			
					System.out.println("�ɮ��ɦW���~�Τ��򦹵{���P�@���|!!!");
					System.exit(0);
				//	e.printStackTrace();
				}	
				
				System.out.println("");	
				System.out.print("�ɮײM��") ;
			}else if(op.equals("-1")){
				
				System.out.println("**************************************************");	
				System.out.println("�Ϯק�y��: https://gist.github.com/edokeh/7580064") ;
				System.out.println("**************************************************");	
			}else if(op.equals("0")){
				
				System.out.println("---------------------------------------------------------------------------------") ;
				System.out.print("�h�X�{��") ;
				System.exit(0);
			}else{
				
				System.out.println("");	
				System.out.print("��J���~�A���s��J!!!") ;
			}	
			
			System.out.println("") ;
			System.out.println("---------------------------------------------------------------------------------");
		//	keyboard.close();
		}
	}
}
