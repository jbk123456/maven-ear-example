package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL64 {

    @EJB
    private HelperBeanK64 helperBeanK64;

    public String identify() {
        return "HelperBeanL64";
    }
}
