package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM129 {

    @EJB
    private HelperBeanL129 helperBeanL129;

    public String identify() {
        return "HelperBeanM129";
    }
}
