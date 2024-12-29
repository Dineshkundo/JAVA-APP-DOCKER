package com.office.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.stereotype.Controller;

@Controller  // Use @Controller instead of @RestController for serving Thymeleaf templates
public class ServiceController {

    // Endpoint for displaying available services
    @GetMapping("/")
    public String showServices() {
        return "services";  // Thymeleaf template name for available services
    }

    // Endpoint for displaying office service details
    @GetMapping("/office-service")
    public String showOfficeService() {
        return "officeService";  // Thymeleaf template name for office service details
    }

    // Endpoint for submitting employee details
    @GetMapping("/submit-details")
    public String submitEmployeeDetails() {
        return "submitDetails";  // Thymeleaf template name for submitting details
    }

    // Handling POST request for employee details submission
    @PostMapping("/submit")
    public String submitDetails(@RequestParam String name, @RequestParam String position, Model model) {
        // Add name and position to the model
        model.addAttribute("name", name);
        model.addAttribute("position", position);
        
        // Return the name of the Thymeleaf template for submission success
        return "employeeDetailsSubmitted";  // This will resolve to employeeDetailsSubmitted.html template
    }
}

