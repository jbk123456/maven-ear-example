package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM153 {

    @EJB
    private HelperBeanL153 helperBeanL153;

    public String identify() {
        return "HelperBeanM153";
    }
}
