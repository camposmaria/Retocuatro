/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.usa.ciclo4.ciclo4.Repository.crud;

import co.usa.ciclo4.ciclo4.Modelo.User;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.core.CrudMethods;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Ivonne
 */
@Repository

public class UserRepository {

    @Autowired
    /**
     * 
     */
    private UserCrudRepository userCrud;

    public List<User> getAll() {

        return (List<User>) userCrud.findAll();
    }
    /**
     * 
     * @param id
     * @return 
     */
    public Optional<User>  getUserById(int id){
    
    return userCrud.findById(id);
    
    }
    /**
     * 
     * @param User
     * @return 
     */
    public User save(User User) {

        return userCrud.save(User);
    }

    /***
     * 
     * @param name
     * @return 
     */
    public Optional<User> getUserByName(String name) {

        return userCrud.findByName(name);

    }
    /**
     * 
     * @param email
     * @return 
     */
    public Optional<User> getUserbyEmail(String email) {

        return userCrud.findByEmail(email);

    }
    /**
     * 
     * @param name
     * @param email
     * @return 
     */
    public List<User> getUserByNameOrEmail(String name, String email) {

        return userCrud.findByNameOrEmail(name, email);

    }
    /**
     * 
     * @param email
     * @param password
     * @return 
     */
    public Optional<User> getUserByEmailAndPassword(String email, String password) {

        return userCrud.findByEmailAndPassword(email, password);

    }
    /**
     * 
     * @param id 
     */
    public void deleteUser(Integer id){
    
        userCrud.deleteById(id);
    
    }
    /**
     * 
     * @param Identification
     * @param cellPhone
     * @param email
     * @param password
     * @param name
     * @return 
     */
    public List<User> getICEP(String Identification,String cellPhone, String email, String password, String name){
    
    return userCrud.findByIdentificationAndCellPhoneAndEmailAndPasswordAndName(Identification, cellPhone, email, password, name);
    
    }
    /**
     * 
     * @return 
     */
    public Optional <User> lastUserId(){
        return userCrud.findTopByOrderByIdDesc();
    }
    /**
     * 
     * @param monthBirthtDay
     * @return 
     */
    public List<User> birthtDayList(String monthBirthtDay) {
        return userCrud.findByMonthBirthtDay(monthBirthtDay);
    }
}
