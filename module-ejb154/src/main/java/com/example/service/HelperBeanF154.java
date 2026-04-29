package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF154 {

    @EJB
    private HelperBeanE154 helperBeanE154;

    public String identify() {
        return "HelperBeanF154";
    }
}
