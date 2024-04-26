package com.Xpertpro.XpertCash.Service;

import com.Xpertpro.XpertCash.Exception.NotFoundException;
import com.Xpertpro.XpertCash.Model.Admin;
import com.Xpertpro.XpertCash.Repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService {

    @Autowired
    private AdminRepository adminRepository;

    public Admin inscrire(Admin admin){
        return adminRepository.save(admin);
    }

    public List<Admin> list(){
        return adminRepository.findAll();
    }

    public String supprimer(Long id){
        adminRepository.deleteById(id);
        return "Suppression effectuer";
    }

    public Admin connexion(Long code){
        Admin admin = adminRepository.findAdminByCode(code);
        return admin;
    }

    public Admin connexionEmail(String email , String password){
        Admin admin  = adminRepository.findAdminByEmailAndPassword(email , password);
        return admin;
    }


}
