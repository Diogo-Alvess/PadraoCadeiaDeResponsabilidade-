Este repositório apresenta a implementação do padrão de projeto Chain of Responsibility em um cenário de atendimento ao cliente em um sistema de suporte técnico. O sistema simula uma cadeia de atendentes responsáveis por resolver solicitações de diferentes níveis de complexidade, encaminhando-as para o próximo nível quando necessário.

A classe Handler atua como o manipulador abstrato, definindo a estrutura para tratamento e encadeamento de solicitações. As classes SuporteBasico, SuporteTecnico e SuporteEspecializado representam os manipuladores concretos, cada um responsável por tratar problemas de determinado nível de dificuldade.

Essa implementação demonstra como o padrão Chain of Responsibility permite o encadeamento dinâmico de responsabilidades, promovendo baixo acoplamento, flexibilidade e facilidade de manutenção em sistemas de atendimento que exigem múltiplos níveis de tratamento.
