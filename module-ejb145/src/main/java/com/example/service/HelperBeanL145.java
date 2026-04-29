package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL145 {

    @EJB
    private HelperBeanK145 helperBeanK145;

    public String identify() {
        return "HelperBeanL145";
    }
}
