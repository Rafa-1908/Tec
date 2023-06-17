package com.example.demo.Controller;

import com.example.demo.Bean.trabajadorestecBean;
import com.example.demo.Service.trabajadorestecRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/tec")
public class trabajadorestecController {


    @Autowired
    private trabajadorestecRepository traRepo;
    //Obtener
    @GetMapping("/obtener")
    public List<trabajadorestecBean> obtenerTienda(){
        List<trabajadorestecBean> listaTienda = new ArrayList<>();
        listaTienda = (List<trabajadorestecBean>) traRepo.findAll();
        return listaTienda;
    }
    //Insertar
    @PostMapping("/insertar")
    public void insertarTienda(@RequestBody trabajadorestecBean TieBean){

        traRepo.save(TieBean);
    }

    @PutMapping("/modificar")
    public void modificarTrabajador(@RequestBody trabajadorestecBean TieBean) {
        traRepo.save(TieBean);
    }

    @DeleteMapping("/eliminar")
    public void eliminar(@RequestBody trabajadorestecBean TieBean){
        traRepo.deleteById(TieBean.getIdtienda());
    }

    @DeleteMapping("/eliminar/{idtienda}")
    public void eliminar(@PathVariable ("idtienda") Integer idtienda){
        traRepo.deleteById(idtienda);
    }

}