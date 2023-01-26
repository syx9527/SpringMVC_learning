CREATE DATABASE IF NOT EXISTS `mybatis_example`;

USE `mybatis_example`;

CREATE TABLE IF NOT EXISTS `t_emp`
(
    emp_id     INT AUTO_INCREMENT,
    emp_name   CHAR(100),
    emp_salary DOUBLE(10, 5),
    PRIMARY KEY (emp_id)
);

INSERT INTO `t_emp`(emp_name, emp_salary)
VALUES ('tom', 200.33);
INSERT INTO `t_emp`(emp_name, emp_salary)
VALUES ('jerry', 666.66);
INSERT INTO `t_emp`(emp_name, emp_salary)
VALUES ('andy', 777.77);