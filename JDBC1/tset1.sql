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

