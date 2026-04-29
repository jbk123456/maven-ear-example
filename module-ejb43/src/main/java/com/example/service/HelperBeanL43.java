package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL43 {

    @EJB
    private HelperBeanK43 helperBeanK43;

    public String identify() {
        return "HelperBeanL43";
    }
}
