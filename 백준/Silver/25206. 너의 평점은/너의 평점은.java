import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main{
	public static void main(String[ ]arg) {
        Map<String, Double> gradeToPoint = new HashMap<>();
        gradeToPoint.put("A+", 4.5);
        gradeToPoint.put("A0", 4.0);
        gradeToPoint.put("B+", 3.5);
        gradeToPoint.put("B0", 3.0);
        gradeToPoint.put("C+", 2.5);
        gradeToPoint.put("C0", 2.0);
        gradeToPoint.put("D+", 1.5);
        gradeToPoint.put("D0", 1.0);
        gradeToPoint.put("F", 0.0);

        Scanner sc = new Scanner(System.in);
        
        Double totalSum = 0.0;
        Double totalCredits = 0.0; // 학점의 총합
        
        for (int i = 0; i < 20; i++) {
            String subject = sc.next();
            Double credit = sc.nextDouble();
            String grade = sc.next();
            
            // "P" 등급은 계산에서 제외
            if (grade.equals("P")) {
                continue;
            }
            
            Double gradeValue = gradeToPoint.get(grade);
            
            totalSum += gradeValue * credit;
            totalCredits += credit; // 학점의 총합 계산
        }
        
        if (totalCredits == 0) {
            System.out.println("0.000000");
        } else {
            System.out.printf("%.6f\n", totalSum / totalCredits); // 학점 평점 평균 출력
        }	
  }	
}
