package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL141 {

    @EJB
    private HelperBeanK141 helperBeanK141;

    public String identify() {
        return "HelperBeanL141";
    }
}
