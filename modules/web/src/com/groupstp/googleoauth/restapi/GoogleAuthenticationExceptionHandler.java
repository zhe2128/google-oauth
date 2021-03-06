package com.groupstp.googleoauth.restapi;

import com.haulmont.restapi.controllers.RestControllerExceptionHandler;
import org.springframework.web.bind.annotation.ControllerAdvice;

/**
 * Rest exceptions handler
 *
 * @author adiatullin
 */
@ControllerAdvice("com.groupstp.googleoauth.restapi")
public class GoogleAuthenticationExceptionHandler extends RestControllerExceptionHandler {
}
