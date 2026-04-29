package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM39 {

    @EJB
    private HelperBeanL39 helperBeanL39;

    public String identify() {
        return "HelperBeanM39";
    }
}
