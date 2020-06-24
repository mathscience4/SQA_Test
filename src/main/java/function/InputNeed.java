/* 
 * 	課程名稱:	軟體工程導論
 * 	授課老師:	許懷中 博士
 * 	小組組名:	軟工非軟工
 *	專題名稱:	心理分析大師
 *	功能名稱:	輸入要求
 *	學生學號:	D0642089
 *	學生姓名:	黃丞文三
 *
 *	最後修改日期:	2018.12.29
 */
package function;
import java.util.Scanner ;

public class InputNeed {

		String gender ; //性別
		String constellation ; //星座
		String orientation ; //性向
		String bloodtype ; //血型
		
		int flag = 0 ;
	
		public InputNeed(){
		
			Scanner sf = new Scanner(System.in) ;
			System.out.println("請輸入性別(男or女): ") ;
			gender = sf.nextLine() ;
		
			
			if(!gender.equals("男") && !gender.equals("女")){
				System.out.println("輸入性別有誤") ;
				System.exit(1) ;
			}
			
			String[] star = {"水瓶座" , "射手座" , "雙子座" , "獅子座" , "金牛座" , "天秤座" , "牡羊座" , "巨蟹座" , "處女座" , "摩羯座" , "雙魚座" , "天蠍座"} ;
			
			System.out.println("請輸入星座(Ex:水瓶座、射手座、雙子座、獅子座、金牛座、天秤座、牡羊座、巨蟹座、處女座、摩羯座、雙魚座、天蠍座): ") ;
			constellation = sf.nextLine() ;
			
			for(int i=0 ; i<star.length ; i++){
				
				flag = 0 ;
				
				if(!constellation.equals(star[i])){
					flag = -1 ;
					continue ;
				}
				else{
					break ;
				}
			}
			
			if(flag == -1){
				System.out.println("輸入星座有誤") ;
				System.exit(1) ;
			}
			/*if(!constellation.equals(star[0]) && !constellation.equals(star[1]) && !constellation.equals(star[2])&&
			   !constellation.equals(star[3]) && !constellation.equals(star[4]) && !constellation.equals(star[5])&&
			   !constellation.equals(star[6]) && !constellation.equals(star[7]) && !constellation.equals(star[8])&&
			   !constellation.equals(star[9]) && !constellation.equals(star[10]) && !constellation.equals(star[11]))
			{
				System.out.println("輸入星座有誤") ;
				System.exit(1) ;
			}*/
			
			System.out.println("請輸入性向(異性戀or同性戀): ") ;
			orientation = sf.nextLine() ;
			
			if(!orientation.equals("異性戀") && !orientation.equals("同性戀")){
				System.out.println("輸入性向有誤") ;
				System.exit(1) ;
			}
			
			System.out.println("請輸入血型(A,B,AB,O): ") ;
			bloodtype = sf.nextLine() ;
			
			if(!bloodtype.equals("A") && !bloodtype.equals("B") && !bloodtype.equals("AB") && !bloodtype.equals("O")){
				System.out.println("輸入血型有誤") ;
				System.exit(1) ;
			}
			
			System.out.println("") ;
			System.out.println("----------------") ;
			System.out.println("基本資料:") ;
			System.out.println(this.toString()) ;
			System.out.println("----------------") ;
			System.out.println("") ;
		}
		
	public String[] transfer() {
		
		String[] data = new String[4];
		
		for(int i = 0; i < data.length; i++) {
			
			data[i] = new String();
		}
		
		data[0] = gender;
		data[1] = constellation;
		data[2] = orientation;
		data[3] = bloodtype;
		
		return data;
	}
	
	public String toString() {
		
		return "性別: " + gender + "\n星座: " + constellation + "\n性向: " + orientation + "\n血型: " + bloodtype;
	}

}
