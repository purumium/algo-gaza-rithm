class Solution {
    public int[] solution(int n) {
                
        int[] odd_array = null;  // n이 짝수냐 홀수냐에 따라 배열의 크기가 다름
        int idx = 0;  // 임시 배열의 idx

        if( n % 2 == 0 ) { // n이 짝수
           odd_array = new int[n/2];  // 홀수를 담을 배열 생성

            for(int i = 1; i <= n; i += 2) {
                odd_array[idx] = i;
                idx++;
            }
        } 
        else { // n이 홀수
           odd_array = new int[ (n + 1) / 2 ]; // 홀수를 담을 배열 생성

            for(int i = 1; i <= n; i += 2) {
                odd_array[idx] = i;
                idx++;
            }
        } 
        return odd_array;
    }
}

//  1. 정수 n : 홀수인지 짝수인지를 확인
//      - n = 홀수 : 배열 방에 (n + 1) / 2개만큼 홀수가 생성
//      - n = 짝수 : 배열 방에  n / 2 개만큼의 홀수를 생성
//  2. 임시 배열에 넣기
//      - n이 짝수인지 짝수인지에 따라 배열의 크기가 다름
//      - n = 홀수인 경우 배열의 크기 : (n + 1) / 2
//      - n = 짝수인 경우 배열의 크기 :  n / 2
//  3. 홀수가 오름차순으로 배정
//      - i = 1, `i += 2`만큼 증감됨
//      - 배열의 idx(인덱스)를 설정하고, 반복문을 돌며 idx++;