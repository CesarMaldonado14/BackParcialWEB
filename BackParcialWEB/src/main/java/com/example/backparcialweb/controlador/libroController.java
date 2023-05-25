package com.example.backparcialweb.controlador;


import com.example.backparcialweb.modelo.libro;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class libroController {

    @CrossOrigin
    @PostMapping(value = "/Libro", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> insertarCancha(@RequestParam String titulo,
                                                 @RequestParam String referencia,
                                                 @RequestParam String autor,
                                                 @RequestParam String precio) throws Exception{
        libro libro = new libro(titulo, referencia, autor, precio,);
        //LIBROREPOSITORY.save(libro);
        HttpHeaders responseHeaders = new HttpHeaders();
        return  new ResponseEntity<String>( "{\"respuesta\":\"exito\"}", responseHeaders, HttpStatus.OK );
    }

}
