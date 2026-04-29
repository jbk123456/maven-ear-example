package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH142 {

    @EJB
    private HelperBeanG142 helperBeanG142;

    public String identify() {
        return "HelperBeanH142";
    }
}
