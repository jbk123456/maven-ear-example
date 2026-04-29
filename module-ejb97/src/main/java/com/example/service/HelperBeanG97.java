package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG97 {

    @EJB
    private HelperBeanF97 helperBeanF97;

    public String identify() {
        return "HelperBeanG97";
    }
}
