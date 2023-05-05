import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class A1063353_0421_1 {
           
	
	public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("請輸入電子郵件地址：");
	        String email = scanner.nextLine();
	        scanner.close();
	        String pattern = "^[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,}$";
	        Pattern regex = Pattern.compile(pattern);
	        Matcher matcher = regex.matcher(email.toLowerCase());
	        if (matcher.matches()) {
	            System.out.println("輸入的電子郵件地址為有效格式。");
	        } else {
	            System.out.println("輸入的電子郵件地址為無效格式。");
	        }
	    }
	}


