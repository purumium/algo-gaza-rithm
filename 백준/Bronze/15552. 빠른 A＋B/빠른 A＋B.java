import java.io.*;
import java.util.StringTokenizer;

public class Main {
		public static void main(String[] args) throws IOException {
				BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
				BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
				
				String T = reader.readLine();  // Line을 String타입으로 읽어옴
				int num = Integer.parseInt(T);  // String을 int로 형 변환		
				
				StringTokenizer st;
				for (int i = 0; i < num; i++) {
						// 공백을 기준으로 데이터를 가공
						st = new StringTokenizer(reader.readLine(), " "); 
						
						// 공백 단위로 구분된 값을, 순서대로 가지고 옴
						int a = Integer.parseInt(st.nextToken());
						int b = Integer.parseInt(st.nextToken());
						writer.write( (a + b) + "\n");
				}	
				reader.close();
				
				writer.flush();  // 남아있는 데이터 모두 출력
				writer.close(); 
		}
}