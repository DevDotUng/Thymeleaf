package com.thymeleaf.controller;

import com.thymeleaf.entity.Dog;
import com.thymeleaf.entity.Title;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/thymeleaf")
public class ThymeleafController {

    @GetMapping("")
    public String thymeleaf(Model model) {

        Title title = new Title("색깔 제목", "red");

        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog("초코", "https://images.unsplash.com/photo-1543466835-00a7907e9de1?w=900&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8N3x8ZG9nfGVufDB8fDB8fHww"));
        dogs.add(new Dog("알루", "https://images.unsplash.com/photo-1588943211346-0908a1fb0b01?w=900&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTJ8fGRvZ3xlbnwwfHwwfHx8MA%3D%3D"));
        dogs.add(new Dog("뭉치", "https://images.unsplash.com/photo-1583512603805-3cc6b41f3edb?w=900&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTR8fGRvZ3xlbnwwfHwwfHx8MA%3D%3D"));

        model.addAttribute("title", "제목");
        model.addAttribute("colorTitle", title);
        model.addAttribute("dogs", dogs);

        return "thymeleaf";
    }

    @GetMapping("second")
    public String second() {

        return "second";
    }
}
