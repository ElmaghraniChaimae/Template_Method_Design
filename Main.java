package org.elmaghrani;

import org.elmaghrani.template.Template;
import org.elmaghrani.template.TemplateImpl1;
import org.elmaghrani.template.TemplateImpl2;

public class Main {
    public static void main(String[] args) {
        Template template= new TemplateImpl1();
        System.out.println(template.operationTemplate("tets"));
        Template template2= new TemplateImpl2();
        System.out.println(template2.operationTemplate("tets"));    }
}