package test_package;

//2 Dimensional Arrey
public class Array_Class3 {
	public static void main(String[] args) {
		String str[][] = new String[2][3]; 
		str[0][0] ="Mumbai";
		str[0][1] ="Calcatta";
		str[0][2] ="Pune";
		
		str[1][0] ="Bangalore";
		str[1][1] ="Chennai";
		str[1][2] ="Coimbatore";
		
//to get size of row and Column		
		int rownum = str.length;
		int colnum =str[0].length;
		
		System.out.println(rownum);
		System.out.println(colnum);
		
		for(int i=0;i<str.length;i++){
			for(int j=0;j<str[0].length;j++) {
				System.out.println(str[i][j]);
				
			}
		}
	
	}

}



//Assignment
//Mumbai        Mumbai       Pune
//Bangalore     Calcutta     Calcutta
//Calcutta      Pune         Mumbai
//Chennai       Bangalore    Coimbatore
//Pune          Chennai      Chennai
//Coimbatore    Coimbatore   Bangalore
