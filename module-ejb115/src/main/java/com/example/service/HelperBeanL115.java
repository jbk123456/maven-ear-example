package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL115 {

    @EJB
    private HelperBeanK115 helperBeanK115;

    public String identify() {
        return "HelperBeanL115";
    }
}
