package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL39 {

    @EJB
    private HelperBeanK39 helperBeanK39;

    public String identify() {
        return "HelperBeanL39";
    }
}
