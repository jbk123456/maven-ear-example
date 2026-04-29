package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL57 {

    @EJB
    private HelperBeanK57 helperBeanK57;

    public String identify() {
        return "HelperBeanL57";
    }
}
