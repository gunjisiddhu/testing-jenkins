package com.epam.calcjenkinstest;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Calculator {




    public int addTwoNumbers(int num1,int num2) {
        log.info("addTwoNumbers method invoked");
        log.info("Hello..");
        log.info("addTwoNumbers method invoked");
        log.info("Hello..");
        log.info("addTwoNumbers method invoked");
        log.info("Hello..");
        return num1+num2;
    }
    public int subtractTwoNumbers(int num1,int num2) {
        log.info("addTwoNumbers method invoked");
        log.info("Hello..");
        log.info("addTwoNumbers method invoked");
        log.info("Hello..");
        log.info("subtractTwoNumbers method invoked");
        return num1-num2;
    }

    public int multiplyTwoNumbers(int num1,int num2) {
        log.info("addTwoNumbers method invoked");
        log.info("Hello..");
        log.info("addTwoNumbers method invoked");
        log.info("Hello..");
        log.info("multiplyTwoNumbers method invoked");
        return num1 * num2;
    }
}
