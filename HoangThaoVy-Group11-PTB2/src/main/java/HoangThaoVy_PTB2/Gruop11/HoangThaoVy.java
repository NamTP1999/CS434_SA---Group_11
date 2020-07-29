package HoangThaoVy_PTB2.Gruop11;

import java.util.Scanner;

public class HoangThaoVy {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);

		System.out.print("Nháº­p há»‡ sá»‘ báº­c 2, a = ");
		int a = ip.nextInt();
		System.out.print("Nháº­p há»‡ sá»‘ báº­c 1, b = ");
		int b = ip.nextInt();
		System.out.print("Nháº­p háº±ng sá»‘ tá»± do, c = ");
		int c = ip.nextInt();
		GiaiPhuongTrinhBac2(a, b, c);
	}

	public static void GiaiPhuongTrinhBac2(int a, int b, int c) {

		if (a == 0) {
			if (b == 0) {
				System.out.println("PhÆ°Æ¡ng trÃ¬nh vÃ´ nghiá»‡m!");
			} else {
				System.out.println("PhÆ°Æ¡ng trÃ¬nh cÃ³ má»™t nghiá»‡m: " + "x = " + (-c / b));
			}
			return;
		}

		float delta = b * b - 4 * a;
		float x1;
		float x2;

		if (delta > 0) {
			x1 = (float) ((-b + Math.sqrt(delta)) / (2 * a));
			x2 = (float) ((-b - Math.sqrt(delta)) / (2 * a));
			System.out.println("PhÆ°Æ¡ng trÃ¬nh cÃ³ 2 nghiá»‡m lÃ : " + "x1 = " + x1 + " vÃ  x2 = " + x2);
		} else if (delta == 0) {
			x1 = (-b / (2 * a));
			System.out.println("PhÆ°Æ¡ng trÃ¬nh cÃ³ nghiá»‡m kÃ©p: " + "x1 = x2 = " + x1);
		} else {
			System.out.println("PhÆ°Æ¡ng trÃ¬nh vÃ´ nghiá»‡m!");
		}
	}

}
