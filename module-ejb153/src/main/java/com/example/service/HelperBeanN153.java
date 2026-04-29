package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN153 {

    @EJB
    private HelperBeanM153 helperBeanM153;

    public String identify() {
        return "HelperBeanN153";
    }
}
