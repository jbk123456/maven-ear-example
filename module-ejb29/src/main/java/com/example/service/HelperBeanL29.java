package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL29 {

    @EJB
    private HelperBeanK29 helperBeanK29;

    public String identify() {
        return "HelperBeanL29";
    }
}
