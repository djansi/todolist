package br.com.janssenoliv.todolist.controler.user;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {


    /**
     * String
     * Interger
     * Double
     * Float
     * char
     * Date
     * void (sem retorno)
     */
    @PostMapping("/")
    public void create(@RequestBody UserModel userModel){

            System.out.println(userModel.name);
    }
    
}
