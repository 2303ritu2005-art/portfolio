
package com.skilllab.portfolio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {

        // ---- Hero ----
        model.addAttribute("name", "Ritu Maurya");
        model.addAttribute("title", "Java Backend Developer");
        model.addAttribute("tagline",
                "I build web applications with Java and Spring Boot - "
                + "and I'm looking for my first role as a backend developer.");

        // ---- About ----
        model.addAttribute("about",
                "I'm a final-year BCA student at SHEAT College of Engineering, "
                + "Varanasi. I like building things that actually run, and I've "
                + "spent the last year learning Java and Spring Boot properly.");

        // ---- Contact and Links ----
        model.addAttribute("location", "Varanasi, India");
        model.addAttribute("email", "2303ritu2005@gmail.com");
        model.addAttribute("github", "https://github.com/2303ritu2005-art");
        model.addAttribute("linkedin", "https://www.linkedin.com/in/ritu-maurya-5569bb375");
        model.addAttribute("resumeUrl", "https://drive.google.com/");

        return "index";
    }
}
