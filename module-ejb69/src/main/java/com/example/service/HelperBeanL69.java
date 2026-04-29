package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL69 {

    @EJB
    private HelperBeanK69 helperBeanK69;

    public String identify() {
        return "HelperBeanL69";
    }
}
