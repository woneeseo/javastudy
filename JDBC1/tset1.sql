CREATE TABLE test(
name VARCHAR2(3),
age NUMBER(3)
)
// 테이블을 만든다 (칼럼으로 name(영단어 3글자, 한글 1글자)과 age(-999~999까지의 세자리 수를 표현할 수 있음)를 갖는다)

INSERT INTO test VALUES ('kim', 20)
INSERT INTO test VALUES ('lee', 40)
INSERT INTO test VALUES ('park', 50)
INSERT INTO test VALUES ('cho', 23)
INSERT INTO test VALUES ('kim', 33)
값을 입력

COMMIT
저장

SELECT * FROM test
test테이블의 모든 레코드 출력

SELECT name FROM test 
test테이블의 name레코드만 출력

SELECT aget FROM test
test테이블의 age레코드만 출력

 == alias 컬럼에 별명넣기 == 

SELECT name as 이름, aget as 나이 FROM test
as를 이용해서 별명 만들어주기 -> 컬럼명 as 별칭

SELECT name 이름, aget 나이 FROM test
as가 없어도 별칭만들기는 가능함

SELECT name as 이름, aget 나이 FROM test
as와 as없이 별칭을 만들어주는 방법은 혼합해서 쓸 수 있음

SELECT DISTINCT name FROM test
distinct로 중복된 값은 빼고 레코드를 조회할 수 있음
(이름이 같으면 중복으로 인식하고 불러오지 않는다)

SELECT * FROM test ORDER BY aget ASC
test의 레코드를 나이순으로 오름차순 정렬하기

SELECT * FROM test ORDER BY aget DESC
test의 레코드를 나이순으로 내림차순 정렬하기

SELECT * FROM test ORDER BY name DESC
test테이블의 모든 레코드를 모든 컬럼이 포함되게 조회하되, 이름을 기준으로 내림차순으로 정렬하시오.

INSERT INTO test VALUES ('oh',35)
자료 추가

SELECT * FROM test
test 테이블의 모든 레코드 불러오기

DELETE FROM test WHERE name = 'oh'
이름에 oh를 저장하고 있는 레코드를 삭제

SELECT * FROM test
test테이블의 모든 레코드 불러오기

DELETE FROM test WHERE aget =40


INSERT INTO test VALUES ('lee', 40)

SELECT * FROM test

DELETE FROM test WHERE aget = 23

INSERT INTO test VALUES ('cho', 23)

SELECT * FROM test

SELECT DISTINCT name FROM test

SELECT * FROM test ORDER BY aget

SELECT name as 이름, aget as 나이 FROM test

SELECT * FROM test ORDER BY name ASC

SELECT * FROM test ORDER BY name DESC

test 테이블의 모든 레코드들을 모든 컬럼이 포함되게 조회하되 이름을 기준으로 내림차순으로 정렬하시오.
만약 이름이 같으면 나이가 많은 사람이 우선이 되도록 정렬하시오.

SELECT * FROM test ORDER BY name DESC, aget DESC

SELECT * FROM test WHERE name = 'kim'
// 이름이 kim인 사람의 모든 레코드를 가져온다
SELECT * FROM test WHERE name != 'kim'
// 이름이 kim이 아닌 사람의 모든 레코드를 가져온다

INSERT INTO test (aget) VALUES (55)
INSERT INTO test (name) VALUES ('pyo')
COMMIT

name이 null인 레코드 정보를 조회하시오. 단, 칼럼은 name만 있음

SELECT name as 이름, aget 나이 FROM test WHERE name IS NULL

name이 null이 아닌 레코드 정보를 조회하시오. 단, 레코드에 대한 정렬은 AGE가 증가되게 정렬하고
만약 age가 같으면 name을 내림차순으로 정렬하시오.

SELECT * FROM test WHERE name IS NOT NULL ORDER BY aget ASC, name DESC

test 테이블에서 age가 55인 레코드를 조회하시오. (컬럼 이야기 없으면 모든 컬럼을 조회하라는 이야기임)
SELECT * FROM test WHERE aget = 55

test 테이블에서 age가 55가 아닌 레코드를 조회하시오.
SELECT * FROM test WHERE aget != 55

test 테이블에서 age가 NULL인 레코드를 조회하시오.
SELECT * FROM test WHERE aget IS NULL

test 테이블에서 age가 NULL이 아닌 레코드를 조회하시오.
SELECT * FROM test WHERE aget IS NOT NULL

test 테이블에서 age가 40보다 큰 레코드를 조회하시오
SELECT * FROM test WHERE aget > 33

test 테이블에서 age가 33보다 크거나 같은 레코드를 조회하시오.
SELECT * FROM test WHERE aget >= 33

test 테이블에서 age가 20이거나 23이거나 40인 레코드를 조회하시오.
SELECT * FROM test WHERE aget = 20 OR aget = 23 OR aget = 40

test의 age가 20이거나 23이거나 40이거나 43이거나 61이거나 77인 레코드를 조회하시오
==> IN()함수 사용
SELECT * FROM test WHERE aget IN(20, 23, 40, 43, 61, 77)
test의 age가 20이거나 23이거나 40이거나 43이거나 61이거나 77이 아닌 레코드를 조회하시오
SELECT * FROM test WHERE aget NOT IN(20, 23, 40, 43, 61, 77)

name이 kim이고 age가 33인 레코드를 조회하시오
SELECT * FROM test WHERE name = 'kim' AND aget = 33

test 테이블에서 age가 25보다 크고 47보다 작은 레코드를 조회하시오.
SELECT * FROM test WHERE aget>25 AND aget<47

test 테이블에서 age가 25보다 크거나 같고 age가 47보다 작거나 같은 레코드를 조회하시오.
SELECT * FROM test WHERE aget >= 25 AND aget <= 47

SELECT * FROM test WHERE aget BETWEEN 25 AND 47


컬럼의 별명이 name은 이름, aget는 나이인 test테이블에서 age가 20이거나 23인 레코드를 이름에 따른 내림차순으로 정렬해 조회하시오. 
SELECT name as 이름, aget as 나이 FROM test WHERE aget IN(20, 23) ORDER BY name DESC

컬럼의 별명이 name은 이름, aget는 나이인 test테이블에서 name이 lee가 아닌 레코드를 age의 오름차순으로 정렬해 조회하시오.
SELECT name 이름, aget 나이 FROM test WHERE name != 'lee' ORDER BY aget ASC

test 테이블에서 이름이 null이 아니고, aget가 null이 아닌 레코드를 내림차순으로 정렬하여 조회하시오.
SELECT * FROM test WHERE name IS NOT NULL AND aget IS NOT NULL ORDER BY aget DESC

test 테이블에서 name이 null이거나 age가 null인 레코드를 조회하시오.
SELECT * FROM test WHERE name IS NULL OR aget IS NULL



SELECT * FROM test WHERE name LIKE 'k__'
// like => 무언가가 포함되어 있을 때(정확한 값을 모를 때) 씀.
SELECT * FROM test WHERE name LIKE '_e___'
SELECT * FROM test WHERE name LIKE '_e_'

SELECT * FROM test WHERE name LIKE '%o'
// % : 글자수가 몇글자가 들어있는지는 모르지만 끝자리가 소문자 o인 레코드를 찾을 수 있음

SELECT * FROM test WHERE name LIKE '%초%'
SELECT * FROM test WHERE name LIKE '%l%'
// %글자% => 글자수가 몇 글자인지도 모르고, 알고있는 글자가 몇번째 글자인지도 모를 때 사용하면 레코드를 찾을 수 있음

SELECT * FROM test WHERE aget LIKE '%2%'
SELECT * FROM test WHERE aget LIKE '4%'
SELECT * FROM test WHERE name LIKE '%h%'

// 서브쿼리 : 테이블명 대신에 SELECT문 넣기
SELECT * FROM (SELECT * FROM test WHERE aget > 20) WHERE name LIKE '%k%'

rowrum이 2~4 사이에 있는 값을 가져오고 싶을 때

// orderby가 쓰이면 두번으로 묶어줘야 한다. 
SELECT * FROM 
(SELECT rownum rnum, name, aget FROM (SELECT name, aget FROM test ORDER BY aget ASC))
WHERE rnum BETWEEN 2 AND 4

// rounum은 select할때마다 새로 생겨나서 rownum의 별칭을 지어주고 사용하지 않으면 
// 사용 할 때마다 에러가 나기때문에 주의! 반드시 별칭 만들 것
// SELECT의 출력은 항상 표 형식으로 출력된다.


SELECT rnum, name, aget FROM(
SELECT rownum rnum, name, aget FROM 
(SELECT name, aget FROM test ORDER BY aget asc)
) WHERE rnum BETWEEN 2 AND 4

SELECT * FROM (
SELECT name, aget FROM test ORDER BY aget ASC)
WHERE aget > 30


SELECT * FROM test WHERE name LIKE'%k%'
SELECT * FROM test WHERE name LIKE '_e_'

SELECT num 순번, name 이름, aget 나이 FROM(
SELECT rownum num, name, aget FROM
(SELECT name, aget FROM test WHERE aget > 30 ORDER BY name DESC)
) WHERE name LIKE '%k%'

