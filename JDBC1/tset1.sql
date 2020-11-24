CREATE TABLE test(
name VARCHAR2(3),
age NUMBER(3)
)
// ���̺��� ����� (Į������ name(���ܾ� 3����, �ѱ� 1����)�� age(-999~999������ ���ڸ� ���� ǥ���� �� ����)�� ���´�)

INSERT INTO test VALUES ('kim', 20)
INSERT INTO test VALUES ('lee', 40)
INSERT INTO test VALUES ('park', 50)
INSERT INTO test VALUES ('cho', 23)
INSERT INTO test VALUES ('kim', 33)
���� �Է�

COMMIT
����

SELECT * FROM test
test���̺��� ��� ���ڵ� ���

SELECT name FROM test 
test���̺��� name���ڵ常 ���

SELECT aget FROM test
test���̺��� age���ڵ常 ���

 == alias �÷��� ����ֱ� == 

SELECT name as �̸�, aget as ���� FROM test
as�� �̿��ؼ� ���� ������ֱ� -> �÷��� as ��Ī

SELECT name �̸�, aget ���� FROM test
as�� ��� ��Ī������ ������

SELECT name as �̸�, aget ���� FROM test
as�� as���� ��Ī�� ������ִ� ����� ȥ���ؼ� �� �� ����

SELECT DISTINCT name FROM test
distinct�� �ߺ��� ���� ���� ���ڵ带 ��ȸ�� �� ����
(�̸��� ������ �ߺ����� �ν��ϰ� �ҷ����� �ʴ´�)

SELECT * FROM test ORDER BY aget ASC
test�� ���ڵ带 ���̼����� �������� �����ϱ�

SELECT * FROM test ORDER BY aget DESC
test�� ���ڵ带 ���̼����� �������� �����ϱ�

SELECT * FROM test ORDER BY name DESC
test���̺��� ��� ���ڵ带 ��� �÷��� ���Եǰ� ��ȸ�ϵ�, �̸��� �������� ������������ �����Ͻÿ�.

INSERT INTO test VALUES ('oh',35)
�ڷ� �߰�

SELECT * FROM test
test ���̺��� ��� ���ڵ� �ҷ�����

DELETE FROM test WHERE name = 'oh'
�̸��� oh�� �����ϰ� �ִ� ���ڵ带 ����

SELECT * FROM test
test���̺��� ��� ���ڵ� �ҷ�����

DELETE FROM test WHERE aget =40


INSERT INTO test VALUES ('lee', 40)

SELECT * FROM test

DELETE FROM test WHERE aget = 23

INSERT INTO test VALUES ('cho', 23)

SELECT * FROM test

SELECT DISTINCT name FROM test

SELECT * FROM test ORDER BY aget

SELECT name as �̸�, aget as ���� FROM test

SELECT * FROM test ORDER BY name ASC

SELECT * FROM test ORDER BY name DESC

test ���̺��� ��� ���ڵ���� ��� �÷��� ���Եǰ� ��ȸ�ϵ� �̸��� �������� ������������ �����Ͻÿ�.
���� �̸��� ������ ���̰� ���� ����� �켱�� �ǵ��� �����Ͻÿ�.

SELECT * FROM test ORDER BY name DESC, aget DESC

SELECT * FROM test WHERE name = 'kim'
// �̸��� kim�� ����� ��� ���ڵ带 �����´�
SELECT * FROM test WHERE name != 'kim'
// �̸��� kim�� �ƴ� ����� ��� ���ڵ带 �����´�

INSERT INTO test (aget) VALUES (55)
INSERT INTO test (name) VALUES ('pyo')
COMMIT

name�� null�� ���ڵ� ������ ��ȸ�Ͻÿ�. ��, Į���� name�� ����

SELECT name as �̸�, aget ���� FROM test WHERE name IS NULL

name�� null�� �ƴ� ���ڵ� ������ ��ȸ�Ͻÿ�. ��, ���ڵ忡 ���� ������ AGE�� �����ǰ� �����ϰ�
���� age�� ������ name�� ������������ �����Ͻÿ�.

SELECT * FROM test WHERE name IS NOT NULL ORDER BY aget ASC, name DESC

test ���̺��� age�� 55�� ���ڵ带 ��ȸ�Ͻÿ�. (�÷� �̾߱� ������ ��� �÷��� ��ȸ�϶�� �̾߱���)
SELECT * FROM test WHERE aget = 55

test ���̺��� age�� 55�� �ƴ� ���ڵ带 ��ȸ�Ͻÿ�.
SELECT * FROM test WHERE aget != 55

test ���̺��� age�� NULL�� ���ڵ带 ��ȸ�Ͻÿ�.
SELECT * FROM test WHERE aget IS NULL

test ���̺��� age�� NULL�� �ƴ� ���ڵ带 ��ȸ�Ͻÿ�.
SELECT * FROM test WHERE aget IS NOT NULL

test ���̺��� age�� 40���� ū ���ڵ带 ��ȸ�Ͻÿ�
SELECT * FROM test WHERE aget > 33

test ���̺��� age�� 33���� ũ�ų� ���� ���ڵ带 ��ȸ�Ͻÿ�.
SELECT * FROM test WHERE aget >= 33

test ���̺��� age�� 20�̰ų� 23�̰ų� 40�� ���ڵ带 ��ȸ�Ͻÿ�.
SELECT * FROM test WHERE aget = 20 OR aget = 23 OR aget = 40

test�� age�� 20�̰ų� 23�̰ų� 40�̰ų� 43�̰ų� 61�̰ų� 77�� ���ڵ带 ��ȸ�Ͻÿ�
==> IN()�Լ� ���
SELECT * FROM test WHERE aget IN(20, 23, 40, 43, 61, 77)
test�� age�� 20�̰ų� 23�̰ų� 40�̰ų� 43�̰ų� 61�̰ų� 77�� �ƴ� ���ڵ带 ��ȸ�Ͻÿ�
SELECT * FROM test WHERE aget NOT IN(20, 23, 40, 43, 61, 77)

name�� kim�̰� age�� 33�� ���ڵ带 ��ȸ�Ͻÿ�
SELECT * FROM test WHERE name = 'kim' AND aget = 33

test ���̺��� age�� 25���� ũ�� 47���� ���� ���ڵ带 ��ȸ�Ͻÿ�.
SELECT * FROM test WHERE aget>25 AND aget<47

test ���̺��� age�� 25���� ũ�ų� ���� age�� 47���� �۰ų� ���� ���ڵ带 ��ȸ�Ͻÿ�.
SELECT * FROM test WHERE aget >= 25 AND aget <= 47

SELECT * FROM test WHERE aget BETWEEN 25 AND 47


�÷��� ������ name�� �̸�, aget�� ������ test���̺��� age�� 20�̰ų� 23�� ���ڵ带 �̸��� ���� ������������ ������ ��ȸ�Ͻÿ�. 
SELECT name as �̸�, aget as ���� FROM test WHERE aget IN(20, 23) ORDER BY name DESC

�÷��� ������ name�� �̸�, aget�� ������ test���̺��� name�� lee�� �ƴ� ���ڵ带 age�� ������������ ������ ��ȸ�Ͻÿ�.
SELECT name �̸�, aget ���� FROM test WHERE name != 'lee' ORDER BY aget ASC

test ���̺��� �̸��� null�� �ƴϰ�, aget�� null�� �ƴ� ���ڵ带 ������������ �����Ͽ� ��ȸ�Ͻÿ�.
SELECT * FROM test WHERE name IS NOT NULL AND aget IS NOT NULL ORDER BY aget DESC

test ���̺��� name�� null�̰ų� age�� null�� ���ڵ带 ��ȸ�Ͻÿ�.
SELECT * FROM test WHERE name IS NULL OR aget IS NULL



SELECT * FROM test WHERE name LIKE 'k__'
// like => ���𰡰� ���ԵǾ� ���� ��(��Ȯ�� ���� �� ��) ��.
SELECT * FROM test WHERE name LIKE '_e___'
SELECT * FROM test WHERE name LIKE '_e_'

SELECT * FROM test WHERE name LIKE '%o'
// % : ���ڼ��� ����ڰ� ����ִ����� ������ ���ڸ��� �ҹ��� o�� ���ڵ带 ã�� �� ����

SELECT * FROM test WHERE name LIKE '%��%'
SELECT * FROM test WHERE name LIKE '%l%'
// %����% => ���ڼ��� �� ���������� �𸣰�, �˰��ִ� ���ڰ� ���° ���������� �� �� ����ϸ� ���ڵ带 ã�� �� ����

SELECT * FROM test WHERE aget LIKE '%2%'
SELECT * FROM test WHERE aget LIKE '4%'
SELECT * FROM test WHERE name LIKE '%h%'

// �������� : ���̺�� ��ſ� SELECT�� �ֱ�
SELECT * FROM (SELECT * FROM test WHERE aget > 20) WHERE name LIKE '%k%'

rowrum�� 2~4 ���̿� �ִ� ���� �������� ���� ��

// orderby�� ���̸� �ι����� ������� �Ѵ�. 
SELECT * FROM 
(SELECT rownum rnum, name, aget FROM (SELECT name, aget FROM test ORDER BY aget ASC))
WHERE rnum BETWEEN 2 AND 4

// rounum�� select�Ҷ����� ���� ���ܳ��� rownum�� ��Ī�� �����ְ� ������� ������ 
// ��� �� ������ ������ ���⶧���� ����! �ݵ�� ��Ī ���� ��
// SELECT�� ����� �׻� ǥ �������� ��µȴ�.


SELECT rnum, name, aget FROM(
SELECT rownum rnum, name, aget FROM 
(SELECT name, aget FROM test ORDER BY aget asc)
) WHERE rnum BETWEEN 2 AND 4

SELECT * FROM (
SELECT name, aget FROM test ORDER BY aget ASC)
WHERE aget > 30


SELECT * FROM test WHERE name LIKE'%k%'
SELECT * FROM test WHERE name LIKE '_e_'

SELECT num ����, name �̸�, aget ���� FROM(
SELECT rownum num, name, aget FROM
(SELECT name, aget FROM test WHERE aget > 30 ORDER BY name DESC)
) WHERE name LIKE '%k%'


DB�� �����͸� ������ ���¿��� �÷� �ϳ����� �̿��ؼ� 
Ư�� ���ڵ带�����͸� ��ȸ�ϰ� ���� �� ��� �ؾ� �ұ�?
--> �⺻Ű = ��Ű = primary key = pk �� �ʿ��ϴ�

CREATE TABLE member2(
id VARCHAR2(6),
name VARCHAR2(6),
age NUMBER(3)
)

ALTER TABLE member2 ADD CONSTRAINT pk_member2_id PRIMARY KEY(id)
--> member2 ���̺� ���������� �߰��Ѵ�(ADD CONSTRAINT)
--> � ��������? memeber2 ���̺��� primary key�� id�� �����ϰڴ�
--> �⺻Ű�� �����صθ� �ڵ����� Ű��Ű�� ���� �ߺ��� ������� �ʴ´�. 
--> (id�� ���� ���� ������ �Է��� ���� ����) : UNIQUE ��������

INSERT INTO member2 VALUES ('m001','kim', 30)
INSERT INTO member2 VALUES ('m002','kim', 30)
INSERT INTO member2 VALUES ('m003','kim', 30)
INSERT INTO member2 VALUES ('m004','kim', 30)
INSERT INTO member2 VALUES ('m005','kim', 30)
INSERT INTO member2 VALUES ('m006','kim', 30)
INSERT INTO member2 VALUES ('m007','kim', 30)

INSERT INTO member2 (id, name, age) VALUES ('m008','lee', 44)
--> �⺻Ű�� �����ϸ� �⺻Ű�� ���� �� Į���� ���� ����� NULL���� �Է��� �� ����
--> NOT NULL �������� 

COMMIT

DELETE FROM member2

COMMIT

SELECT * FROM member2 WHERE id = 'm004'
--> Ư�����̺��� Ư�� ���ڵ常 �ϳ��� �÷��� �̿��ؼ� �ڷ���ȸ�� ����

SELECT * FROM member

// member���̺��� mid�÷��� ��Ű(=�⺻Ű=pk=primary_key)�� �����Ͻÿ�
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


--> �ܷ�Ű = foreign key = fk
--> ������ �ȿ����� �����ؾ� �ϴµ� ������ �ܿ��� �����Ϸ��� ��찡 �ֱ� ������
--> �̰��� �����ϰ��� ����
--> �ܷ�Ű�� �θ����̺��� �ܷ�Ű ���̺��� ���� ������ ��


CREATE TABLE depart(
--> ����ϰ��� �ϴ� ���̺��� �θ����̺��� �����.
edep VARCHAR2(9)
)

ALTER TABLE depart ADD CONSTRAINT pk_depart_edep PRIMARY KEY(edep)
--> �ܷ�Ű(foreign key)�� �Ƿ���? �ݵ�� �θ� ���̺��� �⺻Ű�̾�� �Ѵ�.

INSERT INTO depart VALUES ('�λ��')
INSERT INTO depart VALUES ('ȫ����')
INSERT INTO depart VALUES ('������')
INSERT INTO depart VALUES ('������')

--> �ܷ�Ű�� �� ���ڵ���� �Է����ش�.
--> ���� ���� �װ����� ������ ���ڵ带 ������ �ִ� ���ڵ�� �Էµ��� �ʴ´�. 

--> �ڽ� ���̺��� ������ش�.
CREATE TABLE employee(
eid VARCHAR2(6),
ename VARCHAR2(6),
edep VARCHAR2(9)
)

ALTER TABLE employee ADD CONSTRAINT k_employee_eid PRIMARY KEY(eid)


--> �ܷ�Ű �����ϱ� : ��� ���̺��� ����� ���ΰ�? (�ڽ����̺� employee)
ALTER TABLE employee ADD CONSTRAINT fk_employee_edep FOREIGN KEY(edep) REFERENCES depart(edep)
--> �ܷ�Ű�� ����ϰ��� �ϴ� �ڽ����̺��� ������ alter�Ѵ� 
--> FOREIGN KEY(edep) ��� Į������ ������ ���ΰ�? 
--> REFERENCES depart(edep) ��� ���̺��� � Į���� ������ ���ΰ�?


--> edep���� �λ��/ȫ����/������/�����θ� �� �� ����
INSERT INTO employee (eid, ename, edep) VALUES ('e001', 'kim','�λ��')
INSERT INTO employee (eid, ename, edep) VALUES ('e002', 'lee','ȫ����')
INSERT INTO employee (eid, ename, edep) VALUES ('e003', 'park','������')
INSERT INTO employee (eid, ename, edep) VALUES ('e004', 'choi','������')

--> �Ʒ��� ���ڵ带 �Է��ϸ� �Էµ��� �ʴ´�.
INSERT INTO employee (eid, ename, edep) VALUES ('e005', 'jung','�񼭽�')
--> ��? �θ����̺��� depart�� '�񼭽�'�̶�� �����Ͱ� ���� ������ �������Ἲ �������ǿ� ���ݵȴ�.

SELECT * FROM employee

COMMIT

INSERT INTO employee (eid, ename) VALUES ('e006','kim') 

============================================================================


CREATE TABLE menu(
menu VARCHAR2(12)
)

ALTER TABLE menu ADD CONSTRAINT pk_menu_menu PRIMARY KEY(menu)

INSERT INTO menu VALUES ('������')
INSERT INTO menu VALUES ('���')
INSERT INTO menu VALUES ('����')
INSERT INTO menu VALUES ('������')



CREATE TABLE odmenu(
tableno NUMBER(2),
menu VARCHAR2(12),
price NUMBER(5)
)

ALTER TABLE odmenu ADD CONSTRAINT pk_odmenu_talbeno PRIMARY KEY(tableno)

ALTER TABLE odmenu ADD CONSTRAINT fk_odmenu_menu FOREIGN KEY(menu) REFERENCES menu(menu)

SELECT * FROM odmenu

INSERT INTO odmenu VALUES (1, '������', 3500)

INSERT INTO odmenu VALUES (2, '���', 2000) --> �Է¾ȵ� : �������Ἲ ����

INSERT INTO odmenu VALUES (1, '����', 2000) --> �Է¾ȵ� : �⺻Ű �ߺ�

INSERT INTO odmenu VALUES (3, '������', 5500)

INSERT INTO odmenu VALUES (2, '���', 4500)

SELECT tableno as ��ȣ, menu as �޴�, price as ���� FROM odmenu


=========================================================================================


CREATE TABLE depa(
dep VARCHAR2(12),
floor NUMBER(2)
)

ALTER TABLE depa ADD CONSTRAINT pk_depa_dep PRIMARY KEY(dep)

INSERT INTO depa VALUES ('�λ��' , 2)
INSERT INTO depa VALUES ('�ѹ���' , 5)
INSERT INTO depa VALUES ('������' , 2)
INSERT INTO depa VALUES ('������' , 2)

SELECT * FROM depa

CREATE TABLE erp(
eid VARCHAR2(6),
ename VARCHAR2(12),
dep VARCHAR2(12)
)

ALTER TABLE erp ADD CONSTRAINT pk_erp_eid PRIMARY KEY(eid)
ALTER TABLE erp ADD CONSTRAINT fk_erp_dep FOREIGN KEY(dep) REFERENCES depa(dep)
--> �⺻Ű != �ܷ�Ű : ��ĺ����� (��κ��� ���̺��� ��ĺ������ �����ȴ�)
--> �⺻Ű == �ܷ�Ű : �ĺ����� 

INSERT INTO erp VALUES ('e001', '���Ͻ�', '������')
INSERT INTO erp VALUES ('e002', '���Ķ�', '������') --> �ܷ�Ű�� �ߺ� ����!
INSERT INTO erp (eid, ename) VALUES ('e003', '��ν�') --> �ܷ�Ű�� null���� ������
INSERT INTO erp (eid, dep) VALUES ('e004', '������')
INSERT INTO erp VALUES ('e005', '���ֵ�', '������') --> �θ����̺� ���� �����Ͷ� �ȵ�.

SELECT * FROM erp

SELECT * FROM member ORDER BY mid ASC
