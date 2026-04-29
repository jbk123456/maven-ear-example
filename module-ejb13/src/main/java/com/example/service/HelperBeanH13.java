package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH13 {

    @EJB
    private HelperBeanG13 helperBeanG13;

    public String identify() {
        return "HelperBeanH13";
    }
}
