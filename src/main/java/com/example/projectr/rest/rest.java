package com.example.projectr.rest;

import com.example.projectr.grades.grades;
import com.example.projectr.service.services;
import com.example.projectr.users.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/service")
public class rest {

private services services;

    @Autowired
    public rest(services services) {
        this.services = services;
    }

    @GetMapping("/get/{ui}")
    grades getgr(@PathVariable  int ui){
         return services.getgrades(ui);
    }

    @GetMapping("/auth")
    List<grades> getgradebyunameandpass(@RequestParam String uname,@RequestParam String pass){
        List<grades> grd=services.getgradebyusernameandpass(uname,pass);
        return grd;
    }

    @PostMapping("/save/grades")
    void save(@RequestBody grades grades){
        services.savegrades(grades);
    }

    @PostMapping("/save/user")
    void save(@RequestBody user user){
        services.saveuser(user);
    }

    @GetMapping("/list")
    List<user> listall(){
      return   services.finall();
    }

}
