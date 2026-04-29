package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF115 {

    @EJB
    private HelperBeanE115 helperBeanE115;

    public String identify() {
        return "HelperBeanF115";
    }
}
