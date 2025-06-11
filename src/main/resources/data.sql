CREATE TABLE IF NOT EXISTS task (
  id BIGINT PRIMARY KEY,
  title VARCHAR(255),
  description VARCHAR(255),
  completed BOOLEAN
);

INSERT INTO task (id, title, description, completed) VALUES (1, 'Estudar Spring Boot', 'Fazer os testes', false);
INSERT INTO task (id, title, description, completed) VALUES (2, 'Criar testes de integração', 'Cobrir o controller com MockMvc', false);
INSERT INTO task (id, title, description, completed) VALUES (3, 'Revisar código', 'Aplicar princípios de clean code', false);
INSERT INTO task (id, title, description, completed) VALUES (4, 'Preparar apresentação', 'Focar nos casos de uso principais', false);
INSERT INTO task (id, title, description, completed) VALUES (5, 'Configurar ambiente de testes', 'Separar application.yml e application-test.yml', true);
