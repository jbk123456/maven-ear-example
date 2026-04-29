package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG65 {

    @EJB
    private HelperBeanF65 helperBeanF65;

    public String identify() {
        return "HelperBeanG65";
    }
}
