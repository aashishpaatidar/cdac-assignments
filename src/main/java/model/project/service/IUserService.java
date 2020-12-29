package model.project.service;

import model.project.entity.User;

import java.util.List;

public interface IUserService {

    List<User> getAllUsers();

    User getUser(String email, String password);

    User findAdminUser(String email);
}
