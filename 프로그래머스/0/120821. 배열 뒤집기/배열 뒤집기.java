class Solution {
    public int[] solution(int[] num_list) {       		
		int[] num_convert = new int[num_list.length];  // num_list와 같은 크기의 배열 선언
		
		for (int i = 0; i < num_list.length; i++) {
			num_convert[i] = num_list[ (num_list.length -1) - i ]; 
        }
        return num_convert;
    }
}