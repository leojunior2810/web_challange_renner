#language: pt
#encoding: utf-8
#@run

  Funcionalidade: Adicionar Produtos
                  Eu quero fazer a compra de ao menos três produtos,
                  Para que eu possa estar bem vestida

    Contexto:
      Dado que tenha um usuário cadastrado no site

      @run
      Esquema do Cenario: Cenario: Cenario: Adicionar 3 produtos
        Quando pesquiso pelo produto "<nome_produto>"
        Entao devo clicar para adicionar ao carrinho
        Exemplos:
        | nome_produto                             |
        | Stylish Dress                            |
        |Beautiful Peacock Blue Cotton Linen Saree |
        | Men Tshirt                               |