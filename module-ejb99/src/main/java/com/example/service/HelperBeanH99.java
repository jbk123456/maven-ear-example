package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH99 {

    @EJB
    private HelperBeanG99 helperBeanG99;

    public String identify() {
        return "HelperBeanH99";
    }
}
