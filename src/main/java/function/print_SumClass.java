/* 
 * 	課程名稱:	軟體工程導論
 * 	授課老師:	許懷中 博士
 * 	小組組名:	軟工非軟工
 *	專題名稱:	心理分析大師
 *	功能名稱:	輸出要求
 *	學生學號:	D0650028
 *	學生姓名:	曾偉翔
 *
 *	最後修改日期:	2018.12.29
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
			
			System.out.println("您屬於行動主導型，愛好力量、標準，行事喜歡以自己的經驗為驅動力，但必須");
			System.out.println("注意，在行動上有時過往的經驗不一定適用於現在的情況，要適時做出應變，以");
			System.out.println("避免造成不理想的結果。");
			
			return 1;
		}
		else if(sum2 > sum1 && sum2 > sum3){
			
			System.out.println("您屬於感情主導型，喜愛給予、愛好成就，以感情為驅動力，以心為中心，但必");
			System.out.println("須注意不能太過感情用事，不理性的處事往往會失去是非價值判斷的能力。");
			
			return 2;
		}
		else if(sum3 > sum1 && sum3 > sum2){
			
			System.out.println("您屬於思考主導型，愛好知識且喜愛懷疑事物並透過思考解決問題，但必須注意");
			System.out.println("不能太過於理性而失去感性，懷疑事物也須適當，否則在交際上可能會有困難。");
			
			return 3;
		}
		else if(sum1 == sum2 && sum1 != sum3){
			
			System.out.println("您同時擁有多種屬性");
			System.out.println("您屬於行動主導型，愛好力量、標準，行事喜歡以自己的經驗為驅動力，但必須");
			System.out.println("注意，在行動上有時過往的經驗不一定適用於現在的情況，要適時做出應變，以");
			System.out.println("避免造成不理想的結果。");
			System.out.println("------------------------");
			System.out.println("您屬於感情主導型，喜愛給予、愛好成就，以感情為驅動力，以心為中心，但必");
			System.out.println("須注意不能太過感情用事，不理性的處事往往會失去是非價值判斷的能力。");
			
			return 4;
		}
		else if(sum1 == sum3 && sum1 != sum2){
			
			System.out.println("您同時擁有多種屬性");
			System.out.println("您屬於行動主導型，愛好力量、標準，行事喜歡以自己的經驗為驅動力，但必須");
			System.out.println("注意，在行動上有時過往的經驗不一定適用於現在的情況，要適時做出應變，以");
			System.out.println("避免造成不理想的結果。");
			System.out.println("------------------------");
			System.out.println("您屬於思考主導型，愛好知識且喜愛懷疑事物並透過思考解決問題，但必須注意");
			System.out.println("不能太過於理性而失去感性，懷疑事物也須適當，否則在交際上可能會有困難。");
			
			return 5;
		}
		else if(sum2 == sum3 && sum2 != sum1){
			
			System.out.println("您同時擁有多種屬性");
			System.out.println("您屬於感情主導型，喜愛給予、愛好成就，以感情為驅動力，以心為中心，但必");
			System.out.println("須注意不能太過感情用事，不理性的處事往往會失去是非價值判斷的能力。");
			System.out.println("------------------------");
			System.out.println("您屬於行動主導型，愛好力量、標準，行事喜歡以自己的經驗為驅動力，但必須");
			System.out.println("注意，在行動上有時過往的經驗不一定適用於現在的情況，要適時做出應變，以");
			System.out.println("避免造成不理想的結果。");
			
			return 6;
		}
		else if(sum1 == sum2 && sum2 == sum3){
			
			System.out.println("您同時擁有多種屬性");
			System.out.println("您屬於思考主導型，愛好知識且喜愛懷疑事物並透過思考解決問題，但必須注意");
			System.out.println("不能太過於理性而失去感性，懷疑事物也須適當，否則在交際上可能會有困難。");
			System.out.println("------------------------");
			System.out.println("您屬於感情主導型，喜愛給予、愛好成就，以感情為驅動力，以心為中心，但必");
			System.out.println("須注意不能太過感情用事，不理性的處事往往會失去是非價值判斷的能力。");
			System.out.println("------------------------");
			System.out.println("您屬於行動主導型，愛好力量、標準，行事喜歡以自己的經驗為驅動力，但必須");
			System.out.println("注意，在行動上有時過往的經驗不一定適用於現在的情況，要適時做出應變，以");
			System.out.println("避免造成不理想的結果。");
			
			return 7;
		}else {
			return 0;
		}
	}
	
	
	
	
	public String toString()
	{
		return "第一區（VII.IX.I）" + String.format("%10s","總分 : ") + sum1 + "  (行動主導)\n" +
			   "第二區（II.III.IV）" + String.format("%6s","總分 : ") + sum2 + "  (感情主導)\n" +
			   "第三區（V.VI.VII）" + String.format("%10s","總分 : ") + sum3 + "  (思考主導)\n";
	}
	
	public void print(double[] score) {
		System.out.println("---------------------------------------------------------------------------------") ;
		System.out.println("====================================測驗結果=====================================");
		printEach(score);
		totalSum(score);
		System.out.print(toString());
		
		System.out.println("======================================建議=======================================");
		compare();
		
		System.out.println("====================================評分依據=====================================");
		

		System.out.println("[性別 ]\r\n" + "不具意義\r\n" + "[性向 ]\r\n" + "不具意義\r\n" + "[血型 ]\r\n" + "A(活潑 ) II.IV");
		System.out.println("B(安靜 ) I.VIII\r\n" + "AB(興奮 ) IV.V.VI.IX\r\n" + "O(抑鬱 ) III.VII");
		System.out.println("[星座 ]\r\n" + "I : 天蠍 .獅子\r\n" + "II : 水瓶 .天秤\r\n" + "III : 雙子\r\n" + "IV : 處女");
		System.out.println("V : 魔羯\r\n" + "VI : 巨蟹.雙魚\r\n" + "VII : 牡羊\r\n" + "VIII : 金牛\r\n" + "XI : 射手");
		System.out.println("------------------------");
		System.out.println("VIII.IX.I 同區");
		System.out.println("II.III.IV 同區");
		System.out.println("V.VI.VII  同區");
	}
	
}
