package com.example.backparcialweb.controlador;


import com.example.backparcialweb.modelo.libro_cesar;
import com.example.backparcialweb.modelo.libroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class libroController {

    @Autowired
    libroRepository replib;

    @CrossOrigin
    @PostMapping(value = "/Add/Libro", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> insertarLibro(@RequestParam String titulo,
                                                 @RequestParam String referencia,
                                                 @RequestParam String autor,
                                                 @RequestParam double precio,
                                                 @RequestParam String ubicacion) throws Exception{
        libro_cesar libro = new libro_cesar(titulo,referencia,autor,precio,ubicacion);
        replib.save(libro);
        HttpHeaders responseHeaders = new HttpHeaders();
        return  new ResponseEntity<String>( "{\"respuesta\":\"exito\"}", responseHeaders, HttpStatus.OK );
    }
    @CrossOrigin
    @GetMapping(value = "/GetLibro", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> getlibros() throws Exception{
        Iterable<libro_cesar> LC = replib.findAll();
        HttpHeaders responseHeaders = new HttpHeaders();
        return  new ResponseEntity<String>(LC.toString(), responseHeaders, HttpStatus.OK );

    }
}
