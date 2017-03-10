package cn.com.provider.settings.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Howell on 13/12/16.
 */
@Configuration
@ConfigurationProperties(prefix = "app")
@Data
public class AppSettings {
    String mysql_aliyun;
    String mysql_aliyun_user;
    String mysql_aliyun_pass;
    String mysql_aliyun_driver;
    String mysql_aliyun_url;
    String mysql_aliyun_maxActive;
    String mysql_aliyun_minIdle;
    String mysql_aliyun_maxWait;
    String mysql_aliyun_timeBetweenEvictionRunsMillis;
    String redis_pool_maxTotal;
    String redis_pool_maxIdle;
    String redis_pool_maxWaitMillis;
    String redis_pool_testOnBorrow;
    String redis_pool_testOnReturn;
    String redis_sentinel_master;
    String redis_sentinel_nodes;
}
