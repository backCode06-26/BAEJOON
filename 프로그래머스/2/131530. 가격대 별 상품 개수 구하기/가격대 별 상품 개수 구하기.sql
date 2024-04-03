-- 코드를 입력하세요
SELECT trunc(PRICE,-4) PRICE_GROUP, count(PRODUCT_ID) PRODUCTS
from PRODUCT
group by trunc(PRICE,-4)
order by PRICE_GROUP;