package co.edu.poli.ces3.employees.dao;

import co.edu.poli.ces3.employees.models.Employee;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional
public class EmployeesImpl implements EmployeeDao {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Employee> getEmployees() {
        String query = "FROM Employee";
        return entityManager.createQuery(query).getResultList();
    }
}
