SELECT NAME, DATETIME
FROM 
(
    SELECT I.NAME, I.DATETIME
    FROM ANIMAL_INS I, ANIMAL_OUTS O
    where I.ANIMAL_ID = O.ANIMAL_ID(+)
    and O.ANIMAL_ID is null
    order by I.DATETIME
)
-- 위와 같인 인라인 뷰을 사용하는 이유는 order by 이전에 rownum이 작동되기 때문에 사용한다.
where rownum <= 3;