import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();  // 단어의 개수
        sc.nextLine(); // 다음 라인으로 넘어가기
        
        for (int i = 0; i < num; i++) {
            String str = sc.nextLine(); 
            char firstChar = str.charAt(0);
            char lastChar = str.charAt(str.length() - 1);
            
            System.out.println(firstChar + "" + lastChar);
        }        
    }
}