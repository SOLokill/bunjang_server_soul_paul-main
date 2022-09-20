package Sessac.ThunderMarket.src.market;

import Sessac.ThunderMarket.src.market.model.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import javax.sql.DataSource;
import java.util.List;

@Repository
public class MarketDao {
    final Logger logger = LoggerFactory.getLogger(this.getClass());
    private EntityManagerFactory emf;
    @Autowired
    public void setDataSource(DataSource dataSource) {
        this.emf = Persistence.createEntityManagerFactory("Default");
    }
    public List<GetMarketRes> getMarkets(){
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        String getMarketsQuery = "select * from market";

        return

    }

    public List<GetMarketRes> getMarketByPhone(String phone){
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        List<em.createQuery("select * from market where phone = ?",Market.class).getResultList();
        String getMarketByPhoneParams = phone;
        try{
            tx.begin();
            getMarketByPhoneMethod(em);
            tx.commit();
        }catch (Exception e){
            logger.debug("query execute is failed");
            tx.rollback();
        }finally {
            em.close();
        }
    }

    private static void getMarketByPhoneMethod(EntityManager em ){

    }
}
