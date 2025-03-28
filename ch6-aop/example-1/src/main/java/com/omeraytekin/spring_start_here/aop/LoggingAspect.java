package com.omeraytekin.spring_start_here.aop;

import java.util.Arrays;
import java.util.logging.Logger;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
    private Logger logger = Logger.getLogger(LoggingAspect.class.getName());

    @Around("execution(* com.omeraytekin.spring_start_here.aop.CommentService.publishComment(..))")
    public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
        String methodName = joinPoint.getSignature().getName();
        Object[] arguments = joinPoint.getArgs();
        Comment comment = new Comment();
        comment.setText("Some other text!");
        Object[] newArguments = { comment };
        logger.info("Method " + methodName +
                " parameters was " + Arrays.asList(arguments) +
                " new parameters are " + Arrays.asList(newArguments) +
                " will execute");
        Object returnedByMethod = joinPoint.proceed();
        logger.info("Method executed and returned " + returnedByMethod);
        logger.info("But aspect will return " + "FAILED");
        return "FAILED";
    }
}