import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	String str = sc.nextLine();
    	
    	// 알파벳 26개가 포함되어 있는지를 체크하는 배열
    	int[] position = new int[26];
    	
    	// 배열에 모두 -1로 세팅
    	for (int i = 0; i < position.length; i++) {
			position[i] = -1;			
		}
    	
    	// 단어 str을 포함하는지 체크하기
    	for (int i = 0; i < str.length(); i++) {
			int idx = str.charAt(i) - 'a';  // 알파벳의 순서, 'c' - 'a' => c는 position 배열에서 3번째 순서 
			
			if( position[idx] == -1 ) {  // idx가 처음으로 등장한다면 => idx = -1
				position[idx] = i;  // position 배열의 알파벳 자리에 처음 등장하는 위치(i)를 표시
			}
		}

    	for (int i : position) {
			System.out.print(i + " ");
		}
    	
    }
}