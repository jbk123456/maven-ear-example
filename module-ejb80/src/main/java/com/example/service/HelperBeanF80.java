package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF80 {

    @EJB
    private HelperBeanE80 helperBeanE80;

    public String identify() {
        return "HelperBeanF80";
    }
}
