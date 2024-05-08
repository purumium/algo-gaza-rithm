-- 가장 최근에 들어온 동물이 언제 들어왔는지를 출력
SELECT MAX(DATETIME) AS '시간' FROM ANIMAL_INS;