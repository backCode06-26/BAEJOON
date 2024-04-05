-- 코드를 입력하세요
SELECT CAR_ID, round(avg(END_DATE - START_DATE + 1),1) AVERAGE_DURATION
from CAR_RENTAL_COMPANY_RENTAL_HISTORY
group by car_id
having avg(END_DATE - START_DATE + 1) >= 7
order by AVERAGE_DURATION desc, CAR_ID desc;