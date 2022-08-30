package com.hendisantika.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.spring5.SpringTemplateEngine;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-mailgun-template
 * User: powercommerce
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 8/30/22
 * Time: 08:02
 * To change this template use File | Settings | File Templates.
 */
@Configuration
public class TemplateEngineConfig implements WebMvcConfigurer {
    private static final String EMAIL_TEMPLATE_ENCODING = "UTF-8";

    @Bean
    @Primary
    public TemplateEngine emailTemplateEngine() {
        final SpringTemplateEngine templateEngine = new SpringTemplateEngine();
        // Resolver for HTML emails (except the editable one)
        templateEngine.addTemplateResolver(emailTemplateResolver());

        return templateEngine;
    }
}
