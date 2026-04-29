package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG30 {

    @EJB
    private HelperBeanF30 helperBeanF30;

    public String identify() {
        return "HelperBeanG30";
    }
}
