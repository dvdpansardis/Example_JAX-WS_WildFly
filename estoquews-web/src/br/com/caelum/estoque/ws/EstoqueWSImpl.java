package br.com.caelum.estoque.ws;

import java.util.Arrays;

import javax.jws.WebService;

@WebService(endpointInterface = "br.com.caelum.estoque.ws.EstoqueWS", serviceName = "EstoqueWS", portName = "EstoqueWSPort")
public class EstoqueWSImpl implements EstoqueWS {

	@Override
	public ListaItens todosOsItens(Filtros filtros) {
		System.out.println("Chamando todos os itens");
		ListaItens listaItens = new ListaItens();
		listaItens.item = Arrays.asList(getItem());
		return listaItens;
	}

	@Override
	public CadastrarItemResponse cadastrarItem(CadastrarItem parameters, TokenUsuario tokenUsuario)
			throws AutorizacaoFault {
		System.out.println("Chamando cadastrarItem");
		CadastrarItemResponse resposta = new CadastrarItemResponse();
		resposta.setItem(getItem());
		return resposta;
	}

	private Item getItem() {
		Item item = new Item();
		item.setCodigo("ABC");
		item.setNome("Livro ABC");
		item.setQuantidade(1000);
		item.setTipo("Livro");
		return item;
	}

}
