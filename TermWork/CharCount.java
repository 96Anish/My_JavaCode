import java.util.Scanner;
public class CharCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine().toUpperCase(); 
        int[] freq = new int[256];
        for (char ch : str.toCharArray()) {
            if (ch != ' ') 
            { 
                freq[ch]++;
            }
        }
        System.out.println("Character Frequencies:");
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                System.out.println((char) i + "=" + freq[i]);
            }
        }
        //sc.close();
    }
}
