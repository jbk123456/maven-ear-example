package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL129 {

    @EJB
    private HelperBeanK129 helperBeanK129;

    public String identify() {
        return "HelperBeanL129";
    }
}
