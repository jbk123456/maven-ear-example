package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG83 {

    @EJB
    private HelperBeanF83 helperBeanF83;

    public String identify() {
        return "HelperBeanG83";
    }
}
