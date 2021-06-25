package date;

import org.junit.jupiter.api.Test;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.util.Arrays;
import java.util.TimeZone;

public class NewTimeApi {
    /**
     * 获取某月的最后一天
     */
    @Test
    public void lastDayOfMonth() {
        LocalDate today = LocalDate.now();
        //本月的第一天
        LocalDate firstday = LocalDate.of(today.getYear(), today.getMonth(), 1);
        //本月的最后一天
        LocalDate lastDay = today.with(TemporalAdjusters.lastDayOfMonth());
        System.out.println("本月的第一天" + firstday);
        System.out.println("本月的最后一天" + lastDay);
    }

    @Test
    public void testClock() {
        Clock c = Clock.system(ZoneId.systemDefault());
        Instant instant = c.instant();
        System.out.println("instant.toString() = " + instant.toString());
    }

    /**
     * 时区类
     */
    @Test
    public void testzonedDateTime() {
        System.out.println(
                "当前时区时间" + ZonedDateTime.now() +
                        "\n构造时区时间" + ZonedDateTime.of(LocalDateTime.now(), ZoneId.of("Asia/Shanghai")) +
                        "\n所有可用的时区id" + ZoneId.getAvailableZoneIds()
        );
    }

    /**
     * 计算时间差
     */
    @Test
    public void testDTF() {
        //只有 时,分,秒 . 为0不显示. 可以 todays()
        LocalTime lt1 = LocalTime.of(22, 59, 59);
        LocalTime lt2 = LocalTime.of(0, 0, 0);
        Duration du = Duration.between(lt2, lt1);
        System.out.println(du.toHours());//相差的小时数 可能是负数
        System.out.println(du.getSeconds());
        System.out.println(du.toMinutes());
        System.out.println(du);

        System.out.println("----------------------------------------");

        LocalDateTime dateTime1 = LocalDateTime.of(1890, 3, 3, 3, 3, 3);
        LocalDateTime dateTime2 = LocalDateTime.now();
        Duration duration = Duration.between(dateTime1, dateTime2);
        System.out.println(duration.toDays());
        System.out.println(duration);
    }

    /**
     * 计算时间差
     */
    @Test
    public void testDTTF() {
        LocalDateTime lt1 = LocalDateTime.of(2009, Month.JULY, 22, 12, 59, 59);
        LocalDateTime lt2 = LocalDateTime.of(2019, Month.JULY, 22, 22, 59, 58);
        Duration du = Duration.between(lt2, lt1);
        System.out.println("du.toDays() = " + du.toDays());
        System.out.println("du.toHours() = " + du.toHours());
        System.out.println("du.toMinutes() = " + du.toMinutes());
        System.out.println("du.getSeconds() = " + du.getSeconds());
        System.out.println("du.toMillis() = " + du.toMillis());
        System.out.println("du.toNanos() = " + du.toNanos());
    }

    /**
     * 格式化时间
     */
    @Test
    public void testFormat() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss E");

        LocalDateTime ldt = LocalDateTime.now();
        String strDate = ldt.format(dtf);
        System.out.println(strDate);
    }

    /**
     * 枚举的月份和星期类
     */
    @Test
    public void testMonthAndWeek() {
        System.out.println("月份：" + Arrays.toString(Month.values()) +
                "\n星期：" + Arrays.toString(DayOfWeek.values()) +
                "\n月份int转name:" + Month.of(3)
        );
    }

    /**
     * 年类
     */
    @Test
    public void testYear() {
        Year y = Year.now();
        System.out.println("天数：" + y.length() + ";是否闰年:" + y.isLeap() + ";年份值:" + y.getValue());

    }

    /**
     * 日期类
     */
    @Test
    public void testLocalDate() {
        LocalDate ld = LocalDate.now();//等价于LocalDate.now(Clock.systemDefaultZone())
        System.out.println("日期：" + ld + "；年：" + ld.getYear() + "；月：" + ld.getMonthValue() + "；月中天：" + ld.getDayOfMonth() + "\n" +
                "年中天:" + ld.getDayOfYear() + ";周中天:" + ld.getDayOfWeek() + ";是否闰年:" + ld.isLeapYear() + ";月份天数:" + ld.lengthOfMonth() + "\n" +
                ";年天数:" + ld.lengthOfYear()
        );
        LocalDate a = LocalDate.of(2012, 7, 2);
        LocalDate b = LocalDate.of(2012, 7, 2);
        System.out.println("a在b之后吗？" + a.isAfter(b) + "\n" + "a在b之前吗？" + a.isBefore(b) + "\n" + "a和b同一天吗？" + a.isEqual(b));
    }

    /**
     * 时间类
     */
    @Test
    public void testLocalTime() {
        LocalTime lt = LocalTime.now();
        System.out.println("当前时间到毫秒" + lt + "；时间" + lt.getHour() + "：" + lt.getMinute() + "：" + lt.getSecond() + "." + lt.getNano());
    }

    /**
     * 日期和时间类
     */
    @Test
    public void testLocalDateTime() {
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println("当前日期时间" + ldt + "；年：" + ldt.getYear() + "；月：" + ldt.getMonthValue() + "；日：" + ldt.getDayOfMonth() + "；时间" + ldt.getHour() + "：" + ldt.getMinute() + "：" + ldt.getSecond() + "." + ldt.getNano());

    }

    /**
     * 秒类
     */
    @Test
    public void testInstant() {
        Instant is = Instant.now();
        System.out.println("1970-01-01到现在的秒" + is.getEpochSecond() + "==毫秒==" + is.toEpochMilli());
    }

    /**
     * 毫秒 to 时间
     */
    @Test
    public void testInstantToTime() {
        long millis = System.currentTimeMillis();
        LocalDateTime.ofInstant(Instant.ofEpochMilli(millis), ZoneId.of("Asia/ShangHai"));
    }

    /**
     * 毫秒 to 时间
     */
    @Test
    public void testTimeToInstant() {
        long l = LocalDateTime.now().toInstant(ZoneOffset.of("+8")).toEpochMilli();
    }


}


