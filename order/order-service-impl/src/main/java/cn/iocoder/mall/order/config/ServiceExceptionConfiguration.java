package cn.iocoder.mall.order.config;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.EventListener;

@Configuration
public class ServiceExceptionConfiguration {

    @EventListener(ApplicationReadyEvent.class) // 可参考 https://www.cnblogs.com/ssslinppp/p/7607509.html
    public void initMessages() {
//        从 service_exception_message.properties 加载错误码的方案
//        Properties properties;
//        try {
//            properties = PropertiesLoaderUtils.loadAllProperties("classpath:service_exception_message.properties");
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
    }
}