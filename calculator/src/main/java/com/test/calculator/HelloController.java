package com.test.calculator;



import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping(path="/test")
public class HelloController {

	@RequestMapping("/add")
	public String add(@RequestParam(value="a")Integer a,@RequestParam(value="b")Integer b) {
		return "Sum of a and b is :"+(a+b);
	}
	
	@RequestMapping("/sub")
	public String substract(@RequestParam(value="a")Integer a,@RequestParam(value="b")Integer b) {
		return "Substraction of a and b is :"+(a-b);
	}
	
	@RequestMapping("/multiplication")
	public String multiplication(@RequestParam(value="a")Integer a,@RequestParam(value="b")Integer b) {
		return "Substraction of a and b is :"+(a*b);
	}
	
	@RequestMapping("/div")
	public String division(@RequestParam(value="a")Integer a,@RequestParam(value="b")Integer b) {
		return "Substraction of a and b is :"+(a/b);
	}

}
