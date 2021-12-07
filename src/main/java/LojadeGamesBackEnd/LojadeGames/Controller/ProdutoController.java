package LojadeGamesBackEnd.LojadeGames.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import LojadeGamesBackEnd.LojadeGames.model.ModelProduto;
import LojadeGamesBackEnd.LojadeGames.repository.ProdutoRepository;

@RestController
@RequestMapping("/produto")
@CrossOrigin("*")

public class ProdutoController {

	@Autowired
	private ProdutoRepository repository;

	@GetMapping("/all")
	public List<ModelProduto> getAll() {
		return repository.findAll();
	}

	@GetMapping("/id/{id}")
	public ModelProduto findById(@PathVariable long id) {
		return repository.getById(id);
	}

	@GetMapping("/descricao/{descricao}")
	public List<ModelProduto> findByDescricaoContainingIgnoreCase(@PathVariable String descricao) {
		return repository.findByDescricaoContainingIgnoreCase(descricao);
	}

	@PostMapping("/save")
	public ModelProduto post(@RequestBody ModelProduto produto) {
		return repository.save(produto);
	}

	@PutMapping("/update")
	public ModelProduto put(@RequestBody ModelProduto produto) {
		return repository.save(produto);
	}

	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable long id) {
		repository.deleteById(id);
	}
}
