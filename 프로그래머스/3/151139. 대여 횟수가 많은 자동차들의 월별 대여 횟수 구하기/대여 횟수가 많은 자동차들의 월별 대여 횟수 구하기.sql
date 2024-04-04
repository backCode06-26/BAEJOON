-- 코드를 입력하세요
SELECT to_number(to_char(START_DATE, 'mm')) MONTH,  CAR_ID, count(CAR_ID) RECORDS
from CAR_RENTAL_COMPANY_RENTAL_HISTORY
where car_id in 
(
    select car_id
    from CAR_RENTAL_COMPANY_RENTAL_HISTORY
    where to_char(START_DATE, 'yyyy-mm') between '2022-08' and '2022-10'
    group by car_id
    having count(car_id) >= 5
) and to_char(START_DATE, 'yyyy-mm') between '2022-08' and '2022-10'
group by to_char(START_DATE, 'mm'), CAR_ID
order by MONTH, CAR_ID desc;