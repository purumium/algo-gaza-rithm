import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt( reader.readLine() );
		
		StringTokenizer stk;
		for (int i = 1; i <= num; i++) {
			stk = new StringTokenizer(reader.readLine(), " ");
			
			int a = Integer.parseInt( stk.nextToken() );
			int b = Integer.parseInt( stk.nextToken() );  // 또 다음 토큰이 있으면 출력
			
			writer.write( "Case #" + i + ": " + ( a + b ) + "\n");
		}		
		reader.close();
		
		writer.flush();
		writer.close();			
	}
}
