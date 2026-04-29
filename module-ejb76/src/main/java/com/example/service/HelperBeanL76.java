package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL76 {

    @EJB
    private HelperBeanK76 helperBeanK76;

    public String identify() {
        return "HelperBeanL76";
    }
}
