class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {       
        // 1. num1 ~ num2까지 자르기
        // 2. 자른 배열을 임시 배열에 넣기
        int[] cut_array = new int[num2 - num1 + 1];
        
        int j = 0;
        for(int i = num1; i <= num2; i++) {
            cut_array[j] = numbers[i];
            j++;
        }
        return cut_array;
    }
}