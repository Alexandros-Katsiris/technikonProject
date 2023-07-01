package com.example.technikonproject.controller;

import com.example.technikonproject.Model.PropertyRepair;
import com.example.technikonproject.service.PropertyRepairService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/propertyRepair")
public class PropertyRepairController {

    //private final SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

    private final PropertyRepairService propertyRepairService;

    public PropertyRepairController(PropertyRepairService propertyRepairService) {
        this.propertyRepairService = propertyRepairService;
    }

    @GetMapping("/get/properties/repair/date")
    public List<PropertyRepair> getPropertyRepairByDate(@RequestParam String date) throws ParseException {
            //Date dateConverted = formatter.parse(date);
            LocalDate dateConverted = LocalDate.parse(date);
            return propertyRepairService.searchPropertyRepairs(dateConverted);
    }

    @GetMapping("/get/properties/repair/tin")
    public List<PropertyRepair> getPropertyRepairByDate(@RequestParam Long tin) throws ParseException {
        return propertyRepairService.searchPropertyRepairs(tin);
    }
}
