package LojadeGamesBackEnd.LojadeGames.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import LojadeGamesBackEnd.LojadeGames.model.Produto;

	@Repository
	public interface ProdutoRepository extends JpaRepository<Produto, Long>{
		public List<Produto> findByDescricaoContainingIgnoreCase( String descricao);
	
}
