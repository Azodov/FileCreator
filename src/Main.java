import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Fayllarni qanday nom bilan yaratilgan papkaga joylamoqchisiz");
        String dirname = scanner.nextLine();

        System.out.println("Fayl formati qanday bo'lsin");
        String format = scanner.nextLine();

        System.out.println("Nechta file yaratilsin");
        int n = scanner.nextInt();

        scanner.close();


        File dir = new File("src/"+dirname);

        if (dir.mkdir()) {
            System.out.println(dir.getName()+": "+"nomli papka yaratildi: ");
        } else {
            System.out.println("Bunday nomli papka avvaldan mavjud bo'lishi mumkin iltimos boshqa nom qo'yib ko'ring.");
        }


        for (int i = 1; i <= n; i++) {
            try {
                File myObj = new File("src/"+dirname+"/"+i+"."+format);
                if (myObj.createNewFile()) {
                    System.out.println(myObj.getName()+": "+"nomli fayllar yaratildi:");
                } else {
                    System.out.println("Bunday fayl avvaldan bor bo'lishi mumkin:");
                }
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        }
    }
}
