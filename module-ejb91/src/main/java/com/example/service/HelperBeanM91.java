package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM91 {

    @EJB
    private HelperBeanL91 helperBeanL91;

    public String identify() {
        return "HelperBeanM91";
    }
}
