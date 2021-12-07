package LojadeGamesBackEnd.LojadeGames.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import LojadeGamesBackEnd.LojadeGames.model.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
	public List<Categoria> findByDescricaoContainingIgnoreCase(String descricao);

	public Categoria findById(long id);
}
