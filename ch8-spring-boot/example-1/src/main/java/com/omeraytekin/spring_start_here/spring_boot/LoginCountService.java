package com.omeraytekin.spring_start_here.spring_boot;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.ApplicationScope;

@Service
@ApplicationScope
public class LoginCountService {
    private int count;

    public void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}
