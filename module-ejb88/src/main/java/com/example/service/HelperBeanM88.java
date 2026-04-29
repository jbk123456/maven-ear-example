package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM88 {

    @EJB
    private HelperBeanL88 helperBeanL88;

    public String identify() {
        return "HelperBeanM88";
    }
}
