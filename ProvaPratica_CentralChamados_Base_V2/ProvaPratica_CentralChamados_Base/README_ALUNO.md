# Prova prática — Central de Chamados de TI

**Projeto inicial:** Spring Boot 3.3.5, Java 21, JPA, MariaDB e Thymeleaf. O objetivo é implementar os pontos marcados `TODO AVALIACAO`.

## Preparação (antes da prova)
1. Instale e inicie MariaDB. Execute `scripts/01_criar_banco.sql`.
2. Ajuste DB_USER e DB_PASSWORD nas variáveis de ambiente (ou no `application.properties`, apenas localmente).
3. Abra a pasta pelo IntelliJ e recarregue o Maven.
4. Execute `CentralChamadosApplication`. Acesse http://localhost:8080/login.
5. Um usuário de teste é criado automaticamente no banco: **aluno / senai123**. A senha é armazenada com hash BCrypt.
6. A conexão, entidades, repositories, templates, interceptor de sessão, criação do usuário e logout estão prontos. O login **não autentica até você implementar a validação**.

## O que implementar
- `LoginController`: validar login e senha com `UsuarioRepository` e BCrypt.
- `ChamadoService`: obter, buscar, cadastrar, atualizar e excluir usando `ChamadoRepository` e `ChamadoDto`.
- `ChamadoController`: retornar as páginas preparadas, enviar os DTOs para o Model e invocar os métodos do Service.

Os pontos incompletos estão marcados com `TODO AVALIACAO`. Não altere os arquivos HTML, Entities, Repositories e controle de sessão.

## Regras
- Status inicial de chamado: ABERTO.
- Status permitidos: ABERTO, EM_ANDAMENTO e CONCLUIDO.
- Título e descrição não podem estar em branco.
- Se um ID não existir, a operação não deve criar registro indevido nem interromper a aplicação.
- Ao sair, a sessão é invalidada; acesso direto a `/chamados` sem sessão redireciona para `/login`.

## Entrega
Envie a pasta do projeto compactada em ZIP, sem `.idea`, `.git`, `target` ou senhas reais. Não é necessário entregar HTML, scripts novos ou documentação adicional.

**Aviso:** este é intencionalmente um projeto incompleto de avaliação. Os endpoints de chamados lançam `UnsupportedOperationException` até serem implementados; a autenticação inicialmente rejeita todos os logins. Essa condição é esperada e não é um defeito de compilação.
