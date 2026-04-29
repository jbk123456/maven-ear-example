package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL102 {

    @EJB
    private HelperBeanK102 helperBeanK102;

    public String identify() {
        return "HelperBeanL102";
    }
}
