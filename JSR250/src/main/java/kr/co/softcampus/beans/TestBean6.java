package kr.co.softcampus.beans;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Qualifier;

public class TestBean6 {
	
	@Resource(name = "data1")
	private DataBean1 data100;

	@Resource(name = "data2")
	private DataBean2 data200;

	public DataBean1 getData100() {
		return data100;
	}

	public DataBean2 getData200() {
		return data200;
	}
	
	
}
