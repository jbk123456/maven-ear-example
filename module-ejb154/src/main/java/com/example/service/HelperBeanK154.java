package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK154 {

    @EJB
    private HelperBeanJ154 helperBeanJ154;

    public String identify() {
        return "HelperBeanK154";
    }
}
