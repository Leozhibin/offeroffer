import java.util.Scanner;
/**
 * 十进制转换为任意进制
 * @author 时光·漫步
 *
 */
public class jinzhi {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入目标数的进制：");
        int jinzhi = scanner.nextInt();

        System.out.print("请输入要转换的数字：");
        int num = scanner.nextInt();

        scanner.close();

        String str = Integer.toString(num,jinzhi);
        System.out.println(str);
    }

}