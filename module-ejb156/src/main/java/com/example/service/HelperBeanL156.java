package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL156 {

    @EJB
    private HelperBeanK156 helperBeanK156;

    public String identify() {
        return "HelperBeanL156";
    }
}
