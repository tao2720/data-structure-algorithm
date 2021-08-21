import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
*
* */
public class Demo03_Date {

    public static void main(String[] args) throws ParseException {

        Scanner sc=new Scanner(System.in);
        System.out.println("请输入出生日期（yyyy-MM-dd）");
        String birthdayDateString=sc.next();


        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        Date birthdayDate=sdf.parse(birthdayDateString);

        long birthdayDateTime=birthdayDate.getTime();

        long todayTime=new Date().getTime();

        long time=todayTime-birthdayDateTime;

        System.out.println(time/1000/60/60/24);

    }
}
