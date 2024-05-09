-- 물고기 종류 별로 가장 큰 물고기의 ID, 물고기 이름, 길이를 출력

SELECT FISH.ID, NAME.FISH_NAME, FISH.LENGTH
FROM FISH_INFO FISH JOIN FISH_NAME_INFO NAME USING (FISH_TYPE)
WHERE FISH_TYPE IN ( SELECT FISH_TYPE
                     FROM FISH_INFO
                     GROUP BY FISH_TYPE
                     HAVING LENGTH = MAX(LENGTH)
                   )
ORDER BY ID ASC;