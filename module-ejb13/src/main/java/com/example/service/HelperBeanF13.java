package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF13 {

    @EJB
    private HelperBeanE13 helperBeanE13;

    public String identify() {
        return "HelperBeanF13";
    }
}
