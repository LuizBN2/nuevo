package com.example.Ejercicio1.controladores;

import com.example.Ejercicio1.entidades.Paciente;
import com.example.Ejercicio1.entidades.Usuario;
import com.example.Ejercicio1.servicios.ServiciosPacientes;
import com.example.Ejercicio1.servicios.ServiciosProfesionales;
import com.example.Ejercicio1.servicios.ServiciosUsuarios;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class FrontControlador {

    ServiciosPacientes servicesP;
    ServiciosUsuarios serviceUs;


    public FrontControlador(ServiciosPacientes servicesP, ServiciosUsuarios serviceUs){
        this.servicesP = servicesP;
        this.serviceUs = serviceUs;
    }

    //crea elementos de tipo String para visualizar las etiquetas HTML creadas

    @GetMapping("/") //ruta raíz
    public String index(Model model, @AuthenticationPrincipal OidcUser principal){
        if (principal != null){
            //System.out.println(principal.getClaims());
            Usuario usuario = this.serviceUs.getOrCreateUsuario(principal.getClaims());
            model.addAttribute("usuario", usuario);
        }
        return "index";
    }

    /*
    @GetMapping("/") //ruta raíz
    public String index(){
        return "index";
    }

     */

    @GetMapping("/pacientes")
    public String pacientes(Model modelP){
        List<Paciente> pacientes = this.servicesP.getListaPacientes();
        modelP.addAttribute("pacientes", pacientes);
        return "pacientes";
    }

    @GetMapping("pacientes/nuevo")
    public String nuevoPaciente(Model model){
        model.addAttribute("paciente", new Paciente());
        return "nuevo-paciente";
    }

    @GetMapping("/pacientes/{id}")
    public String actualizarPaciente(@PathVariable Long id, Model model){
        Paciente pacienteFind = this.servicesP.getLlamarPacientes(id);
        model.addAttribute("pacienteFind", pacienteFind);
        return "actualizar-paciente";
    }


    //aquí hago uso de los servicios de usuarios





}
