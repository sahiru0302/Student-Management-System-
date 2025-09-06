

import java.sql.SQLException;
import java.util.List;

public class StudentService {
    private final StudentData dao = new StudentData();

    public int create(Student s) throws SQLException {

        Validation.requireName(s.getName());
        Validation.requireValidEmail(s.getEmail());
        Validation.requireValidGpa(s.getGpa());

        if (dao.emailExists(s.getEmail(), null)) {
            throw new IllegalArgumentException("Email already exists.");
        }
        return dao.insert(s);
    }

    public boolean update(Student s) throws SQLException {
        Validation.requireName(s.getName());
        Validation.requireValidEmail(s.getEmail());
        Validation.requireValidGpa(s.getGpa());

        if (dao.emailExists(s.getEmail(), s.getId())) {
            throw new IllegalArgumentException("Email already used by another student.");
        }
        return dao.update(s);
    }

    public boolean delete(int id) throws SQLException {
        return dao.delete(id);
    }

    public Student get(int id) throws SQLException { return dao.findById(id); }

    public List<Student> getAll() throws SQLException { return dao.findAll(); }

    public List<Student> searchByName(String q) throws SQLException { return dao.findByNameLike(q); }
}
