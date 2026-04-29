package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG38 {

    @EJB
    private HelperBeanF38 helperBeanF38;

    public String identify() {
        return "HelperBeanG38";
    }
}
