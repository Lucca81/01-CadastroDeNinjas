package dev.java10x2.CadastroDeNinjas.Ninjas.Controller.Services;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ninjas")
public class NinjaController {

    @GetMapping("/boasvindas")
    public String boasVindas(){
        return "Essa é minha primeira mensagem nessa rota";

    }

    // Adicionar ninja (CREATE)
    @PostMapping("/criar")
    public  String criarNinja(){
        return  "Mostrar Ninja";
    }

    // Mostrar ninjas
    @GetMapping("/listar")
    public String mostrarNinja(){
        return "Mostrar Ninja";
    }

    // Mostrar ninja por ID (READ)
    @GetMapping("/listarID")
    public String mostrarTodosOsNinjasPorId() {
        return "Mostrar Ninja por ID";
    }

    //Alterar dados dos ninjas (UPDATE)
    @PutMapping("/alterarID")
    public String AlterarNinjaPorId() {
        return "Mostrar Ninja por ID";
    }

    // Deletar ninja (DELETE)
    @DeleteMapping("/deletarPorID")
    public String deletarNinjaPorId(){
        return "Deletar ninja por ID";
    }

}
