class Solution {
    public int[] solution(int money) {
        int count = 0;
        int left = 0;
        int[] array = new int[2];
            
        if( money % 5500 == 0 ) {
            count = money / 5500;
            
            array[0] = count;
            array[1] = 0;
            
        } else {
            count = money / 5500;
            left= money % 5500;
            
            array[0] = count;
            array[1] = left;
        }
        return array;
    }
}