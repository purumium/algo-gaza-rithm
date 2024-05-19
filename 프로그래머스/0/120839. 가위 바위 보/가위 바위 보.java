class Solution {
    public String solution(String rsp) {
        
        // 1. 문자열을 나누어 배열에 넣기
        char[] array = rsp.toCharArray(); //문자열을 문자 배열로 반환함
        
        String result = ""; // result를 빈 문자열로 초기화
        // 2. 분리한 단어를 비교
        for (char c : array) {
			result += (c == '2') ? "0" : (c == '0') ? "5" : "2";
		}
        return result;        
    }
}