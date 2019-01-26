package moxi.core.demo.config;

import lombok.extern.slf4j.Slf4j;
import moxi.core.demo.remoteservice.CustomerWalletLogOuterService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.remoting.httpinvoker.HttpComponentsHttpInvokerRequestExecutor;
import org.springframework.remoting.httpinvoker.HttpInvokerProxyFactoryBean;

@Configuration
@Slf4j
public class MoxiServiceConfiguration {
    @Value("${moxi.remote}")
    private String moxiCoreUrl;

    @Bean
    public HttpInvokerProxyFactoryBean customerWalletLogInvokeService() {
        HttpInvokerProxyFactoryBean httpInvokerProxyFactoryBean = new HttpInvokerProxyFactoryBean();
        httpInvokerProxyFactoryBean.setServiceInterface(CustomerWalletLogOuterService.class);
        httpInvokerProxyFactoryBean.setServiceUrl(moxiCoreUrl + "/customerWalletLogOuterService");
        httpInvokerProxyFactoryBean.setHttpInvokerRequestExecutor(httpInvokerRequestExecutor());
        log.info("push customerWalletLogInvokeService success  {} ", moxiCoreUrl);
        return httpInvokerProxyFactoryBean;
    }

    @Bean
    public HttpComponentsHttpInvokerRequestExecutor httpInvokerRequestExecutor() {
        HttpComponentsHttpInvokerRequestExecutor httpInvokerRequestExecutor = new HttpComponentsHttpInvokerRequestExecutor();
        httpInvokerRequestExecutor.setReadTimeout(5000);
        httpInvokerRequestExecutor.setConnectTimeout(10000);
        httpInvokerRequestExecutor.setConnectionRequestTimeout(10000);
        httpInvokerRequestExecutor.setContentType(MediaType.APPLICATION_JSON_UTF8_VALUE);
        httpInvokerRequestExecutor.setAcceptGzipEncoding(true);
        return httpInvokerRequestExecutor;
    }
}
