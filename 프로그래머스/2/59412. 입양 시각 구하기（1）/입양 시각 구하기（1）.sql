-- 코드를 입력하세요
SELECT to_number(TO_CHAR(DATETIME, 'HH24')) AS HOUR, COUNT(*) AS COUNT 
FROM ANIMAL_OUTS
-- to_char()을 사용한것은 날짜가 아닌 문자이다. 09는 문자이다.
WHERE to_number(TO_CHAR(DATETIME, 'HH24')) between 09 AND 19
GROUP BY TO_CHAR(DATETIME, 'HH24')
ORDER BY TO_CHAR(DATETIME, 'HH24');