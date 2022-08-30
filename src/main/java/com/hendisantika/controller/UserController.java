package com.hendisantika.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.core.env.Environment;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.RestController;
import org.thymeleaf.TemplateEngine;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-mailgun-template
 * User: powercommerce
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 8/30/22
 * Time: 08:03
 * To change this template use File | Settings | File Templates.
 */
@RestController
@RequiredArgsConstructor
public class UserController {
    private static final String TEMPLATE_NAME = "registration";
    private static final String SPRING_LOGO_IMAGE = "templates/images/spring.png";
    private static final String PNG_MIME = "image/png";
    private static final String MAIL_SUBJECT = "Registration Confirmation";

    private final Environment environment;

    private final JavaMailSender mailSender;

    private final TemplateEngine htmlTemplateEngine;
}
