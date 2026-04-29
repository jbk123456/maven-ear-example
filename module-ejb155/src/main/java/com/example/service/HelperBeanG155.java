package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG155 {

    @EJB
    private HelperBeanF155 helperBeanF155;

    public String identify() {
        return "HelperBeanG155";
    }
}
