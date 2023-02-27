package com.techelevator.projects.dao;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.techelevator.projects.model.Employee;
import org.springframework.jdbc.support.rowset.SqlRowSet;

public class JdbcEmployeeDao implements EmployeeDao {

	private final JdbcTemplate jdbcTemplate;

	public JdbcEmployeeDao(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> employees = new ArrayList<>();
		String sql = "SELECT * FROM employee;";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sql);
		while (results.next()) {
			employees.add(mapRowToEmployee(results));
		}
		return employees;
	}

	@Override
	public List<Employee> searchEmployeesByName(String firstNameSearch, String lastNameSearch) {
		List<Employee> employees = new ArrayList<>();
//		String wildcards = "%";
//		String searchWord = "?";
//		String sql = "SELECT * FROM employee WHERE first_name ILIKE '" +
//				searchWord + wildcards + "' OR last_name ILIKE '" + searchWord + wildcards + "';";
		String sql = "SELECT * FROM employee WHERE first_name ILIKE ? AND last_name ILIKE ?;";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sql, "%" + firstNameSearch + "%", "%" + lastNameSearch + "%");
		while (results.next()) {

			employees.add(mapRowToEmployee(results));
		}
		return employees;
	}

	@Override
	public List<Employee> getEmployeesByProjectId(int projectId) {
		List<Employee> employees = new ArrayList<>();
		String sql = "SELECT * FROM employee e " +
				"JOIN project_employee pe ON e.employee_id = pe.employee_id " +
				"WHERE project_id = ?;";
//
		SqlRowSet results = jdbcTemplate.queryForRowSet(sql, projectId);
		while (results.next()) {
			employees.add(mapRowToEmployee(results));
		}
		return employees;
	}

	@Override
	public void addEmployeeToProject(int projectId, int employeeId) {
//		List<Employee> employees = new ArrayList<>();
		String sql = "INSERT INTO project_employee (project_id, employee_id) " +
				"VALUES (?, ?);";
		jdbcTemplate.update(sql, projectId, employeeId);
//		SqlRowSet results = jdbcTemplate.queryForRowSet(sql);
//		employees.add(mapRowToEmployee(results));


	}

	@Override
	public void removeEmployeeFromProject(int projectId, int employeeId) {
		String deleteProjectSql = "DELETE FROM project_employee WHERE employee_id = ?;";
		jdbcTemplate.update(deleteProjectSql, employeeId);

	}

	@Override
	public List<Employee> getEmployeesWithoutProjects() {
		List<Employee> employees = new ArrayList<>();
		String sql = "SELECT * FROM employee " +
				"WHERE employee_id NOT IN (SELECT employee_id FROM project_employee);";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sql);
		if (results.next()) {
			employees.add(mapRowToEmployee(results));
		}

		return employees;
	}

	private Employee mapRowToEmployee(SqlRowSet rowSet) {
		Employee employee = new Employee();
		employee.setId(rowSet.getInt("employee_id"));
		employee.setDepartmentId(rowSet.getInt("department_id"));
		employee.setFirstName(rowSet.getString("first_name"));
		employee.setLastName(rowSet.getString("last_name"));
		if (rowSet.getDate("birth_date") != null) {
			employee.setBirthDate(rowSet.getDate("birth_date").toLocalDate());
		}
		if (rowSet.getDate("hire_date") != null) {
			employee.setHireDate(rowSet.getDate("hire_date").toLocalDate());
		}

		return employee;
	}



}
