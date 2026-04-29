package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK148 {

    @EJB
    private HelperBeanJ148 helperBeanJ148;

    public String identify() {
        return "HelperBeanK148";
    }
}
