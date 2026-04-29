package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG142 {

    @EJB
    private HelperBeanF142 helperBeanF142;

    public String identify() {
        return "HelperBeanG142";
    }
}
