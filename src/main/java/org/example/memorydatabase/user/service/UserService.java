package org.example.memorydatabase.user.service;

import lombok.RequiredArgsConstructor;
import org.example.memorydatabase.user.db.UserRepository;
import org.example.memorydatabase.user.model.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public UserEntity save(UserEntity entity){
        // save
        return userRepository.save(entity);

    }

    public List<UserEntity> findAll(){
        return userRepository.findAll();
    }

    public void delete(Long id){
        userRepository.delete(id);
    }

    public Optional<UserEntity> findById(Long id){
        return userRepository.findById(id);
    }

    //TODO -> 사용자 10명을 생성후 70점 이상의 사용자의 정보를 찾아주는 method 작성하기
    public List<UserEntity> filterScore(int score){
        return userRepository.findAllScoreGreaterThan(score);
    }

}
