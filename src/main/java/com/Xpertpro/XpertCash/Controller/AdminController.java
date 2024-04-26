package com.Xpertpro.XpertCash.Controller;

import com.Xpertpro.XpertCash.Model.Admin;
import com.Xpertpro.XpertCash.Service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin/")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @PostMapping("inscrire")
    public Admin inscrire(@RequestBody Admin admin){
       return adminService.inscrire(admin);
    }


    @GetMapping("")
    public List<Admin> list(){
        return adminService.list();
    }

    @DeleteMapping("supprimer")
    public String supprimer(@PathVariable Long id ){
       return adminService.supprimer(id);
    }

    @PostMapping("connexionEmail")
    public Admin connexionEmail (@RequestParam String email , @RequestParam String password){
        return adminService.connexionEmail(email, password);
    }

    @PostMapping("connexion")
    public Admin connexion (@RequestParam Long code){
        return adminService.connexion(code);
    }
}
