package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE115 {

    @EJB
    private HelperBeanD115 helperBeanD115;

    public String identify() {
        return "HelperBeanE115";
    }
}
