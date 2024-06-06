package br.com.lucster.user_register.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.lucster.user_register.dto.UserDto;
import br.com.lucster.user_register.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
    
    @Autowired
    private UserService userService;

    @GetMapping
    public List<UserDto> listarTodos() {
        return userService.ListarTodos();
    }

    @PostMapping
    public void inserir(@RequestBody UserDto user) {
        userService.inserir(user);
    }

    @PutMapping
    public UserDto alterar(@RequestBody UserDto user) {
        return userService.alterar(user);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluir(@PathVariable("id") Long id) {
        userService.excluir(id);
        return ResponseEntity.ok().build();
    }
}
