package model.project.service;

import model.project.entity.User;
import model.project.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserRepository userRepo;

    @Override
    public List<User> getAllUsers() {
        return userRepo.findAll();
    }

    @Override
    public User getUser(String email, String password) {
        return userRepo.findByEmailAndPassword(email, password);
    }

    @Override
    public User findAdminUser(String email) {
        return userRepo.findByEmail(email).get();
    }
}
