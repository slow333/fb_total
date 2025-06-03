
-- RANDOM 값 생성; +1을 안하면 0이 나올 수 있음
-- 고객 수에 따라 랜덤하게 customer_id를 설정
UPDATE car SET car.customer_id = FLOOR(RAND()* (SELECT COUNT(*) FROM customers) + 1);

-- FLOOR(i + RAND() * (J - I); -- I ~ J: I,J 포함 정수
UPDATE car SET customer_id =  floor(4 + rand() * (14 - 4) );
update car set customer_id =  floor(4 + rand() * ((SELECT COUNT(*) FROM customers) - 3) );

-- 중복 제거 make, model, model_year 조합
DELETE FROM car WHERE id NOT IN (SELECT MIN(id) FROM car GROUP BY make, model, model_year);
-- 특정 개수를 남기기
-- 예시: 각 모델별로 3개만 남기기
DELETE c1
FROM car c1
JOIN car c2
ON c1.model = c2.model
WHERE c1.id < (c2.id + 3);

