/* 
 * 	�ҵ{�W��:	�n��u�{�ɽ�
 * 	�½ҦѮv:	�\�h�� �դh
 * 	�p�ղզW:	�n�u�D�n�u
 *	�M�D�W��:	�߲z���R�j�v
 *	�\��W��:	��X�n�D
 *	�ǥ;Ǹ�:	D0650028
 *	�ǥͩm�W:	������
 *
 *	�̫�ק���:	2018.12.29
 */
package function;

public class print_SumClass {
	
	private double sum1;
	private double sum2;
	private double sum3;
	
	public print_SumClass(){
		
		sum1 = 0;
		sum2 = 0;
		sum3 = 0;
	}
	
	
	public double getSum1() {
		return sum1;
	}
	
	public void setSum1(double sum1) {
		this.sum1 = sum1;
	}

	
	public double getSum2() {
		return sum2;
	}

	public void setSum2(double sum2) {
		this.sum2 = sum2;
	}

	
	public double getSum3() {
		return sum3;
	}

	public void setSum3(float sum3) {
		this.sum3 = sum3;
	}

    
	
	public void totalSum(double[] score){
		
		sum1 = score[8] + score[0] + score[1];
		sum2 = score[2] + score[3] + score[4];
		sum3 = score[5] + score[6] + score[7];
	}
	
	public void printEach(double[] score){
		
		System.out.printf(String.format("%8s","I : ") + String.format("%2f",score[1]) + String.format("%8s"," II : ") + String.format("%2f",score[2]) + String.format("%8s"," III : ") + String.format("%2f",score[3]) + "\n");
		System.out.printf(String.format("%8s","IV : ") + String.format("%2f",score[4]) + String.format("%8s"," V : ") + String.format("%2f",score[5]) + String.format("%8s"," VI : ") + String.format("%2f",score[6]) + "\n");
		System.out.printf(String.format("%8s","VII : ") + String.format("%2f",score[7]) + String.format("%8s"," VIII : ") + String.format("%2f",score[8]) + String.format("%8s"," IX : ") + String.format("%2f",score[0]) + "\n");
	}
	

	public int compare(){
		
		if(sum1 > sum2 && sum1 > sum3){
			
			System.out.println("�z�ݩ��ʥD�ɫ��A�R�n�O�q�B�зǡA��Ƴ��w�H�ۤv���g�笰�X�ʤO�A������");
			System.out.println("�`�N�A�b��ʤW���ɹL�����g�礣�@�w�A�Ω�{�b�����p�A�n�A�ɰ��X���ܡA�H");
			System.out.println("�קK�y�����z�Q�����G�C");
			
			return 1;
		}
		else if(sum2 > sum1 && sum2 > sum3){
			
			System.out.println("�z�ݩ�P���D�ɫ��A�߷R�����B�R�n���N�A�H�P�����X�ʤO�A�H�߬����ߡA����");
			System.out.println("���`�N����ӹL�P���ΨơA���z�ʪ��B�Ʃ����|���h�O�D���ȧP�_����O�C");
			
			return 2;
		}
		else if(sum3 > sum1 && sum3 > sum2){
			
			System.out.println("�z�ݩ��ҥD�ɫ��A�R�n���ѥB�߷R�h�èƪ��óz�L��ҸѨM���D�A�������`�N");
			System.out.println("����ӹL��z�ʦӥ��h�P�ʡA�h�èƪ��]���A��A�_�h�b��ڤW�i��|���x���C");
			
			return 3;
		}
		else if(sum1 == sum2 && sum1 != sum3){
			
			System.out.println("�z�P�ɾ֦��h���ݩ�");
			System.out.println("�z�ݩ��ʥD�ɫ��A�R�n�O�q�B�зǡA��Ƴ��w�H�ۤv���g�笰�X�ʤO�A������");
			System.out.println("�`�N�A�b��ʤW���ɹL�����g�礣�@�w�A�Ω�{�b�����p�A�n�A�ɰ��X���ܡA�H");
			System.out.println("�קK�y�����z�Q�����G�C");
			System.out.println("------------------------");
			System.out.println("�z�ݩ�P���D�ɫ��A�߷R�����B�R�n���N�A�H�P�����X�ʤO�A�H�߬����ߡA����");
			System.out.println("���`�N����ӹL�P���ΨơA���z�ʪ��B�Ʃ����|���h�O�D���ȧP�_����O�C");
			
			return 4;
		}
		else if(sum1 == sum3 && sum1 != sum2){
			
			System.out.println("�z�P�ɾ֦��h���ݩ�");
			System.out.println("�z�ݩ��ʥD�ɫ��A�R�n�O�q�B�зǡA��Ƴ��w�H�ۤv���g�笰�X�ʤO�A������");
			System.out.println("�`�N�A�b��ʤW���ɹL�����g�礣�@�w�A�Ω�{�b�����p�A�n�A�ɰ��X���ܡA�H");
			System.out.println("�קK�y�����z�Q�����G�C");
			System.out.println("------------------------");
			System.out.println("�z�ݩ��ҥD�ɫ��A�R�n���ѥB�߷R�h�èƪ��óz�L��ҸѨM���D�A�������`�N");
			System.out.println("����ӹL��z�ʦӥ��h�P�ʡA�h�èƪ��]���A��A�_�h�b��ڤW�i��|���x���C");
			
			return 5;
		}
		else if(sum2 == sum3 && sum2 != sum1){
			
			System.out.println("�z�P�ɾ֦��h���ݩ�");
			System.out.println("�z�ݩ�P���D�ɫ��A�߷R�����B�R�n���N�A�H�P�����X�ʤO�A�H�߬����ߡA����");
			System.out.println("���`�N����ӹL�P���ΨơA���z�ʪ��B�Ʃ����|���h�O�D���ȧP�_����O�C");
			System.out.println("------------------------");
			System.out.println("�z�ݩ��ʥD�ɫ��A�R�n�O�q�B�зǡA��Ƴ��w�H�ۤv���g�笰�X�ʤO�A������");
			System.out.println("�`�N�A�b��ʤW���ɹL�����g�礣�@�w�A�Ω�{�b�����p�A�n�A�ɰ��X���ܡA�H");
			System.out.println("�קK�y�����z�Q�����G�C");
			
			return 6;
		}
		else if(sum1 == sum2 && sum2 == sum3){
			
			System.out.println("�z�P�ɾ֦��h���ݩ�");
			System.out.println("�z�ݩ��ҥD�ɫ��A�R�n���ѥB�߷R�h�èƪ��óz�L��ҸѨM���D�A�������`�N");
			System.out.println("����ӹL��z�ʦӥ��h�P�ʡA�h�èƪ��]���A��A�_�h�b��ڤW�i��|���x���C");
			System.out.println("------------------------");
			System.out.println("�z�ݩ�P���D�ɫ��A�߷R�����B�R�n���N�A�H�P�����X�ʤO�A�H�߬����ߡA����");
			System.out.println("���`�N����ӹL�P���ΨơA���z�ʪ��B�Ʃ����|���h�O�D���ȧP�_����O�C");
			System.out.println("------------------------");
			System.out.println("�z�ݩ��ʥD�ɫ��A�R�n�O�q�B�зǡA��Ƴ��w�H�ۤv���g�笰�X�ʤO�A������");
			System.out.println("�`�N�A�b��ʤW���ɹL�����g�礣�@�w�A�Ω�{�b�����p�A�n�A�ɰ��X���ܡA�H");
			System.out.println("�קK�y�����z�Q�����G�C");
			
			return 7;
		}else {
			return 0;
		}
	}
	
	
	
	
	public String toString()
	{
		return "�Ĥ@�ϡ]VII.IX.I�^" + String.format("%10s","�`�� : ") + sum1 + "  (��ʥD��)\n" +
			   "�ĤG�ϡ]II.III.IV�^" + String.format("%6s","�`�� : ") + sum2 + "  (�P���D��)\n" +
			   "�ĤT�ϡ]V.VI.VII�^" + String.format("%10s","�`�� : ") + sum3 + "  (��ҥD��)\n";
	}
	
	public void print(double[] score) {
		System.out.println("---------------------------------------------------------------------------------") ;
		System.out.println("====================================���絲�G=====================================");
		printEach(score);
		totalSum(score);
		System.out.print(toString());
		
		System.out.println("======================================��ĳ=======================================");
		compare();
		
		System.out.println("====================================�����̾�=====================================");
		

		System.out.println("[�ʧO ]\r\n" + "����N�q\r\n" + "[�ʦV ]\r\n" + "����N�q\r\n" + "[�嫬 ]\r\n" + "A(���� ) II.IV");
		System.out.println("B(�w�R ) I.VIII\r\n" + "AB(���� ) IV.V.VI.IX\r\n" + "O(���{ ) III.VII");
		System.out.println("[�P�y ]\r\n" + "I : ���� .��l\r\n" + "II : ���~ .�ѯ�\r\n" + "III : ���l\r\n" + "IV : �B�k");
		System.out.println("V : �]�~\r\n" + "VI : ����.����\r\n" + "VII : �d��\r\n" + "VIII : ����\r\n" + "XI : �g��");
		System.out.println("------------------------");
		System.out.println("VIII.IX.I �P��");
		System.out.println("II.III.IV �P��");
		System.out.println("V.VI.VII  �P��");
	}
	
}
