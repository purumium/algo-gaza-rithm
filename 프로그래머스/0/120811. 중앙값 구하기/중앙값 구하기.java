import java.util.Arrays;

class Solution {
    public int solution(int[] array) {        
        // 1. 순서대로 정렬
        // 2. 중앙값 : ( 배열의 길이 / 2 ) 
        
        Arrays.sort(array);
        
        int mid_num = array.length / 2;
        int result = array[mid_num];
        
        return result;        
    }
}