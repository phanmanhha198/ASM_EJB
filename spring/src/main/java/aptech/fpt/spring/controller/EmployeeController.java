package aptech.fpt.spring.controller;

import aptech.fpt.spring.model.Employee;
import aptech.fpt.spring.repository.EmployeeResposistory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EmployeeController {
    @Autowired
    private EmployeeResposistory repository;

    @RequestMapping(path = "/EMP/listAll", method = RequestMethod.GET)
    public String getASList(Model model, @RequestParam(defaultValue = "1") int page, @RequestParam(defaultValue = "5") int limit) {
        Page<Employee> pagination = repository.findAll(PageRequest.of(page - 1, limit));
        model.addAttribute("pagination", pagination);
        model.addAttribute("page", page);
        model.addAttribute("limit", limit);
        return "EMP-list";
    }
}
