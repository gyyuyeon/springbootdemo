package com.example.part01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;
// https://www.json.org/json-en.html
// @ResponseBody  객체를 json으로 보내기 위한 어노테이션
// @RequestBody : JSON을 자바객체로 변환해주는 역할을 한다

@Slf4j
//@Controller
@RestController  //  @Controller + @ResponseBody
public class Hello {

	//http://localhost:8090/hello
	//@ResponseBody 
	@GetMapping("/hello")
	//@RequestMapping("/hello") 이버전에선 사용하지 말라고권장
	public String process() {
		log.info("hello world");
		return "hello world";
	}
}
