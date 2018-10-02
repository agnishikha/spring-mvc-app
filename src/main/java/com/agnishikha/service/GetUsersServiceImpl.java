package com.agnishikha.service;

import com.agnishikha.domain.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GetUsersServiceImpl implements GetUsersService {
    @Override
    public List<User> getUsers() {
        List<User> userList = new ArrayList<>(3);
        userList.add(new User("Agni Shikha", "agni_shikha", "spinster", "0989099", "asc@gmail.com"));
        userList.add(new User("Ankita", "anki", "spinster", "0989099", "asc@gmail.com"));
        userList.add(new User("Ashraf", "aash", "bachelor", "0989099", "asc@gmail.com"));
        return userList;
    }
}
