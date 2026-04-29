package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL21 {

    @EJB
    private HelperBeanK21 helperBeanK21;

    public String identify() {
        return "HelperBeanL21";
    }
}
