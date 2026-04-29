package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL120 {

    @EJB
    private HelperBeanK120 helperBeanK120;

    public String identify() {
        return "HelperBeanL120";
    }
}
