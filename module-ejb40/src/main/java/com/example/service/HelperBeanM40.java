package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM40 {

    @EJB
    private HelperBeanL40 helperBeanL40;

    public String identify() {
        return "HelperBeanM40";
    }
}
