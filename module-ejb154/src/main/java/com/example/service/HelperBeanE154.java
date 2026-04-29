package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE154 {

    @EJB
    private HelperBeanD154 helperBeanD154;

    public String identify() {
        return "HelperBeanE154";
    }
}
