package myCode.date;

import org.junit.jupiter.api.Test;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class NewTimeApi {

    @Test
    public void testClock(){
        Clock c = Clock.system(ZoneId.systemDefault());
        Instant instant = c.instant();
        System.out.println("instant.toString() = " + instant.toString());
    }
    /**
     * ʱ����
     */
    @Test
    public void testzonedDateTime() {
        System.out.println(
                "��ǰʱ��ʱ��" + ZonedDateTime.now() +
                        "\n����ʱ��ʱ��" + ZonedDateTime.of(LocalDateTime.now(), ZoneId.of("Asia/Shanghai")) +
                        "\n���п��õ�ʱ��id" + ZoneId.getAvailableZoneIds()
        );
    }

    /**
     * ����ʱ���
     */
    @Test
    public void testDTF() {
        LocalTime lt1 = LocalTime.of(22, 59, 59);
        LocalTime lt2 = LocalTime.of(0, 0, 0);
        Duration du = Duration.between(lt2, lt1);
        System.out.println(du.toHours());//����Сʱ�� �����Ǹ���
        System.out.println(du.getSeconds());
    }

    /**
     * ����ʱ���
     */
    @Test
    public void testDTTF() {
        LocalDateTime lt1 = LocalDateTime.of(2009,Month.JULY,22,12, 59, 59);
        LocalDateTime lt2 = LocalDateTime.of(2019,Month.JULY,22,22, 59, 58);
        Duration du = Duration.between(lt2, lt1);
        System.out.println("du.toDays() = " + du.toDays());
        System.out.println("du.toHours() = " + du.toHours());
        System.out.println("du.toMinutes() = " + du.toMinutes());
        System.out.println("du.getSeconds() = " + du.getSeconds());
        System.out.println("du.toMillis() = " + du.toMillis());
        System.out.println("du.toNanos() = " + du.toNanos());
    }

    /**
     * ��ʽ��ʱ��
     */
    @Test
    public void testFormat() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy��MM��dd�� HH:mm:ss E");

        LocalDateTime ldt = LocalDateTime.now();
        String strDate = ldt.format(dtf);
        System.out.println(strDate);
    }

    /**
     * ö�ٵ��·ݺ�������
     */
    @Test
    public void testMonthAndWeek() {
        System.out.println("�·ݣ�" + Arrays.toString(Month.values()) +
                "\n���ڣ�" + Arrays.toString(DayOfWeek.values()) +
                "\n�·�intתname:" + Month.of(3)
        );
    }

    /**
     * ����
     */
    @Test
    public void testYear() {
        Year y = Year.now();
        System.out.println("������" + y.length() + ";�Ƿ�����:" + y.isLeap() + ";���ֵ:" + y.getValue());

    }

    /**
     * ������
     */
    @Test
    public void testLocalDate() {
        LocalDate ld = LocalDate.now();//�ȼ���LocalDate.now(Clock.systemDefaultZone())
        System.out.println("���ڣ�" + ld + "���꣺" + ld.getYear() + "���£�" + ld.getMonthValue() + "�������죺" + ld.getDayOfMonth() + "\n" +
                "������:" + ld.getDayOfYear() + ";������:" + ld.getDayOfWeek() + ";�Ƿ�����:" + ld.isLeapYear() + ";�·�����:" + ld.lengthOfMonth() + "\n" +
                ";������:" + ld.lengthOfYear()
        );
        LocalDate a = LocalDate.of(2012, 7, 2);
        LocalDate b = LocalDate.of(2012, 7, 2);
        System.out.println("a��b֮����" + a.isAfter(b) + "\n" + "a��b֮ǰ��" + a.isBefore(b) + "\n" + "a��bͬһ����" + a.isEqual(b));
    }

    /**
     * ʱ����
     */
    @Test
    public void testLocalTime() {
        LocalTime lt = LocalTime.now();
        System.out.println("��ǰʱ�䵽����" + lt + "��ʱ��" + lt.getHour() + "��" + lt.getMinute() + "��" + lt.getSecond() + "." + lt.getNano());
    }

    /**
     * ���ں�ʱ����
     */
    @Test
    public void testLocalDateTime() {
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println("��ǰ����ʱ��" + ldt + "���꣺" + ldt.getYear() + "���£�" + ldt.getMonthValue() + "���գ�" + ldt.getDayOfMonth() + "��ʱ��" + ldt.getHour() + "��" + ldt.getMinute() + "��" + ldt.getSecond() + "." + ldt.getNano());

    }

    /**
     * ����
     */
    @Test
    public void testInstant() {
        Instant is = Instant.now();
        System.out.println("1970-01-01�����ڵ���" + is.getEpochSecond() + "==����==" + is.toEpochMilli());
    }
}


