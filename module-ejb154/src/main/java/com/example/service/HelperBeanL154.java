package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL154 {

    @EJB
    private HelperBeanK154 helperBeanK154;

    public String identify() {
        return "HelperBeanL154";
    }
}
