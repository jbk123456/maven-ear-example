package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF97 {

    @EJB
    private HelperBeanE97 helperBeanE97;

    public String identify() {
        return "HelperBeanF97";
    }
}
