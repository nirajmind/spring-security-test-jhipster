package niraj.code.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * A Employee.
 */
@Entity
@Table(name = "employee")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@SuppressWarnings("common-java:DuplicatedBlocks")
public class Employee implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    @Column(name = "id")
    private Long id;

    @Column(name = "employee_id")
    private Long employeeId;

    @Column(name = "employee_name")
    private String employeeName;

    @Column(name = "title")
    private String title;

    @Column(name = "business_unit")
    private String businessUnit;

    @Column(name = "place")
    private String place;

    @Column(name = "supervisor_id")
    private Long supervisorId;

    @Column(name = "competencies")
    private String competencies;

    @Column(name = "salary")
    private Double salary;

    // jhipster-needle-entity-add-field - JHipster will add fields here

    public Long getId() {
        return this.id;
    }

    public Employee id(Long id) {
        this.setId(id);
        return this;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getEmployeeId() {
        return this.employeeId;
    }

    public Employee employeeId(Long employeeId) {
        this.setEmployeeId(employeeId);
        return this;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return this.employeeName;
    }

    public Employee employeeName(String employeeName) {
        this.setEmployeeName(employeeName);
        return this;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getTitle() {
        return this.title;
    }

    public Employee title(String title) {
        this.setTitle(title);
        return this;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBusinessUnit() {
        return this.businessUnit;
    }

    public Employee businessUnit(String businessUnit) {
        this.setBusinessUnit(businessUnit);
        return this;
    }

    public void setBusinessUnit(String businessUnit) {
        this.businessUnit = businessUnit;
    }

    public String getPlace() {
        return this.place;
    }

    public Employee place(String place) {
        this.setPlace(place);
        return this;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public Long getSupervisorId() {
        return this.supervisorId;
    }

    public Employee supervisorId(Long supervisorId) {
        this.setSupervisorId(supervisorId);
        return this;
    }

    public void setSupervisorId(Long supervisorId) {
        this.supervisorId = supervisorId;
    }

    public String getCompetencies() {
        return this.competencies;
    }

    public Employee competencies(String competencies) {
        this.setCompetencies(competencies);
        return this;
    }

    public void setCompetencies(String competencies) {
        this.competencies = competencies;
    }

    public Double getSalary() {
        return this.salary;
    }

    public Employee salary(Double salary) {
        this.setSalary(salary);
        return this;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Employee)) {
            return false;
        }
        return id != null && id.equals(((Employee) o).id);
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "Employee{" +
            "id=" + getId() +
            ", employeeId=" + getEmployeeId() +
            ", employeeName='" + getEmployeeName() + "'" +
            ", title='" + getTitle() + "'" +
            ", businessUnit='" + getBusinessUnit() + "'" +
            ", place='" + getPlace() + "'" +
            ", supervisorId=" + getSupervisorId() +
            ", competencies='" + getCompetencies() + "'" +
            ", salary=" + getSalary() +
            "}";
    }
}
