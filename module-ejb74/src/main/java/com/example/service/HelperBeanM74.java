package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM74 {

    @EJB
    private HelperBeanL74 helperBeanL74;

    public String identify() {
        return "HelperBeanM74";
    }
}
