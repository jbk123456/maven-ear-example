package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL71 {

    @EJB
    private HelperBeanK71 helperBeanK71;

    public String identify() {
        return "HelperBeanL71";
    }
}
