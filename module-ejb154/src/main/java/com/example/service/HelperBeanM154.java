package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM154 {

    @EJB
    private HelperBeanL154 helperBeanL154;

    public String identify() {
        return "HelperBeanM154";
    }
}
