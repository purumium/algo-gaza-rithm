class Solution {
    public int solution(int n) {
          
        int total_pizza = 0;
        
        if( n < 7 ) {
            total_pizza = 1; 
        } else {
            total_pizza += n / 7;  // n = 7이라면, 피자 1판으로 모두 먹음
            
            if ( n % 7 != 0 ) {   // n = 7이라면, 모두 나눠 먹었고,
                                  // n != 7이라면, 7조각으로도 나누고도
	                                // 못 먹은 사람 1명이 있음
                total_pizza += 1; // 7개로 나누고도 못먹은 사람 있으면 피자 1개 증가
            }
        }
        return total_pizza;
    }
}