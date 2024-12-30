package dev.java10x2.CadastroDeNinjas.Missoes;

import org.springframework.web.bind.annotation.*;

//LOCALHOlST:8080/#
@RestController
@RequestMapping("missoes")
public class MissoesController

    // GET -- Mandar uma requisição para mostrar as missoes
    @GetMapping("/listar")
    public String listarMissao(){
        return "Missao listada com sucesso";
    }

    @PostMapping("/criar")
    public String criarMissao(){
        return "Missao criada com sucesso";
    }

    @PutMapping("/alterar")
    public String alterarMissao(){
        return "Missao alterada com sucesso";
    }

    @DeleteMapping("deletar")
    public String deletarMissao(){
        return "Missao deletada com sucesso";
    }









}
