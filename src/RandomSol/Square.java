package RandomSol;

public class Square {

	public static void main(String[] args) {
		 int count = 10;
		 
	        // Внешний цикл
	        for(int i=0; i < count; i++) {
	            // Внутренний цикл для печати одной строки
	            for(int k=0; k < count; k++) {
	                // Вот наше сложное условие
	                if(k==0 || k==count-1 || i==0 || i==count-1) {
	                    System.out.print("*");
	                } else {
	                    System.out.print(" ");
	                }
	            }
	            // Переход на следующую строку
	            System.out.println();
	        }
	}

}
