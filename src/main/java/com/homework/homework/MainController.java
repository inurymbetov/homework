package com.homework.homework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@Controller
public class MainController {

    @Autowired
    private WordRepository  wordRepository;

    private String          word;
    private List<String>    words;


    @GetMapping("/")
    public String showInfo(Model model){
        word = wordRepository.findById(1).get().getValue();
        model.addAttribute("word",          word);
        model.addAttribute("revers",        new StringBuilder().append(word).reverse().toString());
        model.addAttribute("tree",          tree());
        return "index";
    }

    private String tree (){
        char n;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < word.length(); ++i){
            n = word.charAt(i);
            for (int r = 0; r <= i; ++r){
                stringBuilder.append(n);
            }
            stringBuilder.append("\n").append("<br>");
        }
        return stringBuilder.toString();
    }
}