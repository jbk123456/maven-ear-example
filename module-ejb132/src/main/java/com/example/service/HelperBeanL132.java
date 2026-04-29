package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL132 {

    @EJB
    private HelperBeanK132 helperBeanK132;

    public String identify() {
        return "HelperBeanL132";
    }
}
