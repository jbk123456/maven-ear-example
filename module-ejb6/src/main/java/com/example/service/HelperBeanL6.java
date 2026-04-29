package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL6 {

    @EJB
    private HelperBeanK6 helperBeanK6;

    public String identify() {
        return "HelperBeanL6";
    }
}
