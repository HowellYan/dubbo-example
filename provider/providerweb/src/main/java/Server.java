import cn.com.provider.settings.MyBatis.MyBatisLog;
import cn.com.provider.settings.Ratpack.StartRatpack;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by Howell on 28/2/17.
 * e-mail:th15817161961@gmail.com
 */
@SpringBootApplication
@StartRatpack
@ComponentScan({
        "cn.com.provider"
})
@MapperScan({
        "cn.com.provider"
})
public class Server {
    public static void main(String[] args) {
        org.apache.ibatis.logging.LogFactory.useCustomLogging(MyBatisLog.class);

        SpringApplication.run(Server.class, args);
    }
}
