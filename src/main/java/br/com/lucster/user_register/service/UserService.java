package br.com.lucster.user_register.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.lucster.user_register.dto.UserDto;
import br.com.lucster.user_register.entity.UserEntity;
import br.com.lucster.user_register.repository.UserRepository;

@Service
public class UserService {
    
    @Autowired
    private UserRepository userRepository;

    public List<UserDto> ListarTodos() {
        List<UserEntity> users = userRepository.findAll();
        return users.stream().map(UserDto::new).toList();//converte para dto
    }

    public void inserir(UserDto user) {
        UserEntity userEntity = new UserEntity(user);//criar userEntity
        userRepository.save(userEntity);// salva userEntity
    }

    public UserDto alterar(UserDto user) {
        UserEntity userEntity = new UserEntity(user);
        return new UserDto(userRepository.save(userEntity));//Atera o user
    }

    public void excluir(Long id) {
        UserEntity userEntity = userRepository.findById(id).get();
        userRepository.delete(userEntity);//deleta o userEntity
    }

    public UserDto BuscarId(Long id) {
        return new UserDto(userRepository.findById(id).get());
    }
}
