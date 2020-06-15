package ru.job4j.accident.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Component;
import ru.job4j.accident.model.Accident;
import ru.job4j.accident.utils.HibernateUtils;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

@Component
public class AccidentRepository {
    private Session session;

    public List<Accident> getAll() {
        CriteriaBuilder cb = session.getCriteriaBuilder();
        CriteriaQuery<Accident> criteria = cb.createQuery(Accident.class);
        Root<Accident> userRoot = criteria.from(Accident.class);
        criteria.select(userRoot);
        return session.createQuery(criteria).getResultList();
    }

    public void openConnection() {
        SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
        session = sessionFactory.openSession();
    }

    public void closeConnection() {
        if (session != null) {
            session.close();
        }
    }
}
