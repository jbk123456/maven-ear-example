package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM83 {

    @EJB
    private HelperBeanL83 helperBeanL83;

    public String identify() {
        return "HelperBeanM83";
    }
}
