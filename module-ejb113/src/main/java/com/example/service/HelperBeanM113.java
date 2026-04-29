package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM113 {

    @EJB
    private HelperBeanL113 helperBeanL113;

    public String identify() {
        return "HelperBeanM113";
    }
}
