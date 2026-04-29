package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH30 {

    @EJB
    private HelperBeanG30 helperBeanG30;

    public String identify() {
        return "HelperBeanH30";
    }
}
