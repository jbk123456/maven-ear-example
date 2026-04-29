package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG165 {

    @EJB
    private HelperBeanF165 helperBeanF165;

    public String identify() {
        return "HelperBeanG165";
    }
}
