package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM58 {

    @EJB
    private HelperBeanL58 helperBeanL58;

    public String identify() {
        return "HelperBeanM58";
    }
}
