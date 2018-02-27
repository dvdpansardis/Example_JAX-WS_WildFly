package br.com.caelum.estoque.client;

public class TesteServicoWeb {

	public static void main(String[] args) {
		EstoqueWS cliente = new EstoqueWS_Service().getEstoqueWSPort();
		System.out.println(cliente);
		
		Filtros filtros = new Filtros();
		Filtro filtro = new Filtro();
		filtro.setNome("ABC");
		filtro.setTipo("Livro");
		filtros.getFiltro().add(filtro);
		ListaItens itens = cliente.todosOsItens(filtros);
		
		System.out.println(itens.getItem().get(0).getNome());
	}
	
}
