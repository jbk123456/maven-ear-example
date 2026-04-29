package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL140 {

    @EJB
    private HelperBeanK140 helperBeanK140;

    public String identify() {
        return "HelperBeanL140";
    }
}
