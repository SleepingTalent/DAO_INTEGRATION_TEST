DROP TABLE IF EXISTS employee;

CREATE TABLE employee (
          id INT NOT NULL AUTO_INCREMENT,
          employeeId INT NOT NULL,
          firstname VARCHAR(100),
          lastname VARCHAR(100),
          dataOfBirth DATE,
          PRIMARY KEY (id)
        );

DROP INDEX employee_id_index ON employee;

CREATE INDEX employee_id_index ON employee (employeeId);

DROP INDEX employee_lastname_index ON employee;

CREATE INDEX employee_lastname_index ON employee (lastname);

DROP TABLE IF EXISTS address;

CREATE TABLE address (
  id INT NOT NULL AUTO_INCREMENT,
  employee INT NOT NULL,
  houseNumber VARCHAR(100) NOT NULL,
  addressFirstLine VARCHAR(100),
  addressSecondLine VARCHAR(100),
  townCity VARCHAR(100),
  postCode VARCHAR(100) NOT NULL,
  PRIMARY KEY (id),
  FOREIGN KEY (employee)
  REFERENCES employee(id)
);

DROP INDEX address_employee_index ON address;

CREATE INDEX address_employee_index ON address (employee);

DROP INDEX address_postcode_index ON address;

CREATE INDEX address_postcode_index ON address (postCode);

