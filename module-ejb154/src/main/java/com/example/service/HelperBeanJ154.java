package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ154 {

    @EJB
    private HelperBeanI154 helperBeanI154;

    public String identify() {
        return "HelperBeanJ154";
    }
}
