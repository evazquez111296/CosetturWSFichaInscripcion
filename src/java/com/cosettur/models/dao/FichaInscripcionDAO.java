/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cosettur.models.dao;

import com.cosettur.helpers.FichaInscripcionHelper;
import com.cosettur.helpers.HorarioHelper;
import com.cosettur.models.pojos.FichaInscripcion;
import java.util.Date;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author evazquez
 */
public class FichaInscripcionDAO {
    
    public static int realizar(
            Byte grado,
            Byte semestre,
            short ruta,
            String localidad,
            Byte modalidad,
            Byte ciclo,
            String tutor,
            String tutorado,
            String usuario,
            String telcasa,
            float pago,
            String fecha,
            HorarioHelper[] horario){
        SessionFactory sf=null;
        Session session=null;
        Transaction tx=null;
        int result=0;
        try{
            sf=HibernateUtil.getSessionFactory();
            session=sf.openSession();
            tx=session.beginTransaction();
            Query query=session.createSQLQuery(
                    "INSERT INTO Ficha_Inscripcion "
                    + "(Id_Grado,Semestre,Id_Ruta,Localidad,Id_Modalidad,Id_Ciclo,Tutor,Tutorado,Usuario,Telefono_Casa,Pago,fecha) "
                    + " VALUES (:grado, :semestre, :ruta, :localidad, :modalidad, :ciclo, :tutor, :tutorado, :usuario, :telcasa, :pago, :fecha);"
            );
            query.setParameter("grado", grado);
            query.setParameter("semestre", semestre);
            query.setParameter("ruta", ruta);
            query.setParameter("localidad", localidad);
            query.setParameter("modalidad", modalidad);
            query.setParameter("ciclo", ciclo);
            query.setParameter("tutor", tutor);
            query.setParameter("tutorado", tutorado);
            query.setParameter("usuario", usuario);
            query.setParameter("telcasa", telcasa);  
            query.setParameter("pago", pago);
            query.setParameter("fecha", fecha);
            result=query.executeUpdate();
            tx.commit();
            FichaInscripcionHelper.consultar( fecha, usuario,horario);
            
        }catch(Exception e){
            System.out.println(e);
            tx.rollback();
            result=0;
        }finally{
            session.close();
            return result;
        }      
        
    }
    
}
