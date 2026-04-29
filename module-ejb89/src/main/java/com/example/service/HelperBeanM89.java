package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM89 {

    @EJB
    private HelperBeanL89 helperBeanL89;

    public String identify() {
        return "HelperBeanM89";
    }
}
