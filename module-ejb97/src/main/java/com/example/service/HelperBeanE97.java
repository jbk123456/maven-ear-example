package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE97 {

    @EJB
    private HelperBeanD97 helperBeanD97;

    public String identify() {
        return "HelperBeanE97";
    }
}
