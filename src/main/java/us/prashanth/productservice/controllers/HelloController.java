package us.prashanth.productservice.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController// This class will be servicing Rest (HTTPS) APIS
@RequestMapping("/hello") // This class will have multiple method servicing at "Hello"
public class HelloController {

    // This method sevres request at localhost:8080/hello/say
    @GetMapping({"/say", "/say/"}) // This method sevres request at localhost:8080/hello/say
    public String sayHello(){
        return "Hello There ";
    }

    // This method sevres request at localhost:8080/hello/say/name
    @GetMapping({"/say/{name}", "/say/{name}/"}) // This method sevres request at localhost:8080/hello/say/name
    public String sayHello(@PathVariable("name") String name){
        return "Hello "+ name;
    }

    // This method sevres request at localhost:8080/hello/say/name/count
    @GetMapping({"/say/{name}/{count}", "/say/{name}/{count}/"}) // This method sevres request at localhost:8080/hello/say/name/count
    public String sayHello(@PathVariable("name") String name, @PathVariable("count") int count){
        StringBuilder message = new StringBuilder();
        for (int index = 0; index < count; index++) {
            message.append("Hello ").append(name).append("<br>");
        }
        return message.toString();
    }
}
