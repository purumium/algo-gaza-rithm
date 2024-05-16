class Solution {
    public int solution(int price) {
        double discount = 0;
        
        if( price >= 500000 ) discount = price - price * 0.2;
        else if( price >= 300000 ) discount = price - price * 0.1;
        else if (price >= 100000 ) discount = price - price * 0.05;
        else discount = price;
        
        //int total_price = (int)discount;  // Math.floor의 반환값(double)
        int total_price = (int)Math.floor(discount);
        
        return total_price;
    }
}