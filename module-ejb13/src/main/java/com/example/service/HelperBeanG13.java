package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG13 {

    @EJB
    private HelperBeanF13 helperBeanF13;

    public String identify() {
        return "HelperBeanG13";
    }
}
