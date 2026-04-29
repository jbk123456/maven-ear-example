package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG106 {

    @EJB
    private HelperBeanF106 helperBeanF106;

    public String identify() {
        return "HelperBeanG106";
    }
}
