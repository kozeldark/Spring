package gcu.backend.hellobean;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@GetMapping("/hello-world-bean")
	public HelloWorldBean helloWorldBean() {
		
	return new HelloWorldBean("Hello World") ;
	}

	public class HelloWorldBean {

		 private String msgString;   

		public HelloWorldBean(String msgString) { 
			super();
			this.msgString = msgString;
		}

		public String getMsgString() { 
			return msgString;
		}

		public void setMsgString(String msgString) {
			this.msgString = msgString;
		}

		@Override
		public String toString() { 
		return "HelloWorldBean [msgString=" + msgString + "]";
		} 
	}
}


