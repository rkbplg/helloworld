package com.anz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by batrar2 on 24/09/2018.
 */
@RestController
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }


    @RequestMapping("/")
    String home(HttpServletRequest request) {


        StringBuffer buffer = new StringBuffer("Hello World !");
        buffer.append("\n");
        buffer.append("IP Address: ");
        buffer.append(request.getLocalAddr());

        return buffer.toString();
    }
}
