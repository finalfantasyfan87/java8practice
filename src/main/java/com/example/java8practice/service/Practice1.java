package com.example.java8practice.service;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@Service
public class Practice1 {

    public List<Integer> getEvenNumbersFromList(List<Integer>  numbersList ){
        Predicate<Integer> evenNumbersPredicate = num -> num % 2== 0;
        return numbersList.stream().filter(evenNumbersPredicate).collect(Collectors.toList());
    }

    public List<Integer> getOddNumbersFromList(List<Integer> numbersList) {
        Predicate<Integer> oddNumbersPredicate = num -> num % 3 == 0;
        return numbersList.stream().filter(oddNumbersPredicate).collect(Collectors.toList());
    }

    public List<String> getNamesThatStartWithJ(List<String> listOfNames){
        Predicate<String> startsWithJPredicate = name -> name.startsWith("J");
        return listOfNames.stream().filter(startsWithJPredicate).collect(Collectors.toList());
    }

    public String getNumsThatStartWith9 (List<Integer> numbersList){
        Predicate<String> startsWith9 = num -> num.startsWith("9");
        return numbersList.stream().map(num -> num + "" ).filter(startsWith9).collect(Collectors.joining(","));
    }

}

