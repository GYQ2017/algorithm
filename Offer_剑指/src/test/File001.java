/** 2018-09-18
 * File001:找出数组中重复的数字
 * 在一个长度为n的数组里的所有数字都在0~n-1的范围内，请找出数组中
 * 任意一个重复的数字
 */
package test;

public class File001 {
	public static void main(String []args) {
//		int array[] = {2,3,1,0,2,5,3};
		int array[] = {2,3,1,0,4,5,6};
		for(int i=0;i<array.length;i++){
			while(array[i] != i){
				if(array[i]==array[array[i]]){
					System.out.println(array[i]);
					return;
				}
				int swap = array[i];
				array[i] = array[swap];
				array[swap] = swap;
			}
		}
		System.out.println("No number");
		return;
    }
}
