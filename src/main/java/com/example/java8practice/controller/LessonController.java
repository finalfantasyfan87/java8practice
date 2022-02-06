package com.example.java8practice.controller;

import com.example.java8practice.service.Practice1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;


@RestController
public class LessonController {

    List<Integer> numbersList = Arrays.asList(23,13,78,35,97,23,56,90);
    List<String> namesList = Arrays.asList("Cristian Dalton","Jazlynn Davies","Christina Durham",
            "Georgia Clark","Erin Huffman","Jaeden Woodward","Summer Mathis");

    @Autowired
    Practice1 practice;

    @GetMapping("/evenList")
    public String getEvenList(){
        List<Integer> evenNums = practice.getEvenNumbersFromList(numbersList);
        return evenNums.toString();

    }

    @GetMapping("/oddList")
    public String getOddList(){
        List<Integer> oddNums = practice.getOddNumbersFromList(numbersList);
        return oddNums.toString();
    }

    @GetMapping("/jNames")
    public List<String> getJNames(){
        return practice.getNamesThatStartWithJ(namesList);
    }


}
