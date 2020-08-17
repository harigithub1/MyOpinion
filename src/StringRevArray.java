import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringRevArray {

	public static void main(String args[]) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String str = br.readLine();
		char c[] = str.toCharArray();
		int begin = 0, end = c.length - 1;
		while (end > begin) {
			char temp = c[end];
			c[end] = c[begin];
			c[begin] = temp;
			end--;
			begin++;
		}
		System.out.println(c);

	}

}
