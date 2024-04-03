-- 코드를 입력하세요
SELECT NAME, count(name)
from ANIMAL_INS
group by name
having count(name) > 1 and count(name) not in 0
order by name;