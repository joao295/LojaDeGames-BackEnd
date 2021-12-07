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

import LojadeGamesBackEnd.LojadeGames.model.Categoria;
import LojadeGamesBackEnd.LojadeGames.repository.CategoriaRepository;

@RestController
@RequestMapping("/categoria")
@CrossOrigin("*")

public class CategoriaController {

	@Autowired
	private CategoriaRepository repository;

	@GetMapping("/all")
	public List<Categoria> getAll() {
		return repository.findAll();
	}

	@GetMapping("/id/{id}")
	public Categoria findByIdCategoria(@PathVariable long id) {
		return repository.getById(id);
	}

	@GetMapping("/descricao/{descricao}")
	public List<Categoria> findByDescricaoContainingIgnoreCase(@PathVariable String descricao) {
		return repository.findByDescricaoContainingIgnoreCase(descricao);
	}

	@PostMapping("/save")
	public Categoria post(@RequestBody Categoria categoria) {
		return repository.save(categoria);
	}

	@PutMapping("/update")
	public Categoria put(@RequestBody Categoria categoria) {
		return repository.save(categoria);
	}

	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable long id) {
		repository.deleteById(id);
	}

}
