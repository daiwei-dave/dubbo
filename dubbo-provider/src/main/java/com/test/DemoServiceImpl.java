package com.test;
import org.springframework.stereotype.Service;
@Service("demoService")
public class DemoServiceImpl implements DemoService{


	public String sayHello(String name) {
		// TODO Auto-generated method stub
		return name;
	}  

}
