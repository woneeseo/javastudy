package kr.co.ezen;

public class MainEx {
	public static void main(String[] args) {
		// ���� ���� ����
		// �ڷ��� ������ = �ڷ����� �´� ��;
		
		String msg = "hello";
		String msg2 = "hi";
		String msg3 = "good";
		String msg4 = "morning";
		
	
		System.out.println(msg);
		System.out.println(msg2);
		System.out.println(msg3);
		System.out.println(msg4);
		System.out.println(msg);
		System.out.println(msg3);
		System.out.println(msg2);
		System.out.println(msg);
		
		
		String msg5 = "it";
		String msg6 = "fill";
		String msg7 = "wow";
		String msg8 = "law";
		String msg9 = "what";
		String msg0 = "why";
		String msg11 = "cheer";
		String msg12 = "beep";
		String msg13 = "oops";
		String msg14 = "zip";
		String msg15 = "pop";
		String msg16 = "lol";
		String msg17 = "kick";
		String msg18 = "boo";
		String msg19 = "gap";
		String msg20 = "none";
		String msg21 = "walk";
		String msg22 = "orange";
		String msg24 = "pick";
		String msg25 = "will";
		String msg26 = "gick";
		String msg23 = "english";
	
		
		
		
	
		// ���� ���� ����
		// �ڷ��� ������ = �ڷ����� �´� ��;
		
		String f = "�̼���";
		System.out.println(f);
		
		
		// ���� ���� ����
		// �ڷ��� ������ = �ڷ����� �´� ��;
		
		long aaa = 2500000000L;
		
		char a = '��';
		System.out.println(a);
		
		long c = 10220022022002L;
		
		// byte = 1byte �Ҵ������ ǥ�������� -128~0~127
		// short = 2byte �Ҵ������ �� ������� ����
		// int = 4byte �Ҵ������ ǥ�� ������ �뷫 -21��~0~21��, ������ �⺻ �ڷ���
		// long = 8byte�� �Ҵ�޾� ���� ū ���ڹ����� ǥ���� �� �ִ� �ڷ���,
		// ���ÿ��� �� �ڿ� L/l�� �Է������ �Ѵ� ex) long a = 100000000000L;
		
		// float = 4byte�� �Ҵ�޴� �Ǽ� �ڷ���, ����� ���� �� �ڿ� F/f�� �Է��ؾ� ��
		// double = 8byte�� �Ҵ�޴� �Ǽ� �ڷ���, �Ǽ��� �⺻ �ڷ���
		
		// boolean = ���� ������ ��Ÿ���� �ڷ��� (true / fales)
		// char = �� �ܾ ������ ������ �� ����, �ݵ�� '' ��������ǥ ���
		// ex) char a = '��';
		
		
		
		
		
		// �ڷᰪ�� �ΰ����� ������.
		// �⺻�ڷ��� / �����ڷ���
		// �����ڷ����� �⺻ �ڷ����� �ƴ� �ڷ����̴�.
		// �⺻ �ڷ��� 8���� boolean, char, byte, short, int, long, float, double�� �ִ�.
		// 1. boolean : ���� ������ ��Ÿ���� �ڷ���. 1byte�� ������ 
		// true / false els �� �ΰ����� ����� �� �ִ� �ڷ���
		// 2. char : ���� �ϳ��� ��Ÿ�� �� �ִ� �ڷ���
		// char a = '��'; ó�� ���� �ϳ��� ��Ÿ���µ�, �ݵ�� ��������ǥ''���
		// (������ �ڷ���)
		// 3. byte : 1byte(8bit)�� �Ҵ�޴� ������ �ڷ���
		// ǥ�������� -128~127�� ������ ������ �ְ�, ��Ƽ�̵�� �۾��� �� �� �ַ� ���
		// 4. short : 2byte�� �Ҵ�޴� ������ �ڷ��������� �� ������� �ʴ´�
		// 5. int : 4byte�� �Ҵ�޴� ������ �ڷ����� �⺻��. 
		// ǥ�������� �뷫 -21��~21�� ������ ������ ������.
		// 6. lonh : 8byte�� �Ҵ�޾� ���� ū ���ڹ����� ������.
		// ����� ���� �� �ڿ� l/L�� �ٿ����ش�.
		// (�Ǽ��� �ڷ���)
		// 7. float : ���е��� ���� �Ǽ��� �ڷ���. ����� ���� �� �ڿ� f/F�� �ٿ� ���ش�. 4byte�� �Ҵ�޴´�.
		// 8. double : ���е��� ���� �Ǽ��� �ڷ���. �Ǽ��� �ڷ����� �⺻��. 8byte�� �Ҵ�޴´�.
	    
		
		
		// �ڷ����� ũ�� �ΰ����� ������.
		// �⺻�ڷ����� �����ڷ���
		// �����ڷ����� �⺻�ڷ����� �ƴ� ��� ���̰�
		// �⺻�ڷ����� boolean / char / byte / short / int / long / float / double �� 8���� �ִ�.
		// 1. boolean : 1byte�� �Ҵ�޴´�. ���� ������ ��Ÿ���� �ڷ���. ture/fales �� ������ ���� �� �ִ�.
		// 2. char : ���� �ϳ��� ������ ������ �ڷ���. char a = '��'; �� ���� ���� ����ǥ�� ����Ѵ�.
		// (������ �ڷ���)
		// 3. byte : 1byte(8bit)�� �Ҵ����. -128~127���� ǥ�� ����. �ַ� ��Ƽ�̵�� �۾� �� ���.
		// 4. short : 2byte�� �Ҵ������ �� ������� ����.
		// 5. int : �޸𸮿��� 4byte�� �Ҵ�ް�,�뷫 -21��~21���� ǥ�������� ������. ������ �ڷ����� �⺻.
		// 6. long : 8byte�� �Ҵ�޾� ���� ū ������ ������ �����ϴ�.
		// ����� ���� �� �ڿ� l/L�� �����ָ� �ȴ�.
		// (�Ǽ��� �ڷ���)
		// 7. float : ���е��� ���� ���� �Ǽ��� �ڷ���. 4byte�Ҵ����. ���ÿ��� �� �ڿ� F/f�� ����
		// 8. double : ���е��� ���� �Ǽ��� �ڷ���. �Ǽ��� �ڷ����� �⺻��. 8byte�� �Ҵ�޴´�.
		
		
		
		
		boolean z = true;
		boolean b = false;
		char x = '��';
		byte d = 127;
		short e = 234;
		int g = 93849;
		long h = 293943784749379L;
		float i = 3.14F;
		double j = 3.14156;
		
		
		
		boolean k = true;
		boolean l = false;
		char m = 'Ŀ';
		byte n = 25;
		short o = 198;
		int p = 26645;
		long q = 1231543123456421324L;
		float r = 22.4454F;
		double s = 34.23538448;
		
		System.out.println(l);
		
		
		
		// �ڷ����� �⺻�ڷ����� �����ڷ������� ����������.
		// �����ڷ����� �⺻�ڷ����� �ƴ� ���̴�.
		// �⺻�ڷ����� boolean,char,byte,short.int,long,float,double 8�����̴�.
		
		// 1. boolean : ������ ���� �������� ���� �� �ִ� �ڷ��� 
		boolean t = true;
		boolean u = false;
		// 2. char : ���� �ϳ��� ������ ������ �ڷ���, ���� �ݵ�� ��������ǥ''�ȿ� �Է��ؾ� �Ѵ�.
		char v = '��'; 
		char ff = '��';
		// (������ �ڷ���)
		// 3. byte : ǥ���� �� �ִ� ������ -128~127�� �ڷ���. �ַ� ��Ƽ�̵�� �۾��ÿ� �����
		byte w = 25;
		// 4. short : 2byte�� �Ҵ�޴� �ڷ��������� �� ������� �ʴ´�.
		short aa = 255;
		// 5. int : ������ �ڷ����� �⺻��. ǥ�������� �뷫 -21��~21���� ������ ������.
		int bb = 21366445;
		// 6. long : ���� ū ������ ������ ������ �ڷ���. ����ϰ� ���� ���� �� �ڿ� l/L�� ����� �Ѵ�.
		long cc = 1234567891523456L;
		// (�Ǽ��� �ڷ���)
		// 7. float : ���е��� ���� ���� �Ǽ��� �ڷ���. ����ϰ� ���� ���� �� �ڿ� f/F�� ����� �Ѵ�.
		float dd = 2.4564F;
		// 8. double : ���е��� ���� �Ǽ��� �ڷ���. �Ǽ��� �ڷ����� �⺻.
		double ee = 3.45612375466313;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// �ڷ����� ũ�� �ΰ����� ������.
		// �⺻�ڷ����� �����ڷ���
		// �����ڷ����� �⺻�ڷ����� �ƴ� ���̰�
		// �⺻�ڷ�����
		// boolean, char, byte, short, int, long, float, double �� 8������ �ִ�.
		// 1. boolean : ������ ���� �������� ���� �� �ִ� �ڷ���
		boolean gg = true;
		boolean hh = false;
		// 2. char : ������ ���� �ϳ����� ���� �� �ִ� �ڷ���
		char ii = '��';
		// ���� �ݵ�� ���� ����ǥ �ȿ� ������Ѵ�
		// (������ �ڷ���)
		// 3. byte : -128~127�� ������ �ִ� ���ڸ� ǥ���� �� �ִ�. �ַ� ��Ƽ�̵�� �۾��� ����Ѵ�.
		byte jj = 36;
		// 4. short : �� ������� ����
		// 5. int : ������ �ڷ����� �⺻ �ڷ���. �뷫 -21��~21���� ���ڹ����� ������.
		int kk = 123456;
		// 6. long : ������ �ڷ������� ���� ū ���ڸ� ǥ���� �� �ִ� �ڷ���. 
		// ����ϰ� ���� ���� �� �ڿ� L/l�� ���ش�
		long ll = 12345678465431L;
		// (�Ǽ��� �ڷ���)
		// 7. float : ���е��� ���� �Ǽ��� �ڷ���. ����� ���� �� �ڿ� f/F�� �� �ش�.
		float mm = 3.1245F;
		// 8. double : ���е��� ���� �Ǽ��� �ڷ���. �Ǽ��� �ڷ����� �⺻��.
		double nn = 3.124564231;
		
		System.out.println(nn);
		
		System.out.println(kk);
		
		System.out.println(a);
		
		
				
		
	}

}