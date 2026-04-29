package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL158 {

    @EJB
    private HelperBeanK158 helperBeanK158;

    public String identify() {
        return "HelperBeanL158";
    }
}
