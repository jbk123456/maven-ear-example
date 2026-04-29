package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL88 {

    @EJB
    private HelperBeanK88 helperBeanK88;

    public String identify() {
        return "HelperBeanL88";
    }
}
