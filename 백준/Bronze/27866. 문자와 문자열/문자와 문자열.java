import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String str = sc.nextLine();  // Sprout, 3
        int searchNum = sc.nextInt();
        
        // split 메서드를 이용하여 문자 1개씩 배열에 넣기
        String[] strArray = str.split(""); 
        String searchStr = strArray[searchNum - 1];  // idx는 0부터 시작
        
        System.out.println(searchStr);       
    }
}