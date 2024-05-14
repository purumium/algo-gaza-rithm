class Solution {
    public int solution(int num1, int num2) {
        double divide =  (double) num1 / num2 ;  // 소수점까지 출력
        int result = (int)( ( divide * 1000 ) );
        return result;
    }
}