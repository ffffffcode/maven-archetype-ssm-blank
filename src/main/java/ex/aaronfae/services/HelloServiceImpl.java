package ex.aaronfae.services;

import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService {

    @Override
    public String sayHello() {
        return "nice to see u!!!!!";
    }
}
