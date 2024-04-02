-- 코드를 입력하세요
SELECT UB.TITLE, UB.BOARD_ID, UR.REPLY_ID, UR.WRITER_ID, UR.CONTENTS, 
to_char(UR.CREATED_DATE, 'YYYY-MM-DD') as CREATED_DATE
FROM USED_GOODS_BOARD UB, USED_GOODS_REPLY UR
WHERE UB.BOARD_ID = UR.BOARD_ID
AND to_char(UB.CREATED_DATE, 'YYYY-MM') = '2022-10'
ORDER BY UR.CREATED_DATE ASC, UB.TITLE ASC;