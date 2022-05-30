INSERT INTO employee(first_name, last_name, email) VALUES ('Isabel', 'Mantovani', 'imantovani@outlook.com');

INSERT INTO customer(name, cpf, telephone, telephone_For_Messages, cep, street_Name, number, neighborhood, city) VALUES ('Diego Dias Figueira', '29947464920', '16 99322-5544', '16 99888-2222', '14820-083', 'Rua Bento de Abreu', 62, 'Santa Angelina', 'Araraquara');
INSERT INTO customer(name, cpf, telephone, telephone_For_Messages, cep, street_Name, number, neighborhood, city) VALUES ('Mariana Valério', '85506777019', '16 99333-4444', '16 99777-6161', '14801-390', 'Rua 10', 2307, 'Centro', 'Araraquara');
INSERT INTO customer(name, cpf, telephone, telephone_For_Messages, cep, street_Name, number, neighborhood, city) VALUES ('Maria Pontes Silva', '11057216631', '16 99333-2121', '16 99771-5666', '15995-042', 'Rua Dorival Pereira Ribeiro' , 158, 'Jardim Santa Rosa', 'Matão');

INSERT INTO pet(specie, name, birth_date, breed, gender, customer_id) VALUES ('DOG', 'Bisteca', '2020-09-12', 'SRD', 'FEMALE', 1);
INSERT INTO pet(specie, name, birth_date, breed, gender, customer_id) VALUES ('DOG', 'Pipoca', '2019-11-04', 'SRD', 'FEMALE', 2);
INSERT INTO pet(specie, name, birth_date, breed, gender, customer_id) VALUES ('CAT', 'Rico', '2018-01-04', 'SRD', 'MALE', 3);
INSERT INTO pet(specie, name, birth_date, breed, gender, customer_id) VALUES ('CAT', 'Bolinha', '2016-09-05', 'SRD', 'MALE', 3);

INSERT INTO consultation(date_time, description, diagnosis, customer_id, pet_id) VALUES ('2022-3-25 14:00:00', 'Aplicação de vacina antirrábica', '', 1, 1);
INSERT INTO consultation(date_time, description, diagnosis, customer_id, pet_id) VALUES ('2022-3-26 15:00:00', 'Aplicação de vacina antirrábica', '', 3, 4);