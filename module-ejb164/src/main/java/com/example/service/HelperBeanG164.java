package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG164 {

    @EJB
    private HelperBeanF164 helperBeanF164;

    public String identify() {
        return "HelperBeanG164";
    }
}
