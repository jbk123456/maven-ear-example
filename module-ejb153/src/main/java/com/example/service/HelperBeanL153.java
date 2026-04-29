package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL153 {

    @EJB
    private HelperBeanK153 helperBeanK153;

    public String identify() {
        return "HelperBeanL153";
    }
}
