package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF162 {

    @EJB
    private HelperBeanE162 helperBeanE162;

    public String identify() {
        return "HelperBeanF162";
    }
}
