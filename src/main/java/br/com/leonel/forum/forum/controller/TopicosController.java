package br.com.leonel.forum.forum.controller;

import br.com.leonel.forum.forum.controller.dto.TopicoDto;
import br.com.leonel.forum.forum.modelo.Curso;
import br.com.leonel.forum.forum.modelo.Topico;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicosController {

    @RequestMapping("/topicos")
    public List<TopicoDto> lista() {
        Topico topico = new Topico("Duvida11 leonel", "Sprinf", new Curso("Spring", "Programacao"));
        return TopicoDto.converter(Arrays.asList(topico, topico, topico));
    }
}
