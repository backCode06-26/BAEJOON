select to_char(N.SALES_DATE, 'yyyy-mm-dd') as SALES_DATE, N.PRODUCT_ID, N.USER_ID, N.SALES_AMOUNT
from ONLINE_SALE N
where to_char(N.SALES_DATE, 'yyyy-mm') = '2022-03'

union

select to_char(F.SALES_DATE, 'yyyy-mm-dd') as SALES_DATE, F.PRODUCT_ID, null as USER_ID, F.SALES_AMOUNT
from OFFLINE_SALE F
where to_char(F.SALES_DATE, 'yyyy-mm') = '2022-03'
order by SALES_DATE, product_id, user_id;