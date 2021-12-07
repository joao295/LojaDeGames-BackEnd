package LojadeGamesBackEnd.LojadeGames.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table (name = "produto")


public class ModelProduto {


@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;


@NotBlank
@Size(min = 4, max = 30)
private String nomedojogo;


@NotBlank
private double preco;


@NotBlank
private long categoria;


public long getId() {
	return id;
}


public void setId(long id) {
	this.id = id;
}


public String getNomedojogo() {
	return nomedojogo;
}


public void setNomedojogo(String nomedojogo) {
	this.nomedojogo = nomedojogo;
}


public double getPreco() {
	return preco;
}


public void setPreco(double preco) {
	this.preco = preco;
}


public long getCategoria() {
	return categoria;
}


public void setCategoria(long categoria) {
	this.categoria = categoria;
}





}
