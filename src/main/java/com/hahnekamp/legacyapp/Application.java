package com.hahnekamp.legacyapp;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by rainerh on 03.06.17.
 */
public class Application {
  public static void main(String[] args) throws IOException {
    ClassPathResource classPathResource = new ClassPathResource("beans.xml");
    XmlBeanFactory factory = new XmlBeanFactory(classPathResource);
    Greeter greeter = (Greeter)factory.getBean("greeter");
    greeter.greet();
  }
}
