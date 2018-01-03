insert into contrato 
(numero    ,objeto                                       ,elemento_de_despesa,numero_Pa_Contrato,numero_Pa_Pagamento,valor_Global,data_Inicio_Vigencia,data_Fim_Vigencia,unidade_Gestora) VALUES
('269/2013','Aquisicao de solucao do tipo data discovery','44.90.39-93'      ,'3389/2013'       ,'8847/2014'        ,1352499.36  ,'2013-12-20'        ,'2017-12-19'     ,'210500000000' )
;


insert into executor 
(matricula,titular,data_inicio ,data_fim,id_contrato) VALUES
('311075' ,'S'    ,'2013-12-20',NULL    ,1          )
;
insert into executor 
(matricula,titular,data_inicio ,data_fim,id_contrato) VALUES
('318524' ,'N'    ,'2013-12-20',NULL    ,1          )
;


insert into tipo_item_contrato 
(id,descricao) VALUES
(1 ,'Bem'    )
;
insert into tipo_item_contrato 
(id,descricao) VALUES
(2 ,'Serviço')
;


insert into item_contrato 
(id_contrato,id_tipo_item_contrato,grupo,numero,descricao                                                                                                                                                                                ,quantidade,valor_unitario) VALUES
(1          ,1                  ,1    ,3     ,'Licença de uso de software em ambiente de produção para publicação e visualização de pelo menos um painel de informações gerenciais para número ilimitado de usuários não identificados',1         ,160097.05    )
;
insert into item_contrato 
(id_contrato,id_tipo_item_contrato,grupo,numero,descricao                                                                                                                      ,quantidade,valor_unitario) VALUES
(1          ,1                  ,1    ,4     ,'Licença de uso de software para gerenciamento de publicação, distribuição e agendamento dos painéis de informações gerenciais',1         ,86845.68     )
;
insert into item_contrato 
(id_contrato,id_tipo_item_contrato,grupo,numero,descricao                                                                                                                                                                            ,quantidade,valor_unitario) VALUES
(1          ,1                  ,1    ,5     ,'Licença de uso de software para usuário identificado que permita a criação, atualização e visualização de número ilimitado de painéis de informações gerenciais, ou licença similar',20        ,3096.69      )
;
insert into item_contrato 
(id_contrato,id_tipo_item_contrato,grupo,numero,descricao                                                                                                                                              ,quantidade,valor_unitario) VALUES
(1          ,1                  ,1    ,6     ,'Licença de uso de software para usuário identificado que permita a visualização de pelo menos um painel de informações gerenciais, ou licença similar',67        ,792.22       )
;
insert into item_contrato 
(id_contrato,id_tipo_item_contrato,grupo,numero,descricao                                                                                                                           ,quantidade,valor_unitario) VALUES
(1          ,1                  ,1    ,7     ,'Turma de treinamento para desenvolvimento de painéis de informação, com até 12 alunos e carga horária mínima de 24 horas por turma',1         ,13322.92     )
;
insert into item_contrato 
(id_contrato,id_tipo_item_contrato,grupo,numero,descricao                                                                                                                                     ,quantidade,valor_unitario) VALUES
(1          ,1                  ,1    ,8     ,'Turma de treinamentopara gestão de ambiente e administração de infraestrutura, com até 12 alunos e carga horária mínima de 8 horas por turma',1         ,10658.33     )
;
insert into item_contrato 
(id_contrato,id_tipo_item_contrato,grupo,numero,descricao                                                                                                       ,quantidade,valor_unitario) VALUES
(1          ,2                  ,1    ,9     ,'Serviço de suporte técnico e atualização de versão para cada licença de uso de software do item 1 por 36 meses',1         ,43906.08     )
;
insert into item_contrato 
(id_contrato,id_tipo_item_contrato,grupo,numero,descricao                                                                                                       ,quantidade,valor_unitario) VALUES
(1          ,2                  ,1    ,10    ,'Serviço de suporte técnico e atualização de versão para cada licença de uso de software do item 2 por 36 meses',1         ,21953.04     )
;
insert into item_contrato 
(id_contrato,id_tipo_item_contrato,grupo,numero,descricao                                                                                                       ,quantidade,valor_unitario) VALUES
(1          ,2                  ,1    ,11    ,'Serviço de suporte técnico e atualização de versão para cada licença de uso de software do item 3 por 36 meses',1         ,87811.76     )
;
insert into item_contrato 
(id_contrato,id_tipo_item_contrato,grupo,numero,descricao                                                                                                       ,quantidade,valor_unitario) VALUES
(1          ,2                  ,1    ,12    ,'Serviço de suporte técnico e atualização de versão para cada licença de uso de software do item 4 por 36 meses',1         ,47633.99     )
;
insert into item_contrato 
(id_contrato,id_tipo_item_contrato,grupo,numero,descricao                                                                                                       ,quantidade,valor_unitario) VALUES
(1          ,2                  ,1    ,13    ,'Serviço de suporte técnico e atualização de versão para cada licença de uso de software do item 5 por 36 meses',20        ,1609.11      )
;
insert into item_contrato 
(id_contrato,id_tipo_item_contrato,grupo,numero,descricao                                                                                                       ,quantidade,valor_unitario) VALUES
(1          ,2                  ,1    ,14    ,'Serviço de suporte técnico e atualização de versão para cada licença de uso de software do item 6 por 36 meses',67        ,411.26       )
;
insert into item_contrato 
(id_contrato,id_tipo_item_contrato,grupo,numero,descricao                         ,quantidade,valor_unitario) VALUES
(1          ,2                  ,1    ,15    ,'Serviço de suporte especializado',1000      ,187.51       )
;




