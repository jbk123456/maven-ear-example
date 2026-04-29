package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM147 {

    @EJB
    private HelperBeanL147 helperBeanL147;

    public String identify() {
        return "HelperBeanM147";
    }
}
