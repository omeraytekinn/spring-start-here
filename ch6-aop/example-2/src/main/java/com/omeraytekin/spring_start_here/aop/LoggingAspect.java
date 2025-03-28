package com.omeraytekin.spring_start_here.aop;

import java.util.Arrays;
import java.util.logging.Logger;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
    private Logger logger = Logger.getLogger(LoggingAspect.class.getName());

    @Around("@annotation(ToLog)")
    public void log(ProceedingJoinPoint joinPoint) throws Throwable {
        String methodName = joinPoint.getSignature().getName();
        Object[] arguments = joinPoint.getArgs();
        logger.info("Method " + methodName +
                " with parameters " + Arrays.asList(arguments) +
                " will execute");
        joinPoint.proceed();
        logger.info("Method executed");
    }

    @AfterReturning(value = "@annotation(ToLog)", returning = "returnedValue")
    public void logResult(Object returnedValue) {
        logger.info("Method executed and returned " + returnedValue);
    }
}