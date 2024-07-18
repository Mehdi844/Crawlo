package com.example.crawlov2.Controller;

import com.example.crawlov2.Model.Access;
import com.example.crawlov2.Service.AccessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/Access")

public class AccessController {

    @Autowired
    private AccessService accessService;

    @PostMapping("/Create")
    public Access CreateAccess(@RequestBody Access access) {
        return accessService.CreateAccess(access);
    }
    @GetMapping
    public List<Access> getAllAccesses(){
        return accessService.getAllAccesses();
    }

    @GetMapping("/{id}")
    public Optional<Access> getAccessById(@PathVariable int id){
         return accessService.getAccessById(id);
    }

    @PutMapping("/Update")
    public Access updateAccess(@PathVariable int id, @RequestBody Access access){
        return accessService.updateAccess(id, access);
    }

    @DeleteMapping("/Delete")
    public void deleteAccess(@PathVariable int id){
        accessService.deleteAccess(id);
    }

    @GetMapping("/Access details/{id}")
    public Optional<Access> getAccessDetailsById(@PathVariable int id) {
        return accessService.getAccessDetailsById(id);
    }
}
