import cn.com.provider.settings.MyBatis.MyBatisLog;
import cn.com.provider.settings.Ratpack.StartRatpack;
import cn.com.provider.settings.properties.RatpackSettings;
import lombok.extern.slf4j.Slf4j;
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
@Slf4j
public class Server {

    public static void main(String[] args) {
        for (String i : args) {
            if(i.contains("-port=")){
                RatpackSettings.port = Integer.parseInt(i.replaceAll("-port=",""));
                log.info("port is []", RatpackSettings.port);
            }
        }

        org.apache.ibatis.logging.LogFactory.useCustomLogging(MyBatisLog.class);

        SpringApplication.run(Server.class, args);
    }
}
