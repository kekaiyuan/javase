import java.util.Arrays;
/*
ð�������ѡ�����򣬴�С����
*/

public class ArraySort{
	
	public static void main(String[] args){
		//��������
		int[] array = new int[]{4,1,7,2,9,3,5,8,6};

		//ð������
		/*
		for(int i=0;i<array.length;i++){
			for(int j = 0;j<array.length-1-i;j++){
				if(array[j]>array[j+1]){
					int tmp = array[j];
					array[j] = array[j+1];
					array[j+1] = tmp;
				}
			}
		}
		*/
		
		//ѡ������
		/*
		for(int i = 0;i<array.length;i++){
			for(int j = i+1;j<array.length;j++ ){
				if(array[i]>array[j]){
					int tmp = array[i];
					array[i] = array[j];
					array[j] = tmp;
				}
			}
		}
		*/
		
		//���ù������������
		Arrays.sort(array);
		
		for(int i = 0;i<array.length;i++){
			System.out.print(array[i]+"\t");
		}	
	}
}