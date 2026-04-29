package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL148 {

    @EJB
    private HelperBeanK148 helperBeanK148;

    public String identify() {
        return "HelperBeanL148";
    }
}
