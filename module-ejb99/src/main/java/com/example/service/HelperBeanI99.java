package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI99 {

    @EJB
    private HelperBeanH99 helperBeanH99;

    public String identify() {
        return "HelperBeanI99";
    }
}
