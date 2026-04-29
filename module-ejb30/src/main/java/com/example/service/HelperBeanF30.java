package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF30 {

    @EJB
    private HelperBeanE30 helperBeanE30;

    public String identify() {
        return "HelperBeanF30";
    }
}
