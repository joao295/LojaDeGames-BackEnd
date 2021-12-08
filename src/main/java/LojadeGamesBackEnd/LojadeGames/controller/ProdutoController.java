package LojadeGamesBackEnd.LojadeGames.controller;

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

import LojadeGamesBackEnd.LojadeGames.model.Produto;
import LojadeGamesBackEnd.LojadeGames.repository.ProdutoRepository;

@RestController
@RequestMapping("/produto")
@CrossOrigin("*")

public class ProdutoController {

	@Autowired
	private ProdutoRepository repository;

	@GetMapping("/all")
	public List<Produto> getAll() {
		return repository.findAll();
	}

	@GetMapping("/id/{id}")
	public Produto findById(@PathVariable long id) {
		return repository.getById(id);
	}

	@GetMapping("/descricao/{descricao}")
	public List<Produto> findByDescricaoContainingIgnoreCase(@PathVariable String descricao) {
		return repository.findByDescricaoContainingIgnoreCase(descricao);
	}

	@PostMapping("/save")
	public Produto post(@RequestBody Produto produto) {
		return repository.save(produto);
	}

	@PutMapping("/update")
	public Produto put(@RequestBody Produto produto) {
		return repository.save(produto);
	}

	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable long id) {
		repository.deleteById(id);
	}
}
