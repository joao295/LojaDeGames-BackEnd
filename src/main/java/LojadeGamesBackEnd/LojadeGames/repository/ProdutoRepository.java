package LojadeGamesBackEnd.LojadeGames.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import LojadeGamesBackEnd.LojadeGames.model.ModelProduto;

	@Repository
	public interface ProdutoRepository extends JpaRepository<ModelProduto, Long>{
		public List<ModelProduto> findByDescricaoContainingIgnoreCase( String descricao);
	
}
