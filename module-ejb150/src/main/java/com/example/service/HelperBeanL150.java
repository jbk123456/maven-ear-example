package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL150 {

    @EJB
    private HelperBeanK150 helperBeanK150;

    public String identify() {
        return "HelperBeanL150";
    }
}
