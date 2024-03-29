package com.valarchi.valarvoom.accessingdatamysql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path="/demo")
public class MainController {
    @Autowired
    private IncomeRepository incomeRepository;

    @PostMapping(path="/add")
    public @ResponseBody String addIncomeEntry (@RequestParam String name
      , @RequestParam String incomeType, @RequestParam String income) {
    // @ResponseBody means the returned String is the response, not a view name
    // @RequestParam means it is a parameter from the GET or POST request

    Income n = new Income();
    n.setName(name);
    n.setIncomeType(incomeType);
    n.setIncome(income);
    incomeRepository.save(n);
    return "Saved";
  }

  @GetMapping(path="/all")
  public @ResponseBody Iterable<Income> getAllIncome() {
    // This returns a JSON or XML with the users
    return incomeRepository.findAll();
  }
    
}
