package by;

public class Triangle {

	public static void main(String[] args) {
		 int count = 10;
		 
	        // ������� ����
	        for(int i=0; i < count; i++) {
	            // ���������� ���� ��� ������ ����� ������
	            // �������� �������� �� ��������� k < i+1
	            // � ��� ��� �������� ������������
	            for(int k=0; k < i+1; k++) {
	                System.out.print("* ");
	                
	            }
	            // ������� �� ��������� ������
	            System.out.println();
	        }
	}

}
