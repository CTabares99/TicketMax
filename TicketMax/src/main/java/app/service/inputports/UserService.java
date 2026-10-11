package app.service.inputports;

import app.domain.User;

import java.util.List;

public interface UserService {


    public User create(Integer id, String name, String lastName, String email, String phone, String password, String state, String city, String preferences);
    public User selectById(int id);
    public List<User> selectUsers();
    public User update(User user);
    public boolean deleteUser(int id);
    public int countUsers();





}
