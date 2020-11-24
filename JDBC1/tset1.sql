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


DB에 데이터를 저장한 상태에서 컬럼 하나만을 이용해서 
특정 레코드를데이터를 조회하고 싶을 때 어떻게 해야 할까?
--> 기본키 = 주키 = primary key = pk 가 필요하다

CREATE TABLE member2(
id VARCHAR2(6),
name VARCHAR2(6),
age NUMBER(3)
)

ALTER TABLE member2 ADD CONSTRAINT pk_member2_id PRIMARY KEY(id)
--> member2 테이블에 제약조건을 추가한다(ADD CONSTRAINT)
--> 어떤 제약조건? memeber2 테이블의 primary key로 id를 지정하겠다
--> 기본키를 설정해두면 자동으로 키본키에 대한 중복을 허용하지 않는다. 
--> (id가 같은 값은 데이터 입력이 되지 않음) : UNIQUE 제약조건

INSERT INTO member2 VALUES ('m001','kim', 30)
INSERT INTO member2 VALUES ('m002','kim', 30)
INSERT INTO member2 VALUES ('m003','kim', 30)
INSERT INTO member2 VALUES ('m004','kim', 30)
INSERT INTO member2 VALUES ('m005','kim', 30)
INSERT INTO member2 VALUES ('m006','kim', 30)
INSERT INTO member2 VALUES ('m007','kim', 30)

INSERT INTO member2 (id, name, age) VALUES ('m008','lee', 44)
--> 기본키를 설정하면 기본키로 설정 된 칼럼에 대해 절대로 NULL값을 입력할 수 없음
--> NOT NULL 제약조건 

COMMIT

DELETE FROM member2

COMMIT

SELECT * FROM member2 WHERE id = 'm004'
--> 특정테이블에서 특정 레코드만 하나의 컬럼을 이용해서 자료조회가 가능

SELECT * FROM member

// member테이블의 mid컬럼을 주키(=기본키=pk=primary_key)로 설정하시오
ALTER TABLE member ADD CONSTRAINT pk_member_mid PRIMARY KEY(mid)

CREATE TABLE test2(
id VARCHAR2(6) PRIMARY KEY,
age NUMBER(3)
)

CREATE TABLE test3(
id VARCHAR2(6),
age NUMBER(3)
CONSTRAINT pk_test3_id PRIMARY KEY(id)
)


--> 외래키 = foreign key = fk
--> 선택지 안에서만 선택해야 하는데 선택지 외에서 선택하려는 경우가 있기 때문에
--> 이것을 방지하고자 만듦
--> 외래키는 부모테이블인 외래키 테이블을 먼저 만들어야 함


CREATE TABLE depart(
--> 사용하고자 하는 테이블의 부모테이블을 만든다.
edep VARCHAR2(9)
)

ALTER TABLE depart ADD CONSTRAINT pk_depart_edep PRIMARY KEY(edep)
--> 외래키(foreign key)가 되려면? 반드시 부모 테이블의 기본키이어야 한다.

INSERT INTO depart VALUES ('인사부')
INSERT INTO depart VALUES ('홍보부')
INSERT INTO depart VALUES ('연구실')
INSERT INTO depart VALUES ('영업부')

--> 외래키로 쓸 레코드들을 입력해준다.
--> 이제 위의 네가지를 제외한 레코드를 가지고 있는 레코드는 입력되지 않는다. 

--> 자식 테이블을 만들어준다.
CREATE TABLE employee(
eid VARCHAR2(6),
ename VARCHAR2(6),
edep VARCHAR2(9)
)

ALTER TABLE employee ADD CONSTRAINT k_employee_eid PRIMARY KEY(eid)


--> 외래키 설정하기 : 어느 테이블에서 사용할 것인가? (자식테이블 employee)
ALTER TABLE employee ADD CONSTRAINT fk_employee_edep FOREIGN KEY(edep) REFERENCES depart(edep)
--> 외래키를 사용하고자 하는 자식테이블의 내용을 alter한다 
--> FOREIGN KEY(edep) 어느 칼럼에서 참조할 것인가? 
--> REFERENCES depart(edep) 어느 테이블의 어떤 칼럼을 참조할 것인가?


--> edep에는 인사부/홍보부/연구실/영업부만 들어갈 수 있음
INSERT INTO employee (eid, ename, edep) VALUES ('e001', 'kim','인사부')
INSERT INTO employee (eid, ename, edep) VALUES ('e002', 'lee','홍보부')
INSERT INTO employee (eid, ename, edep) VALUES ('e003', 'park','연구실')
INSERT INTO employee (eid, ename, edep) VALUES ('e004', 'choi','영업부')

--> 아래의 레코드를 입력하면 입력되지 않는다.
INSERT INTO employee (eid, ename, edep) VALUES ('e005', 'jung','비서실')
--> 왜? 부모테이블인 depart는 '비서실'이라는 데이터가 없기 때문에 참조무결성 제약조건에 위반된다.

SELECT * FROM employee

COMMIT

INSERT INTO employee (eid, ename) VALUES ('e006','kim') 

============================================================================


CREATE TABLE menu(
menu VARCHAR2(12)
)

ALTER TABLE menu ADD CONSTRAINT pk_menu_menu PRIMARY KEY(menu)

INSERT INTO menu VALUES ('떡볶이')
INSERT INTO menu VALUES ('라면')
INSERT INTO menu VALUES ('오뎅')
INSERT INTO menu VALUES ('볶음밥')



CREATE TABLE odmenu(
tableno NUMBER(2),
menu VARCHAR2(12),
price NUMBER(5)
)

ALTER TABLE odmenu ADD CONSTRAINT pk_odmenu_talbeno PRIMARY KEY(tableno)

ALTER TABLE odmenu ADD CONSTRAINT fk_odmenu_menu FOREIGN KEY(menu) REFERENCES menu(menu)

SELECT * FROM odmenu

INSERT INTO odmenu VALUES (1, '떡볶이', 3500)

INSERT INTO odmenu VALUES (2, '김밥', 2000) --> 입력안됨 : 참조무결성 위배

INSERT INTO odmenu VALUES (1, '오뎅', 2000) --> 입력안됨 : 기본키 중복

INSERT INTO odmenu VALUES (3, '볶음밥', 5500)

INSERT INTO odmenu VALUES (2, '라면', 4500)

SELECT tableno as 번호, menu as 메뉴, price as 가격 FROM odmenu


=========================================================================================


CREATE TABLE depa(
dep VARCHAR2(12),
floor NUMBER(2)
)

ALTER TABLE depa ADD CONSTRAINT pk_depa_dep PRIMARY KEY(dep)

INSERT INTO depa VALUES ('인사부' , 2)
INSERT INTO depa VALUES ('총무부' , 5)
INSERT INTO depa VALUES ('영업부' , 2)
INSERT INTO depa VALUES ('교육실' , 2)

SELECT * FROM depa

CREATE TABLE erp(
eid VARCHAR2(6),
ename VARCHAR2(12),
dep VARCHAR2(12)
)

ALTER TABLE erp ADD CONSTRAINT pk_erp_eid PRIMARY KEY(eid)
ALTER TABLE erp ADD CONSTRAINT fk_erp_dep FOREIGN KEY(dep) REFERENCES depa(dep)
--> 기본키 != 외래키 : 비식별관계 (대부분의 테이블은 비식별관계로 형성된다)
--> 기본키 == 외래키 : 식별관계 

INSERT INTO erp VALUES ('e001', '김일식', '교육실')
INSERT INTO erp VALUES ('e002', '박파랑', '교육실') --> 외래키는 중복 가능!
INSERT INTO erp (eid, ename) VALUES ('e003', '김두식') --> 외래키는 null값도 가능함
INSERT INTO erp (eid, dep) VALUES ('e004', '영업부')
INSERT INTO erp VALUES ('e005', '김주도', '행정부') --> 부모테이블에 없는 데이터라 안들어감.

SELECT * FROM erp

SELECT * FROM member ORDER BY mid ASC
