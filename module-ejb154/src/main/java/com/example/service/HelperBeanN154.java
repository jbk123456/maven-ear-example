package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN154 {

    @EJB
    private HelperBeanM154 helperBeanM154;

    public String identify() {
        return "HelperBeanN154";
    }
}
