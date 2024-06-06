package br.com.lucster.user_register.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.lucster.user_register.entity.UserEntity;

//Criando a Interface
public interface UserRepository extends JpaRepository<UserEntity, Long> {
    
}
