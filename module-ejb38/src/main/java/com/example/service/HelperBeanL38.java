package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL38 {

    @EJB
    private HelperBeanK38 helperBeanK38;

    public String identify() {
        return "HelperBeanL38";
    }
}
