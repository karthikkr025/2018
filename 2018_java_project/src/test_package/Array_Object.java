package test_package;

public class Array_Object {
	public static void main(String[] args) {
		
		Object array[][] = new Object[2][3];
		
	array[0][0]="Karthik";
	array[0][1]=20.50;
	array[0][2]=560056;
	
	array[1][0]="ibm";
	array[1][1]=false;
	array[1][2]=560056;
	
	for(int i=0;i<array.length;i++){
		for(int j=0;j<array[0].length;j++){
			System.out.println(array[i][j]);
		}
	}
}

}
