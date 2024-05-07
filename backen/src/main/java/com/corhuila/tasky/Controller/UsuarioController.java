package com.corhuila.tasky.Controller;



import com.corhuila.tasky.Entity.Usuario;
import com.corhuila.tasky.IService.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/provedor")
public class UsuarioController {
    //Inyectar el servicio
    @Autowired
    private IUsuarioService service;

    @GetMapping()
    public List<Usuario> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Usuario> findById(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping()
    public Usuario save(@RequestBody Usuario usuario) {
        return service.save(usuario);
    }


    @PutMapping("/{id}")
    public void update(@RequestBody Usuario usuario, @PathVariable Long id) {
        service.update(usuario, id);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }


}
