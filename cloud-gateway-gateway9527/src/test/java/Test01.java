import java.time.ZonedDateTime;

public class Test01 {
    public static void main(String[] args) {
        ZonedDateTime zbj = ZonedDateTime.now();;
        System.out.println(zbj); //2021-06-26T10:01:37.580+08:00[Asia/Shanghai]
        //        ZonedDateTime zny = ZonedDateTime.now(ZoneId.of("America/New_York")); // 用指定时区获取当前时间
        //        System.out.println(zny);
    }
}
