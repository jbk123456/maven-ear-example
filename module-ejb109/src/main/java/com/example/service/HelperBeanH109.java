package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH109 {

    @EJB
    private HelperBeanG109 helperBeanG109;

    public String identify() {
        return "HelperBeanH109";
    }
}
