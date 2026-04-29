package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL172 {

    @EJB
    private HelperBeanK172 helperBeanK172;

    public String identify() {
        return "HelperBeanL172";
    }
}
