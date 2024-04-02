-- 코드를 입력하세요
SELECT PT_NAME, PT_NO, GEND_CD, AGE, nvl(TLNO, 'NONE') as TLNO
from PATIENT
where age <= 12 and GEND_CD = 'W'
order by age desc, PT_NAME asc;