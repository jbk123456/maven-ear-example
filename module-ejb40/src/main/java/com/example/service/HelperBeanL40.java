package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL40 {

    @EJB
    private HelperBeanK40 helperBeanK40;

    public String identify() {
        return "HelperBeanL40";
    }
}
