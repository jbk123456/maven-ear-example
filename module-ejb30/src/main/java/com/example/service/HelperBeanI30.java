package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI30 {

    @EJB
    private HelperBeanH30 helperBeanH30;

    public String identify() {
        return "HelperBeanI30";
    }
}
