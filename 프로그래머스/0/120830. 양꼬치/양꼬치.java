class Solution {
    public int solution(int n, int k) {               
        int service = n / 10;  // 10인분마다 음료 서비스 1개씩
        int totalSum = ( n * 12000 ) + ( k - service ) * 2000;   
        
        return totalSum;
    }
}