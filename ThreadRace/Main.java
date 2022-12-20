import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		
		ArrayList<Integer> mainList = new ArrayList<>();
		ArrayList<Integer> listOne = new ArrayList<>(2500);
		ArrayList<Integer> listTwo = new ArrayList<>(2500);
		ArrayList<Integer> listThree = new ArrayList<>(2500);
		ArrayList<Integer> listFour = new ArrayList<>(2500);
		
		for (int i = 1; i < 10000; i++) {
			mainList.add(i);
		}

		listOne.addAll(mainList.subList(0, 2500));
		listTwo.addAll(mainList.subList(2500, 5000));
		listThree.addAll(mainList.subList(5000, 7500));
		listFour.addAll(mainList.subList(7500, 10000));

		Thread t1 = new Thread(new Race(listOne));
		Thread t2 = new Thread(new Race(listTwo));
		Thread t3 = new Thread(new Race(listThree));
		Thread t4 = new Thread(new Race(listFour));

		t1.start();
		t2.start();
		t3.start();
		t4.start();
		

		/*
		 * 1'den 10000 (10 bin)'e kadar olan sayılardan oluşan bir ArrayList
		 * oluşturunuz. Ardından, bu ArrayList'teki 10 bin elemanı 2500 eleman olacak
		 * şekilde 4 eşit parçaya ayırınız. Bu 4 ayrı 2500 elemanlık ArrayList'ler
		 * içinde tek ve çift sayıları bulan 4 ayrı Thread tasarlayınız.
		 * 
		 * 4 Thread bulduğu çift sayıları ortak bir ArrayList'e ekleyecektir.
		 * 
		 * 4 Thread bulduğu tek sayıları ortak bir ArrayList'e ekleyecektir.
		 * 
		 * Tek ve çift sayıları tutan ArrayList'ler ilk oluşturulduklarında boş
		 * olacaklardır. Ve iki tane ArrayList olacaklardır.
		 * 
		 * 4 Thread kendine ait 2500 elemanlık ArrayList'i işlemeye başlayınca tek ve
		 * çift sayı ArrayList'lerini dolduracaktır.
		 */

	}

}
