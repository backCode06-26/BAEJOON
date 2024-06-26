-- 코드를 입력하세요
select flavor
from 
(
    SELECT F.FLAVOR, sum(F.TOTAL_ORDER + J.TOTAL_ORDER) as S_ORDER
    from FIRST_HALF F, JULY J 
    where F.FLAVOR = J.FLAVOR
    group by F.FLAVOR
    order by S_ORDER desc
)
where rownum <= 3;
