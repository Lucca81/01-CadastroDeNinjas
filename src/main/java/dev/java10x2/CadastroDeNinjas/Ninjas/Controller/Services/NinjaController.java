package dev.java10x2.CadastroDeNinjas.Ninjas.Controller.Services;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ninjas")
public class NinjaController {

    private NinjaService ninjaService;

    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }

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
    public List<NinjaModel> listarNinjas(){
        return ninjaService.listarNinjas();
    }

    // Mostrar ninja por ID (READ)
    @GetMapping("/listar/{id}")
    public NinjaModel listarNinjasPorId(@PathVariable Long id) {
        return ninjaService.listarNinjasPorId(id);
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
