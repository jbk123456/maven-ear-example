package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL113 {

    @EJB
    private HelperBeanK113 helperBeanK113;

    public String identify() {
        return "HelperBeanL113";
    }
}
