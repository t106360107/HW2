import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test_p32 {
	public static void main(String[] args) throws IOException {
		System.out.println("�аݦb�ĴX���B�z�����j��O?(1~10)");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int res = Integer.parseInt(str);
		for (int i = 1; i <= 10; i++) {
			System.out.println("��" + i + "�����j��");
			if(i == res)
				break;
		}
	}
}
