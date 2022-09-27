package gcu.spring.demo.controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {
	
	private Calculator twoCalculator = new Calculator();
	@GetMapping("/")
	public String index() {
	return "Greetings from Spring Boot!";
	}
	@GetMapping("/hi")
	public String hiGet() {
	return "hi!";
	}
	@GetMapping("/add")
	public String addGet() {
	int result = this.twoCalculator.add(5, 4);
	return Integer.toString(result);
	}
	
	@GetMapping("/minus")
	public String minusGet() {
	int result = this.twoCalculator.minus(5, 4);
	return Integer.toString(result);
	}
	
	@GetMapping("/multi")
	public String multiGet() {
	int result = this.twoCalculator.multi(5, 4);
	return Integer.toString(result);
	}
	
	@GetMapping("/divide")
	public String divideGet() {
	int result = this.twoCalculator.divide(5, 4);
	return Integer.toString(result);
	}
	
	public class Calculator {
		public int add(int x, int y) {
		System.out.println(x + " " + " " + y);
		int result = x + y;
		return result;
		}
		
		public int minus(int x, int y) {
			System.out.println(x + " " + " " + y);
			int result = x - y;
			return result;
			}
		
		public int multi(int x, int y) {
			System.out.println(x + " " + " " + y);
			int result = x * y;
			return result;
			}
		
		public int divide(int x, int y) {
			System.out.println(x + " " + " " + y);
			int result = x / y;
			return result;
			}
		}
}

