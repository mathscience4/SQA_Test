/* 
 * 	�ҵ{�W��:	�n��u�{�ɽ�
 * 	�½ҦѮv:	�\�h�� �դh
 * 	�p�ղզW:	�n�u�D�n�u
 *	�M�D�W��:	�߲z���R�j�v
 *	�\��W��:	��J�n�D
 *	�ǥ;Ǹ�:	D0642089
 *	�ǥͩm�W:	�����T
 *
 *	�̫�ק���:	2018.12.29
 */
package function;
import java.util.Scanner ;

public class InputNeed {

		String gender ; //�ʧO
		String constellation ; //�P�y
		String orientation ; //�ʦV
		String bloodtype ; //�嫬
		
		int flag = 0 ;
	
		public InputNeed(){
		
			Scanner sf = new Scanner(System.in) ;
			System.out.println("�п�J�ʧO(�kor�k): ") ;
			gender = sf.nextLine() ;
		
			
			if(!gender.equals("�k") && !gender.equals("�k")){
				System.out.println("��J�ʧO���~") ;
				System.exit(1) ;
			}
			
			String[] star = {"���~�y" , "�g��y" , "���l�y" , "��l�y" , "�����y" , "�ѯ��y" , "�d�Ϯy" , "���ɮy" , "�B�k�y" , "���~�y" , "�����y" , "���Ȯy"} ;
			
			System.out.println("�п�J�P�y(Ex:���~�y�B�g��y�B���l�y�B��l�y�B�����y�B�ѯ��y�B�d�Ϯy�B���ɮy�B�B�k�y�B���~�y�B�����y�B���Ȯy): ") ;
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
				System.out.println("��J�P�y���~") ;
				System.exit(1) ;
			}
			/*if(!constellation.equals(star[0]) && !constellation.equals(star[1]) && !constellation.equals(star[2])&&
			   !constellation.equals(star[3]) && !constellation.equals(star[4]) && !constellation.equals(star[5])&&
			   !constellation.equals(star[6]) && !constellation.equals(star[7]) && !constellation.equals(star[8])&&
			   !constellation.equals(star[9]) && !constellation.equals(star[10]) && !constellation.equals(star[11]))
			{
				System.out.println("��J�P�y���~") ;
				System.exit(1) ;
			}*/
			
			System.out.println("�п�J�ʦV(������or�P����): ") ;
			orientation = sf.nextLine() ;
			
			if(!orientation.equals("������") && !orientation.equals("�P����")){
				System.out.println("��J�ʦV���~") ;
				System.exit(1) ;
			}
			
			System.out.println("�п�J�嫬(A,B,AB,O): ") ;
			bloodtype = sf.nextLine() ;
			
			if(!bloodtype.equals("A") && !bloodtype.equals("B") && !bloodtype.equals("AB") && !bloodtype.equals("O")){
				System.out.println("��J�嫬���~") ;
				System.exit(1) ;
			}
			
			System.out.println("") ;
			System.out.println("----------------") ;
			System.out.println("�򥻸��:") ;
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
		
		return "�ʧO: " + gender + "\n�P�y: " + constellation + "\n�ʦV: " + orientation + "\n�嫬: " + bloodtype;
	}

}
