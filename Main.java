package testClass;

import java.util.Scanner;
import java.util.Random;


public class Main {

	public static void main(String[] args) {
		int value = 0;
		int num;
		char letter;
		int num_correct = 0;
		Scanner scnr = new Scanner(System.in);
		
		while(num_correct < 5) {
			num = returnNum();
			letter = returnChar();			
			if(letter != 'n') {
				System.out.println("log " + num + letter + " = ");
			}
			else { System.out.println("log " + num + " = "); }
			
			value = scnr.nextInt();
			
			if(value == answer(num, letter)) {
				num_correct++;
				System.out.println(num_correct + " in a row CORRECT");
			}
			else {
				num_correct = 0;
				System.out.println("The correct answer is " + answer(num, letter));
				System.out.println("0 in a row CORRECT");
			}
		}
		System.out.println("Congratulations! You are super awesome. When it comes time to pick a team, I'll pick YOU.");
	}
	
	private static int answer(int num, char letter) {
		int answer = 0;
		
		if (letter == 'K') answer += 10;
		else if (letter == 'M') answer += 20;
		else if (letter == 'G') answer += 30;
		else if (letter == 'T') answer += 40;
		
		if(num == 2) answer += 1;
		else if(num == 4) answer += 2;
		else if(num == 8) answer += 3;
		else if(num == 16) answer += 4;
		else if(num == 32) answer += 5;
		else if(num == 64) answer += 6;
		else if(num == 128) answer += 7;
		else if(num == 256) answer += 8;
		else if(num == 512) answer += 9;
		return answer;
	}

	private static int random_number_gen(int num_of_options) {
		Random rand = new Random();
		int num = rand.nextInt(num_of_options);
		return num;
	}
	
	private static int returnNum() {
		int[] numbers = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512};
		return numbers[random_number_gen(10)];
	}
	
	private static char returnChar() {
		char[] chars = {'n', 'K', 'M', 'G', 'T'}; // 'n' for "none"
		return chars[random_number_gen(5)];
	}
	
}
