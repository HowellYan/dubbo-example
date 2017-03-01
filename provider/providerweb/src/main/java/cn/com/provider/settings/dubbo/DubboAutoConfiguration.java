package cn.com.provider.settings.dubbo;

import com.alibaba.dubbo.config.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(DubboProperties.class)
public class DubboAutoConfiguration {

    @Autowired
    private DubboProperties dubboProperties;

    @Bean
    public ApplicationConfig requestApplicationConfig() {
        return dubboProperties.getApplication();
    }

    /**
     * 注册
     * @return
     */
    @Bean
    public RegistryConfig requestRegistryConfig() {
        return dubboProperties.getRegistry();
    }

    /**
     * 协议
     * @return
     */
    @Bean
    public ProtocolConfig requestProtocolConfig() {
        return dubboProperties.getProtocol();
    }

    /**
     * 生产者配置
     * @return
     */
    @Bean
    public ProviderConfig requestProviderConfig(){
        return dubboProperties.getProvider();
    }

    /**
     * 消费者配置
     * @return
     */
    @Bean
    public ConsumerConfig requestConsumerConfig(){
        return dubboProperties.getConsumer();
    }
}
