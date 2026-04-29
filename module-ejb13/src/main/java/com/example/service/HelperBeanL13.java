package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL13 {

    @EJB
    private HelperBeanK13 helperBeanK13;

    public String identify() {
        return "HelperBeanL13";
    }
}
