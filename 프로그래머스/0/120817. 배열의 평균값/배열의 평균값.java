class Solution {
    public double solution(int[] numbers) {
        double sum = 0;
        
        // 배열 내의 전체 합계
        for(int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        
        // 평균값
        double avg = sum / numbers.length;
                    
        return avg;
    }
}