package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG109 {

    @EJB
    private HelperBeanF109 helperBeanF109;

    public String identify() {
        return "HelperBeanG109";
    }
}
