//3 Collaborators:
//1. 6330300208 : Yadaporn Ajmontri
//2. 6330300461 Terapat Malaob
//3. 6330300879 Supanut Klakerdpol
package bot;
import java.util.Scanner;
public class Tamjung {

    private Scanner scanner;
    private String botName;
    private int createdYear;

    Tamjung(String botName, int createdYear) {
        this.scanner = new Scanner(System.in);
        this.botName = botName;
        this.createdYear = createdYear;
    }

    void greeting() {
        System.out.println("สวัสดี! ฉันชื่อ "+botName);
        System.out.println("ฉันถูกสร้างขึ้นเมื่อปี "+createdYear);
        System.out.println("เธอชื่ออะไร?");
        System.out.print(">");
        String name = scanner.nextLine();
        System.out.println("สวัสดี " + name+"!");


    }

    void guessAge() {
        int d;
        System.out.println("ฉันจะเดาว่าเธออายุเท่าไหร่");
        System.out.println("ช่วยบอก เศษที่ได้จากการหารอายุของเธอด้วย 3 5 และ 7");
        System.out.print(">");
        int three = scanner.nextInt();
        System.out.print(">");
        int five = scanner.nextInt();
        System.out.print(">");
        int seven = scanner.nextInt();
        d = (three * 70 + five * 21 + seven * 15) % 105;
        System.out.println("เธออายุ "+d+" : เป็นช่วงอายุที่น่าสนุกมากของชีวิตเลย!");

    }

    void countNumber() {



        System.out.println("ตอนนี้ ฉันจะแสดงให้เธอเห็นว่าฉันนับเลข 1-100ได้นะ");
        System.out.println("เธอต้องการให้ฉันนับถึงเลขอะไร?");
        System.out.print(">");
        double cot = scanner.nextDouble();
        int i=1;
        while ( i<= cot)
        {

            System.out.println (i  + "!");
            ++i;

        }

    }

    void quiz() {
        System.out.println("ฉันขอทดสอบความรู้เกี่ยวกับการเขียนโปรแกรมของเธอหน่อยนะ");
        System.out.println("ทำไมเราถึงต้องใช้ method?");
        System.out.println("ก. เพื่อรันคำสั่งซ้ำหลาย ๆ ครั้ง");
        System.out.println("ข. เพื่อแบ่งโปรแกรมออกเป็น subroutine เล็กๆ หลายๆ รูทีน");
        System.out.println("ค. เพื่อวัดเวลาการรันโปรแกรม");
        System.out.println("ง. เพื่ออินเตอร์รัพการทำงานของโปรแกรม");
        String f;

        System.out.print(">");
        f = scanner.next();
        while(!f.equals("ข")){
            System.out.println("ผิด! ลองใหม่อีกครั้งนะ");
            System.out.print(">");
            f = scanner.next();
        }
        System.out.print("ยินดีด้วย เธอตอบถูก!");
    }

    public static void main(String[] args) {
        Tamjung bot = new Tamjung("tamjung", 2020);
        bot.greeting();
        bot.guessAge();
        bot.countNumber();
        bot.quiz();
    }
}


