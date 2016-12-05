/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cwi.crescer.aula8.controller;

import br.com.cwi.crescer.aula8.entity.Pessoa;
import java.util.Date;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author henrique.ostermann
 */
@RestController
public class PessoaRest {

    @RequestMapping(value = "/current_date_time")
    public Date date() {
        return new Date();
    }

    @ResponseBody
    @RequestMapping("/pessoa")
    public List<Pessoa> list() {
        Pessoa p = new Pessoa();
        p.setNome("Carlos H. Nonnemacher");
        p.setNascimento(new Date());
        return Stream.of(p).collect(Collectors.toList());
    }
}