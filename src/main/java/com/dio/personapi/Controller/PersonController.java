package com.dio.personapi.Controller;

import com.dio.personapi.dto.MessageResponseDTO;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/people")
public class PersonController {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MessageResponseDTO create(@ResponseBody PersonDTO personDTO){
        return personService.create(personDTO);
    }

    @GetMapping("{/id}")


}
