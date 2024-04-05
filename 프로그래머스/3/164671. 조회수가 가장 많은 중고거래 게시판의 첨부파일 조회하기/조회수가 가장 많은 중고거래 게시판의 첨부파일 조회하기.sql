-- 코드를 입력하세요
SELECT '/home/grep/src/'||B.BOARD_ID||'/'||F.FILE_ID||F.FILE_NAME||F.FILE_EXT as FILE_PATH
from USED_GOODS_BOARD B, USED_GOODS_FILE F
where B.BOARD_ID = F.BOARD_ID
and B.VIEWS = (select max(VIEWS) from USED_GOODS_BOARD)
order by FILE_ID desc;